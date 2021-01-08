package com.thg.accelerator.tictactoe;

import com.thg.accelerator.tictactoe.board.Board;
import com.thg.accelerator.tictactoe.board.FundamentalBoard;
import com.thg.accelerator.tictactoe.board.Symbol;
import com.thg.accelerator.tictactoe.gamehandler.GameChecker;
import com.thg.accelerator.tictactoe.gamehandler.GameHandler;
import com.thg.accelerator.tictactoe.gamehandler.TurnHandler;
import com.thg.accelerator.tictactoe.player.ComputerMoveRequest;
import com.thg.accelerator.tictactoe.player.HumanMoveRequest;

public class GameRunner {
    static Board board = new Board(new FundamentalBoard());
    static GameChecker gameChecker = new GameChecker(board);
    static HumanMoveRequest humanMoveRequest = new HumanMoveRequest();
    static ComputerMoveRequest computerMoveRequest = new ComputerMoveRequest();

    public static void main(String[] args) {
        boolean isGameRunning = true;
        TurnHandler turnHandler = new TurnHandler(true);
        GameHandler gameHandler = new GameHandler(gameChecker, board, turnHandler);


        System.out.println("Welcome to ticactoe");
        board.printBoard();

        while (isGameRunning) {
            if (turnHandler.currentPlayer()) {
                gameHandler.placeMove(humanMoveRequest.requestMove(), Symbol.CROSS);
                System.out.println("human turn");
                if (gameChecker.winningMove(Symbol.CROSS)) {
                    System.out.println("human wins");
                    isGameRunning = false;
                }
            } else {
                gameHandler.placeMove(computerMoveRequest.requestMove(), Symbol.CIRCLE);
                System.out.println("comp turn");
            }
        }


    }
}
