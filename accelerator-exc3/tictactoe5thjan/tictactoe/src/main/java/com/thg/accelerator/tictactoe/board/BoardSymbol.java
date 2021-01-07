package com.thg.accelerator.tictactoe.board;

public enum BoardSymbol {
    EMPTY("_"),
    TABLE_LINES("|");

    private final String BoardSymbol;

    BoardSymbol(String boardSymbol) {
        BoardSymbol = boardSymbol;
    }

    public String getBoardSymbol() {
        return BoardSymbol;
    }
}
