package com.thg.accelerator.tictactoe.board;

import com.thg.accelerator.tictactoe.gamehandler.GameChecker;

public class Board {

    private final int rows = 3;
    private final int columns = 3;
//    private Symbol[][] board;
//
//    public Board(Symbol[][] board) {
//        this.board = board;
//    }

    //    private final char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
   private final Symbol[][] board = {{Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL},
            {Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL},
            {Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL}};

//    public void initialiseBoard() {
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                board[i][j] = Symbol.EMPTY_CELL;
//            }
//        }
//    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(Symbol.TABLE_LINE);
                }
            }
            System.out.println();
        }
    }

    public Symbol[][] getBoard() {
        return board;
    }
}
