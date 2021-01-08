package com.thg.accelerator.tictactoe.player.computer.difficulty;

public class ComputerContext {
    private Strategy myStrategy;

    public void setStrategy(Strategy strategy) {
        this.myStrategy = strategy;
    }

    public void useMyStrategy() {
        myStrategy.difficulty();
    }
}
