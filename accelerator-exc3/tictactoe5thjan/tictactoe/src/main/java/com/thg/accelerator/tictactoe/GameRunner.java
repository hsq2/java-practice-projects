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
        TurnHandler turnHandler = new TurnHandler(true);
        GameHandler gameHandler = new GameHandler(gameChecker, board, turnHandler);


        System.out.println("Welcome to ticactoe");
        board.printBoard();

        while (gameHandler.isGameRunning()) {
            if (turnHandler.currentPlayer()) {
                System.out.println("Your turn: ");
                gameHandler.placeMove(humanMoveRequest.requestMove(), Symbol.CROSS);
//                gameHandler.checkState(humanMoveRequest.requestMove(), Symbol.CROSS);
            } else {
                gameHandler.placeMove(computerMoveRequest.requestMove(), Symbol.CIRCLE);
//                gameHandler.checkState(computerMoveRequest.requestMove(), Symbol.CIRCLE);

            }
        }


    }
}
