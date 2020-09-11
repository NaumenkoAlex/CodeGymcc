package com.codegym.games.snake;

import com.codegym.engine.cell.*;

public class SnakeGame extends Game {
    public static final int WIDTH = 15;
    public static final int HEIGHT= 15;
    private static final int GOAL = 28;

    private int turnDelay;
    private int score;
    private Snake snake;
    private Apple apple;
    private boolean isGameStopped;


    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        showGrid(false);
        createGame();
    }

    private void createGame(){
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        score = 0;
        setScore(score);
        isGameStopped = false;
        turnDelay = 300;
        setTurnTimer(turnDelay);

        drawScene();
    }

    private void drawScene(){
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellValueEx(x, y, Color.DARKSLATEGRAY, "");
            }
        }

        snake.draw(this);
        apple.draw(this);
    }

    private void win(){
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.MIDNIGHTBLUE, "YOU WIN", Color.ORANGERED, 75);
    }


    private void gameOver(){
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.MIDNIGHTBLUE, "GAME OVER", Color.ORANGERED, 75);
    }

    @Override
    public void onTurn(int step) {
        snake.move(apple);
        if (!apple.isAlive) {
            createNewApple();
            score += 5;
            setScore(score);
            turnDelay -= 10;
            setTurnTimer(turnDelay);
        }

        if(!snake.isAlive)
            gameOver();

        if (snake.getLength() > GOAL)
            win();

        drawScene();
    }

    @Override
    public void onKeyPress(Key key) {
        switch (key){
            case LEFT:
                snake.setDirection(Direction.LEFT);
                break;
            case RIGHT:
                snake.setDirection(Direction.RIGHT);
                break;
            case UP:
                snake.setDirection(Direction.UP);
                break;
            case DOWN:
                snake.setDirection(Direction.DOWN);
                break;
            case SPACE:
                if (isGameStopped)
                    createGame();

                break;
        }
    }

    private void createNewApple(){
        apple = new Apple(getRandomNumber(WIDTH), getRandomNumber(HEIGHT));
        while (snake.checkCollision(apple))
            apple = new Apple(getRandomNumber(WIDTH), getRandomNumber(HEIGHT));
    }
}
