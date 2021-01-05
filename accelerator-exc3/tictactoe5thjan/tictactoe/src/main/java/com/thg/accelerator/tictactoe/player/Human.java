package com.thg.accelerator.tictactoe.player;

import com.thg.accelerator.tictactoe.GameChecker;
import com.thg.accelerator.tictactoe.Position;

public class Human implements Player {

    GameChecker gameChecker = new GameChecker();
    char symbol = 'X';



    @Override
    public Position makeMove(char[][] board, int row, int col) {
        if (gameChecker.isValid(board, row, col)) {
            board[row][col] = 'X';

        } else {
            System.out.println("invalid space");
        }

        return new Position(row, col, getSymbol());
    }

    public char getSymbol() {
        return symbol;
    }
}
