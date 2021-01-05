package com.thg.accelerator.tictactoe.player;

import com.thg.accelerator.tictactoe.Position;

public interface Player {

    char symbol = ' ';

    Position makeMove(char[][] board, int row, int col);
}
