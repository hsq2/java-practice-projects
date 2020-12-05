package components;

import java.awt.*;

public class Player {

    private int playerPosX = 310;
    private final int playerPosY = 550;
    private final int paddleWidth = 100;
    private final int paddleHeight = 8;
    private final Color paddleColor = new Color(255, 255, 255);

    public int getPlayerPosY() {
        return playerPosY;
    }

    public int getPaddleWidth() {
        return paddleWidth;
    }

    public int getPaddleHeight() {
        return paddleHeight;
    }

    public Color getPaddleColor() {
        return paddleColor;
    }

    public Player setPlayerPosX(int playerPosX) {
        this.playerPosX = playerPosX;
        return this;
    }


    public int getPlayerPosX() {
        return playerPosX;
    }

    public int moveRight() {
        return playerPosX += 20;
    }

    public int moveLeft() {
        return playerPosX -= 20;
    }

}
