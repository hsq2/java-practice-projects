package com.thg.accelerator.tictactoe.player.computer.difficulty;

import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.player.Player;

import java.util.Random;

public class Novice implements Strategy{
    private final Random random = new Random();
    private final Player computer;

    public Novice(Player computer) {
        this.computer = computer;
    }

    private int generateRandomMove() {
        return random.nextInt(3);
    }

    @Override
    public Position makeMove() {
        System.out.println("This is novice difficulty");
        int row = generateRandomMove();
        int col = generateRandomMove();
        return computer.makeMove(row, col);
    }
}
