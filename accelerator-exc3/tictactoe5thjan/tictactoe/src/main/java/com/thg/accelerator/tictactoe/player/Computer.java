package com.thg.accelerator.tictactoe.player;

public class Computer implements Player {

    @Override
    public Position makeMove(int row, int col) {
        return new Position(row, col);
    }
}
