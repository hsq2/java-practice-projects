package com.thg.accelerator.tictactoe.gamehandler;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurnHandlerTest {


    TurnHandler turnHandler = new TurnHandler(true);


    @Test
    void humanTurn() {
        assertTrue(turnHandler.currentPlayer());
    }

    @Test
    void nextPlayer() {
        turnHandler.switchCurrentPlayer(turnHandler.currentPlayer());
        assertFalse(turnHandler.currentPlayer());
    }


}