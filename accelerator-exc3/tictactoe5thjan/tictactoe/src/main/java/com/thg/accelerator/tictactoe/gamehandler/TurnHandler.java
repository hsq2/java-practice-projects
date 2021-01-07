package com.thg.accelerator.tictactoe.gamehandler;

public class TurnHandler {

    private boolean currentPlayer; // true = human - false = computer

    public TurnHandler(boolean currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void switchCurrentPlayer(boolean currentPlayer) {
        this.currentPlayer = !currentPlayer;
    }

    public boolean currentPlayer() {
        return currentPlayer;
    }
}
