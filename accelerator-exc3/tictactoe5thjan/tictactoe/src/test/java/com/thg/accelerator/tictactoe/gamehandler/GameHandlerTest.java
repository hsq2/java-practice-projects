package com.thg.accelerator.tictactoe.gamehandler;

import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.board.Board;
import com.thg.accelerator.tictactoe.board.BoardHelper;
import com.thg.accelerator.tictactoe.board.Symbol;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameHandlerTest {

    GameHandler gameHandler;
    GameChecker gameChecker;

    @BeforeEach
    void setUp() {
        BoardHelper boardHelper = new BoardHelper(Board.getInstance());
        gameChecker = new GameChecker(boardHelper);
        gameHandler = new GameHandler(gameChecker, boardHelper, new TurnHandler(true));
        Board.clearInstance();
    }

    @Test
    void winningDiagonalCrossLeftToRight() {
        gameHandler.placeMove(new Position(0, 0), Symbol.CROSS);
        gameHandler.placeMove(new Position(1, 1), Symbol.CROSS);
        gameHandler.placeMove(new Position(2, 2), Symbol.CROSS);
        assertTrue(gameChecker.winningDiag(Symbol.CROSS));
    }

    @Test
    void winningDiagonalCrossRightToLeft() {
        gameHandler.placeMove(new Position(0, 2), Symbol.CROSS);
        gameHandler.placeMove(new Position(1, 1), Symbol.CROSS);
        gameHandler.placeMove(new Position(2, 0), Symbol.CROSS);
        assertTrue(gameChecker.winningDiag(Symbol.CROSS));
    }

    void checkColumn(int column, Symbol symbol) {
        for (int i = 0; i < 3; i++) {
            gameHandler.placeMove(new Position(i, column), symbol);
        }
    }

    void checkRow(int row, Symbol symbol) {
        for (int i = 0; i < 3; i++) {
            gameHandler.placeMove(new Position(row, i), symbol);
        }
    }

    @Test
    void winningColumnCrossFirst() {
        checkColumn(0, Symbol.CROSS);
        assertTrue(gameChecker.winningCol(Symbol.CROSS));
    }

    @Test
    void winningColumnCrossSecond() {
        checkColumn(1, Symbol.CROSS);
        assertTrue(gameChecker.winningCol(Symbol.CROSS));
    }

    @Test
    void winningColumnCrossThird() {
        checkColumn(2, Symbol.CROSS);
        assertTrue(gameChecker.winningCol(Symbol.CROSS));
    }

    @Test
    void winningRowCrossFirst() {
        checkRow(0, Symbol.CROSS);
        assertTrue(gameChecker.winningRow(Symbol.CROSS));
    }

    @Test
    void winningRowCrossSecond() {
        checkRow(1, Symbol.CROSS);
        assertTrue(gameChecker.winningRow(Symbol.CROSS));
    }

    @Test
    void winningRowCrossThird() {
        checkRow(2, Symbol.CROSS);
        assertTrue(gameChecker.winningRow(Symbol.CROSS));
    }


    void fullBoardNoWinner() {
        gameHandler.placeMove(new Position(0, 0), Symbol.CROSS);
        gameHandler.placeMove(new Position(0, 1), Symbol.CROSS);
        gameHandler.placeMove(new Position(0, 2), Symbol.CIRCLE);

        gameHandler.placeMove(new Position(1, 0), Symbol.CIRCLE);
        gameHandler.placeMove(new Position(1, 1), Symbol.CIRCLE);
        gameHandler.placeMove(new Position(1, 2), Symbol.CROSS);

        gameHandler.placeMove(new Position(2, 0), Symbol.CROSS);
        gameHandler.placeMove(new Position(2, 1), Symbol.CIRCLE);
        gameHandler.placeMove(new Position(2, 2), Symbol.CROSS);
    }

    @Test
    void isEmptyCell() {
        fullBoardNoWinner();
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                assertFalse(gameChecker.isEmptyCell(new Position(i, j)));
            }
        }
    }

    @Test
    void noWinner() {
        assertFalse(gameChecker.hasWon(Symbol.CROSS));
        assertFalse(gameChecker.hasWon(Symbol.CIRCLE));
    }
}