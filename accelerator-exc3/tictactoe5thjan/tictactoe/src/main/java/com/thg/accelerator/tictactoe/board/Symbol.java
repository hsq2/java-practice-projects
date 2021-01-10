package com.thg.accelerator.tictactoe.board;

public enum Symbol {

    EMPTY_CELL("_"),
    TABLE_LINE("|"),
    CIRCLE("O"),
    CROSS("X");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
