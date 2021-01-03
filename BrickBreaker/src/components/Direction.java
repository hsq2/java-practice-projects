package components;

public class Direction {

    private int dirX;
    private int dirY;

    public Direction(int dirX, int dirY) {
        this.dirX = dirX;
        this.dirY = dirY;
    }

    public int getDirX() {
        return dirX;
    }

    public Direction setDirX(int dirX) {
        this.dirX = dirX;
        return this;
    }

    public int getDirY() {
        return dirY;
    }

    public Direction setDirY(int dirY) {
        this.dirY = dirY;
        return this;
    }
}
