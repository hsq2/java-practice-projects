package components;

import java.awt.*;

public class Ball {

    private int ballposX = 120;
    private int ballposY = 350;
    private int balldirX = -1;
    private int balldirY = -2;
    private final int ballWidth = 10;
    private final int ballHeight = 10;

    public Color getColor() {
        return color;
    }

    private final Color color = new Color(102, 255, 255);

    public int getBallWidth() {
        return ballWidth;
    }

    public int getBallHeight() {
        return ballHeight;
    }


    public int getBallposX() {
        return ballposX;
    }

    public Ball setBallposX(int ballposX) {
        this.ballposX = ballposX;
        return this;
    }

    public int getBallposY() {
        return ballposY;
    }

    public Ball setBallposY(int ballposY) {
        this.ballposY = ballposY;
        return this;
    }

    public int getBalldirX() {
        return balldirX;
    }

    public Ball setBalldirX(int balldirX) {
        this.balldirX = balldirX;
        return this;
    }

    public int getBalldirY() {
        return balldirY;
    }

    public Ball setBalldirY(int balldirY) {
        this.balldirY = balldirY;
        return this;
    }
}
