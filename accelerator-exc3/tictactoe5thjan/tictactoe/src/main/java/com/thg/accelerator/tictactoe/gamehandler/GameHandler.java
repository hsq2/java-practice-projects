package com.thg.accelerator.tictactoe.gamehandler;

import com.thg.accelerator.tictactoe.Counter;
import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.board.Board;

public class GameHandler {
//    TurnHandler turnHandler = new TurnHandler(true);
//    Counter counter = new Counter();
    GameChecker gameChecker = new GameChecker();
    Board board = new Board();

    public GameHandler(GameChecker gameChecker, Board board) {
        this.gameChecker = gameChecker;
        this.board = board;
    }

    public boolean isValidMove(Position move, char sym) {
        return gameChecker.isValid(board.getBoard(), move, sym);
    }

    public void placeMove(Position move, char sym, TurnHandler turnHandler) {
            if (!isValidMove(move, sym)) {
                if (turnHandler.isHumanTurn()) {
                    System.out.println("invalid move");
                }
            } else {
                board.getBoard()[move.getRow()][move.getColumn()] = sym;
                board.printBoard();
                turnHandler.setHumanTurn(turnHandler.isHumanTurn());
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
