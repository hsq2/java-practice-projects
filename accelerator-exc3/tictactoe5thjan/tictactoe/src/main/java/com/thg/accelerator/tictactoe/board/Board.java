package com.thg.accelerator.tictactoe.board;

public class Board {

    private static Board instance = null;
    private final int rows = 3;
    private final int columns = 3;
    private final Symbol[][] board =
            {{Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL},
            {Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL},
            {Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL}};


    private Board() {}

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }

    public static void clearInstance() {
        instance = null;
    }

    protected int getRows() {
        return rows;
    }

    protected int getColumns() {
        return columns;
    }

    protected Symbol[][] getBoard() {
        return board;
    }
}
