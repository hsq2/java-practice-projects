package com.thg.accelerator.tictactoe.player;

public class Human implements Player {


    @Override
    public Position makeMove(int row, int col) {
        return new Position(row, col);
    }
}

