package com.thg.accelerator.tictactoe;

import com.thg.accelerator.tictactoe.board.Board;
import com.thg.accelerator.tictactoe.gamehandler.GameChecker;
import com.thg.accelerator.tictactoe.gamehandler.GameHandler;
import com.thg.accelerator.tictactoe.gamehandler.TurnHandler;
import com.thg.accelerator.tictactoe.player.ComputerMoveRequest;
import com.thg.accelerator.tictactoe.player.HumanMoveRequest;

public class GameRunner {
    static GameChecker gameChecker = new GameChecker();
    static Board board = new Board();
    static HumanMoveRequest humanMoveRequest = new HumanMoveRequest();
    static ComputerMoveRequest computerMoveRequest = new ComputerMoveRequest();

    public static void main(String[] args) {
        GameHandler gameHandler = new GameHandler(gameChecker, board);
        TurnHandler turnHandler = new TurnHandler(true);


        System.out.println("Welcome to ticactoe");
        board.printBoard();

        while (true) {
            if (turnHandler.isHumanTurn()) {
                gameHandler.placeMove(humanMoveRequest.requestMove(), 'X', turnHandler);
                System.out.println("human turn");
            } else {
                gameHandler.placeMove(computerMoveRequest.requestMove(), 'O', turnHandler);
                System.out.println("comp turn");
            }
        }


    }
}
