package com.thg.accelerator.tictactoe.gamehandler;

import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.board.Board;
import com.thg.accelerator.tictactoe.board.Symbol;

public class GameHandler {
//    TurnHandler turnHandler = new TurnHandler(true);
//    Counter counter = new Counter();
    private final GameChecker gameChecker;
    private final Board board;
    private final TurnHandler turnHandler;

    public GameHandler(GameChecker gameChecker, Board board, TurnHandler turnHandler) { //boardsymbol?
        this.gameChecker = gameChecker;
        this.board = board;
        this.turnHandler = turnHandler;
    }

    public boolean isValidMove(Position move, Symbol sym) {
        return gameChecker.isValid(move, sym);
    }

    public void placeMove(Position move, Symbol sym) {
            if (!isValidMove(move, sym)) {
                if (turnHandler.currentPlayer()) {
                    System.out.println("invalid move");
                }
            } else {
                board.getBoard()[move.getRow()][move.getColumn()] = sym;
                board.printBoard();
                turnHandler.switchCurrentPlayer(turnHandler.currentPlayer());
            }
        }
//        while (turnHandler.isHumanTurn()) {
//            if (isValidMove(move, sym)) {
//                board.getBoard()[move.getRow()][move.getColumn()] = sym;
////            counter.setCount(counter.getCount() + 1);
//                board.printBoard();
//                turnHandler.switchTurn();
//            } else {
//                System.out.println("Invalid space HUMAN");
//                return;
//            }
//        }

}
