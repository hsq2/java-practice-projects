package com.thg.accelerator.tictactoe.board;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardHelperTest {
    BoardHelper boardHelper;


    @BeforeEach
    void setUp() {
        boardHelper = new BoardHelper(Board.getInstance());
    }

    @Test
    void emptyBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(Symbol.EMPTY_CELL, boardHelper.getBoard()[i][j]);
            }
        }
    }

    @Test
    void getRows() {
        assertEquals(3, boardHelper.getRows(), "Board has 3 rows");
    }

    @Test
    void getColumns() {
        assertEquals(3, boardHelper.getColumns(), "Board has 3 columns");
    }
}