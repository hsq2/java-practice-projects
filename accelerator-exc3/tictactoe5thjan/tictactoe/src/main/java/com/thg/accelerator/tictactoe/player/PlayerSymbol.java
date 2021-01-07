package com.thg.accelerator.tictactoe.player;

public enum PlayerSymbol {
    NOUGHTS("O"),
    CROSSES("X");

    private final String PlayerSymbol;

    PlayerSymbol(String playerSymbol) {
        PlayerSymbol = playerSymbol;
    }

    public String getPlayerSymbol() {
        return PlayerSymbol;
    }
}