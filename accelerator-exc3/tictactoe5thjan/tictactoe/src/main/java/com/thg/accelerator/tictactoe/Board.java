package com.thg.accelerator.tictactoe;

public class Board {

    private final char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
    GameChecker gameChecker = new GameChecker();

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j =0; j < board.length; j++) {
                System.out.print(board[i][j]);
                if ( j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }



}
