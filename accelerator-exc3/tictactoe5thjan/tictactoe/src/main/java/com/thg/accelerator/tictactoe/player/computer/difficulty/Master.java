package com.thg.accelerator.tictactoe.player.computer.difficulty;

import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.board.Symbol;
import com.thg.accelerator.tictactoe.gamehandler.GameHandler;
import com.thg.accelerator.tictactoe.player.Player;

import java.util.Random;

public class Master implements Strategy {
    private final Random random = new Random();
    private final Player computer;
    private final GameHandler gameHandler = new GameHandler()

    public Master(Player computer) {
        this.computer = computer;
    }

    private int generateRandomMove() {
        return random.nextInt(3);
    }


    public int minimax(int depth) {
        if ()
    }

    @Override
    public Position makeMove() {
        System.out.println("This is the hardest difficulty");
        int row = generateRandomMove();
        int col = generateRandomMove();
        return computer.makeMove(row, col);
    }
}
