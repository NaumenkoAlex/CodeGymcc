package com.codegym.games.minesweeper;

import com.codegym.engine.cell.Color;
import com.codegym.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 20;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private int countFlags;
    private boolean isGameStopped;
    private int countClosedTiles = SIDE * SIDE;
    private int score;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(5) < 2;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.LIGHTCYAN);
                setCellValue(x, y, "");
            }
        }

        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors(){
        for (int y = 0; y < SIDE; y++ ){
            for (int x = 0; x < SIDE; x++){
                GameObject check = gameField[y][x];
                if (!check.isMine){
                    for(GameObject g:getNeighbors(gameField[y][x])){
                        if (g.isMine)
                            gameField[y][x].countMineNeighbors++;
                    }

                }

            }
        }
    }


    private void openTile(int x, int y) {
        GameObject cell = gameField[y][x];
        if (cell.isMine && !isGameStopped && !cell.isFlag && !cell.isOpen) {
            setCellValueEx(x,y,Color.TOMATO,MINE);
            gameOver();
        } else if (!isGameStopped && !cell.isFlag && !cell.isOpen){
            cell.isOpen = true;
            setScore(score+=5);
            countClosedTiles--;
            setCellColor(x,y,Color.CYAN);
            if (cell.countMineNeighbors==0){
                setCellValue(x,y,"");
                for(GameObject stuff : getNeighbors(cell)){
                    if(!stuff.isOpen && !stuff.isMine ){
                        openTile(stuff.x,stuff.y);
                    }
                }
            } else {
                setCellNumber(x,y,cell.countMineNeighbors);
            }
        }
        if(countClosedTiles == countMinesOnField){
            win();
        }


    }


    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped){
            restart();
            return;
        }

        openTile(x, y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void markTile(int x, int y){
        GameObject go = gameField[y][x];

        if (isGameStopped) return;

        if (go.isOpen) return;

        if (countFlags == 0 && !go.isFlag) return;

        if(!go.isFlag){
            go.isFlag = true;
            countFlags--;
            setCellValue(go.x, go.y, FLAG);
            setCellColor(go.x, go.y, Color.LIGHTSTEELBLUE);
        }
        else{
            go.isFlag = false;
            countFlags++;
            setCellValue(go.x, go.y, "");
            setCellColor(go.x, go.y, Color.ORANGE);
        }



    }

    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.MIDNIGHTBLUE, "GAME OVER", Color.ORANGERED, 75);
    }

    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.MIDNIGHTBLUE, "YOU WIN", Color.ORANGERED, 75);
    }

    private void restart(){
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        countMinesOnField = 0;
        score = 0;
        setScore(score);
        createGame();
    }

}