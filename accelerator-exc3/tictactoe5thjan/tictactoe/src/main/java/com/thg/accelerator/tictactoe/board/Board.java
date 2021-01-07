package com.thg.accelerator.tictactoe.board;

import com.thg.accelerator.tictactoe.gamehandler.GameChecker;

public class Board {

    private final int rows = 3;
    private final int columns = 3;
    Symbol[][] board;

    public Board(Symbol[][] board) {
        this.board = board;
    }

    //    private final char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
//    private final BoardSymbol[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    public void initialiseBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = Symbol.EMPTY_CELL;
            }
        }
    }

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

    GameChecker gameChecker = new GameChecker();

//    public void printBoard() {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                System.out.print(board[i][j]);
//                if (j < 2) {
//                    System.out.print(" | ");
//                }
//            }
//            System.out.println();
//        }
//    }

    public Symbol[][] getBoard() {
        return board;
    }
}
