package com.thg.accelerator.tictactoe.player.impl.strategy;

import com.thg.accelerator.tictactoe.player.Position;
import com.thg.accelerator.tictactoe.gamehandler.GameChecker;
import com.thg.accelerator.tictactoe.gamehandler.GameHandler;
import com.thg.accelerator.tictactoe.player.Player;

import java.util.Random;

public class Master implements Strategy {
    private final Random random = new Random();
    private final Player computer;

    private GameChecker gameChecker;
    private GameHandler gameHandler;

    public Master(Player computer) {
        this.computer = computer;
    }

    private int generateRandomMove() {
        return random.nextInt(3);
    }

//
//    public int minimax(int depth) { //NEED TO FINISH IMPL
//        if (gameChecker.hasWon(Symbol.CROSS) {
//            return 1;
//        }
//        if (gameChecker.hasWon(Symbol.CIRCLE)) {
//            return -1;
//        }
//
//        if (!gameHandler.getArrayOfEmptyCells().equals(Symbol.EMPTY_CELL)) {
//            return 0;
//        }
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MAX_VALUE;
//
//        for (int i = 0; i < gameHandler.getArrayOfEmptyCells().length; i++) {
//            for (int j = 0; j < gameHandler.getArrayOfEmptyCells()[j].length; j++) {
//                Position p = gameHandler.getArrayOfEmptyCells()[i][j];
//
//            }
//        }
//    }

    @Override
    public Position makeMove() {
        System.out.println("MASTER DIFFICULTY");
        int row = generateRandomMove();
        int col = generateRandomMove();
        return computer.makeMove(row, col);
    }
}
