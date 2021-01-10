package com.thg.accelerator.tictactoe.player.impl.strategy;

import com.thg.accelerator.tictactoe.player.Position;

public class ComputerContext {

    private Strategy myStrategy;

    public void setStrategy(Strategy strategy) {
        this.myStrategy = strategy;
    }

    public Position useMyStrategy() {
        return myStrategy.makeMove();
    }
}
