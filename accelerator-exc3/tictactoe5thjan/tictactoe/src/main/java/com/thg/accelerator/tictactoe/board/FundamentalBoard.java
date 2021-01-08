package com.thg.accelerator.tictactoe.board;

public class FundamentalBoard {

    private final int rows = 3;
    private final int columns = 3;
    private final Symbol[][] board = {{Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL},
            {Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL},
            {Symbol.EMPTY_CELL, Symbol.EMPTY_CELL, Symbol.EMPTY_CELL}};

    public FundamentalBoard() { //singleton
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
