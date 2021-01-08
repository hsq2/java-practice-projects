package com.thg.accelerator.tictactoe.player.computer;

import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.player.Player;

public class Computer implements Player {
    @Override
    public Position makeMove(int row, int col) {
        return new Position(row, col);
    }
}
