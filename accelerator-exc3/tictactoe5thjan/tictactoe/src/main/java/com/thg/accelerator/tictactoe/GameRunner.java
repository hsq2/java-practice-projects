package com.thg.accelerator.tictactoe;

import com.thg.accelerator.tictactoe.board.Board;
import com.thg.accelerator.tictactoe.board.Symbol;
import com.thg.accelerator.tictactoe.gamehandler.GameChecker;
import com.thg.accelerator.tictactoe.gamehandler.GameHandler;
import com.thg.accelerator.tictactoe.gamehandler.TurnHandler;
import com.thg.accelerator.tictactoe.player.ComputerMoveRequest;
import com.thg.accelerator.tictactoe.player.HumanMoveRequest;

public class GameRunner {
    static GameChecker gameChecker = new GameChecker();
    static Board board = new Board(new Symbol[3][3]);
    static HumanMoveRequest humanMoveRequest = new HumanMoveRequest();
    static ComputerMoveRequest computerMoveRequest = new ComputerMoveRequest();

    public static void main(String[] args) {
        TurnHandler turnHandler = new TurnHandler(true);
        GameHandler gameHandler = new GameHandler(gameChecker, board, turnHandler);


        System.out.println("Welcome to ticactoe");
        board.initialiseBoard();
        board.printBoard();

        while (true) {
            if (turnHandler.currentPlayer()) {
                gameHandler.placeMove(humanMoveRequest.requestMove(), Symbol.CROSS);
                System.out.println("human turn");
            } else {
                gameHandler.placeMove(computerMoveRequest.requestMove(), Symbol.CIRCLE);
                System.out.println("comp turn");
            }
        }


    }
}
