package com.thg.accelerator.tictactoe.board;

public class Board {

    private static Board instance = null;
    private final int rows = 3;
    private final int columns = 3;
    private final Symbol[][] board = {{Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL},
            {Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL},
            {Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL}};

    //    public void initialiseBoard() {
//        for (int i = 0; i < fundamentalBoard.getRows(); i++) {
//            for (int j = 0; j < fundamentalBoard.getColumns(); j++) {
//                fundamentalBoard.getBoard()[i][j] = Symbol.EMPTY_CELL;
//            }
//        }
//    }

    private Board() {}

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Symbol[][] getBoard() {
        return board;
    }
}
