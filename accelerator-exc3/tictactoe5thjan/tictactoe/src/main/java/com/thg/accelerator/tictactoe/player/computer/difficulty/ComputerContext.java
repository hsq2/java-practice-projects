package com.thg.accelerator.tictactoe.player.computer.difficulty;

import com.thg.accelerator.tictactoe.Position;

public class ComputerContext {
    private Strategy myStrategy;

    public void setStrategy(Strategy strategy) {
        this.myStrategy = strategy;
    }

    public Position useMyStrategy() {
        return myStrategy.makeMove();
    }
}
