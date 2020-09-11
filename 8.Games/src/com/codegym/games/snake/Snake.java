package com.codegym.games.snake;

import com.codegym.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake{
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;


    public Snake(int x, int y) {
        for (int i = 0; i < 3; i++) {
            GameObject gameObject = new GameObject(x + i, y);
            snakeParts.add(gameObject);
        }
    }

    public void move(Apple apple){
        GameObject head = createNewHead();
        if (head.x >= SnakeGame.WIDTH || head.x < 0 || head.y < 0 || head.y >= SnakeGame.HEIGHT || checkCollision(head)){
            this.isAlive = false;
            return;
        }

        snakeParts.add(0, head);
        if (head.x == apple.x && head.y == apple.y)
            apple.isAlive = false;
        else
            removeTail();


    }


    public void draw(Game game){
        Color snakeColor = isAlive ? Color.LIME : Color.RED;

        game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, snakeColor, 75);

        for (int i = 1; i < snakeParts.size(); i++) {
            game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, snakeColor, 75);
        }
    }

    public boolean checkCollision(GameObject object){
        for (int i = 0; i < snakeParts.size(); i++) {
            if (object.x == snakeParts.get(i).x && object.y == snakeParts.get(i).y) {
                return true;
            }
        }
        return false;
    }

    public GameObject createNewHead(){
        GameObject currentHead = snakeParts.get(0);
        GameObject newHead;

        switch (direction){
            case LEFT:
                newHead = new GameObject(currentHead.x - 1, currentHead.y);
                break;
            case RIGHT:
                newHead = new GameObject(currentHead.x + 1, currentHead.y);
                break;
            case UP:
                newHead = new GameObject(currentHead.x, currentHead.y - 1);
                break;
            case DOWN:
                newHead = new GameObject(currentHead.x, currentHead.y + 1);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }

        return newHead;
    }

    public void removeTail(){
        snakeParts.remove(snakeParts.get(snakeParts.size() - 1));
    }


    public void setDirection(Direction direction) {
        if (this.direction == Direction.LEFT && (direction == Direction.RIGHT || snakeParts.get(0).x == snakeParts.get(1).x))
            return;

        if (this.direction == Direction.RIGHT && (direction == Direction.LEFT || snakeParts.get(0).x == snakeParts.get(1).x))
            return;

        if (this.direction == Direction.UP && (direction == Direction.DOWN || snakeParts.get(0).y == snakeParts.get(1).y))
            return;

        if (this.direction == Direction.DOWN && (direction == Direction.UP || snakeParts.get(0).y == snakeParts.get(1).y))
            return;

        this.direction = direction;
    }

    public int getLength(){
        return snakeParts.size();
    }
}
