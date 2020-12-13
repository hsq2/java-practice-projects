package components;

import java.awt.*;

public class Paddle {

    private static int STARTING_POS_X = 310;
    private static final int STARTING_POS_Y = 550;

    private static final int WIDTH = 100;
    private static final int HEIGHT = 8;

    private final Position position;
    private final Size size;
    private final Color color;

    public Paddle() {

        this.position = new Position(STARTING_POS_X, STARTING_POS_Y);
        this.size = new Size(WIDTH, HEIGHT);
        this.color = new Color(255, 255, 255);
    }

    public Position getPosition() {
        return position;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }


    public int moveRight() {
        return getPosition().setPosX(getPosition().getPosX() + 20).getPosX();
    }


    public int moveLeft() {
        return getPosition().setPosX(getPosition().getPosX() - 20).getPosX();
    }

}
