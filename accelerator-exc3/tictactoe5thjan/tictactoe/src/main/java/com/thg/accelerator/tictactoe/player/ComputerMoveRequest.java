package com.thg.accelerator.tictactoe.player;

import com.thg.accelerator.tictactoe.Position;
import java.util.Random;

public class ComputerMoveRequest implements MoveRequest {

    private final Random random = new Random();
    private final Player computer = new Computer();

    private int generateRandomMove() {
        return random.nextInt(3);
    }

    @Override
    public Position requestMove() {
        int row = generateRandomMove();
        int col = generateRandomMove();
        return computer.makeMove(row, col);
    }
}
