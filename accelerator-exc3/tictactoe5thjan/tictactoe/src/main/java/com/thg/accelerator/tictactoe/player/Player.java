package com.thg.accelerator.tictactoe.player;

import com.thg.accelerator.tictactoe.Position;

public interface Player {

    Position makeMove(int row, int col);
}
