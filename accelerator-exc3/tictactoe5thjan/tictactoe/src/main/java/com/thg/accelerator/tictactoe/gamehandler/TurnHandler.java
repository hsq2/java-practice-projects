package com.thg.accelerator.tictactoe.gamehandler;

public class TurnHandler {

    private boolean isHumanTurn;

    public TurnHandler(boolean isHumanTurn) {
        this.isHumanTurn = isHumanTurn;
    }

    public void setHumanTurn(boolean humanTurn) {
        isHumanTurn = !humanTurn;
    }

    public boolean switchTurn() {
        return !isHumanTurn;
    }

    public boolean isHumanTurn() {
        return isHumanTurn;
    }
}
