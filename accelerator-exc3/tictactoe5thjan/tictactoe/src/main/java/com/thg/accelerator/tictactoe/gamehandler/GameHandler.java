package com.thg.accelerator.tictactoe.gamehandler;

import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.board.BoardHelper;
import com.thg.accelerator.tictactoe.board.Symbol;

public class GameHandler {
    private boolean isGameRunning = true;
    private final GameChecker gameChecker;
    private final BoardHelper boardHelper;
    private final TurnHandler turnHandler;

    public GameHandler(GameChecker gameChecker, BoardHelper boardHelper, TurnHandler turnHandler) {
        this.gameChecker = gameChecker;
        this.boardHelper = boardHelper;
        this.turnHandler = turnHandler;
    }

    public void checkState(Position move, Symbol sym) {
        if (gameChecker.hasWon(sym)) {
            System.out.println(sym + " wins");
            isGameRunning = false;
        } else if (gameChecker.isEmptyCell(move) && gameChecker.hasWon(sym)) {
            System.out.println("Game is a draw");
            isGameRunning = false;
        } else {
            isGameRunning = true;
        }
    }

    public void placeMove(Position move, Symbol sym) {
        if (!gameChecker.isValidMove(move, sym)) {
            if (turnHandler.currentPlayer()) {
                System.out.println("invalid move");
            }
        } else {
            boardHelper.getBoard()[move.getRow()][move.getColumn()] = sym;
            boardHelper.printBoard();
            checkState(move, sym);
            turnHandler.switchCurrentPlayer(turnHandler.currentPlayer());
        }
    }

    public boolean isGameRunning() {
        return isGameRunning;
    }

    public boolean getCurrentPlayer() {
        return turnHandler.currentPlayer();
    }

    public Symbol[][] getArrayOfEmptyCells() {
        return gameChecker.getArrayOfEmptyCells();
    }
}
