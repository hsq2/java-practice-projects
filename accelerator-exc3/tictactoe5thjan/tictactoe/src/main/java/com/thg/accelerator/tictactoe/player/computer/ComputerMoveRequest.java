package com.thg.accelerator.tictactoe.player.computer;

import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.player.MoveRequest;
import com.thg.accelerator.tictactoe.player.Player;

import java.util.Random;

public class ComputerMoveRequest implements MoveRequest {

    private final Random random = new Random();
    private final Player computer;

    public ComputerMoveRequest(Player computer) {
        this.computer = computer;
    }

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
