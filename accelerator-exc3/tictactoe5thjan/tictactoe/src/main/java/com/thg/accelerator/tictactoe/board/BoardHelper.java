package com.thg.accelerator.tictactoe.board;

public class BoardHelper {

Board board;

    public BoardHelper(Board board) {
        this.board = board;
    }



    public void printBoard() {
        System.out.println("===========================");
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                System.out.print(board.getBoard()[i][j]);
                if (j < 2) {
                    System.out.print(Symbol.TABLE_LINE);
                }
            }
            System.out.println();
        }
        System.out.println("===========================");

    }

    public int getRows() {
        return board.getRows();
    }

    public int getColumns() {
        return board.getColumns();
    }

    public Symbol[][] getBoard() {
        return board.getBoard();
    }

}
