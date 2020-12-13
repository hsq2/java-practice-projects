import components.Ball;
import components.Paddle;

public class Game {

    private boolean gameRunning = false;
    private int score = 0;
    private final int totalBricks = 21;
    Paddle paddle;
    Ball ball;

    public Game(Paddle paddle, Ball ball) {
        this.paddle = paddle;
    }

    public boolean isGameRunning() {
        return gameRunning;
    }

    public Game setGameRunning(boolean gameRunning) {
        this.gameRunning = gameRunning;
        return this;
    }

    public int getScore() {
        return score;
    }

    public Game setScore(int score) {
        this.score = score;
        return this;
    }

    public int getTotalBricks() {
        return totalBricks;
    }


}
