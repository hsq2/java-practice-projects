package com.thg.accelerator.tictactoe.board;

import com.thg.accelerator.tictactoe.gamehandler.GameChecker;

public class Board {

FundamentalBoard fundamentalBoard;

    public Board(FundamentalBoard fundamentalBoard) {
        this.fundamentalBoard = fundamentalBoard;
    }

//    public void initialiseBoard() {
//        for (int i = 0; i < fundamentalBoard.getRows(); i++) {
//            for (int j = 0; j < fundamentalBoard.getColumns(); j++) {
//                fundamentalBoard.getBoard()[i][j] = Symbol.EMPTY_CELL;
//            }
//        }
//    }

    public void printBoard() {
        System.out.println("===========================");
        for (int i = 0; i < fundamentalBoard.getRows(); i++) {
            for (int j = 0; j < fundamentalBoard.getColumns(); j++) {
                System.out.print(fundamentalBoard.getBoard()[i][j]);
                if (j < 2) {
                    System.out.print(Symbol.TABLE_LINE);
                }
            }
            System.out.println();
        }
        System.out.println("===========================");

    }

    public int getRows() {
        return fundamentalBoard.getRows();
    }

    public int getColumns() {
        return fundamentalBoard.getColumns();
    }

    public Symbol[][] getBoard() {
        return fundamentalBoard.getBoard();
    }

}
