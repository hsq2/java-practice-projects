package components;

import java.awt.*;

public class Ball {

    private int STARTING_POS_X = 120;
    private int STARTING_POS_Y = 350;

    private int STARTING_DIR_X = 1;
    private int STARTING_DIR_Y = 2;

    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;

    private final Position position;
    private final Direction direction;
    private final Size size;
    private final Color color;


    public Ball() {
        this.position = new Position(STARTING_POS_X, STARTING_POS_Y);
        this.direction = new Direction(STARTING_DIR_X, -STARTING_DIR_Y);
        this.color = new Color(102, 255, 255);
        this.size = new Size(WIDTH, HEIGHT);
    }


    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }




}
