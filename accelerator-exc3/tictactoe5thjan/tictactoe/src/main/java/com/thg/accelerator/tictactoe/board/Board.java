package com.thg.accelerator.tictactoe.board;

import com.thg.accelerator.tictactoe.gamehandler.GameChecker;

public class Board {

    private final int rows = 3;
    private final int columns = 3;
    private BoardSymbol[][] board;


    //    private final char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
//    private final BoardSymbol[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    public void initialiseBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = BoardSymbol.EMPTY;
            }
        }
    }

    public void printBoard() {
        initialiseBoard();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(board[i][j]);
                if (j < 2) {
                    System.out.println(BoardSymbol.TABLE_LINES);
                }
            }
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

    public BoardSymbol[][] getBoard() {
        return board;
    }
}
