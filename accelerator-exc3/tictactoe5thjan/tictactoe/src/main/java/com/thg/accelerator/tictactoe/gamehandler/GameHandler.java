package com.thg.accelerator.tictactoe.gamehandler;

import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.board.Board;
import com.thg.accelerator.tictactoe.board.Symbol;

public class GameHandler {
    private boolean isGameRunning = true;
    private final GameChecker gameChecker;
    private final Board board;
    private final TurnHandler turnHandler;

    public GameHandler(GameChecker gameChecker, Board board, TurnHandler turnHandler) {
        this.gameChecker = gameChecker;
        this.board = board;
        this.turnHandler = turnHandler;
    }


//    public boolean isValidMove(Position move, Symbol sym) {
//        return gameChecker.isValid(move, sym);
//    }

    public void checkState(Position move, Symbol sym) {
        if (gameChecker.winningMove(sym)) {
            System.out.println(sym + " wins");
            isGameRunning = false;
        } else if (gameChecker.isEmptyCell(move) && gameChecker.winningMove(sym)) {
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
            board.getBoard()[move.getRow()][move.getColumn()] = sym;
            board.printBoard();
            checkState(move, sym);
            turnHandler.switchCurrentPlayer(turnHandler.currentPlayer());
        }
    }

    public boolean isGameRunning() {
        return isGameRunning;
    }
}
