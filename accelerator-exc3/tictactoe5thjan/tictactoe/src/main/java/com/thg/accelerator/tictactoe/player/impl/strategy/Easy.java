package com.thg.accelerator.tictactoe.player.impl.strategy;

import com.thg.accelerator.tictactoe.player.Position;
import com.thg.accelerator.tictactoe.player.Player;

import java.util.Random;

public class Easy implements Strategy {

    private final Random random = new Random();
    private final Player computer;

    public Easy(Player computer) {
        this.computer = computer;
    }

    private int generateRandomMove() {
        return random.nextInt(3);
    }

    @Override
    public Position makeMove() {
        System.out.println("EASY MODE");
        int row = generateRandomMove();
        int col = generateRandomMove();
        return computer.makeMove(row, col);
    }

}
