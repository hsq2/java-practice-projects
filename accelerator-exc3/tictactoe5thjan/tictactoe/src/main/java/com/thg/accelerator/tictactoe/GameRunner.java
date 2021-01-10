package com.thg.accelerator.tictactoe;

import com.thg.accelerator.tictactoe.board.BoardHelper;
import com.thg.accelerator.tictactoe.board.Board;
import com.thg.accelerator.tictactoe.board.Symbol;
import com.thg.accelerator.tictactoe.gamehandler.GameChecker;
import com.thg.accelerator.tictactoe.gamehandler.GameHandler;
import com.thg.accelerator.tictactoe.gamehandler.TurnHandler;
import com.thg.accelerator.tictactoe.player.computer.ComputerMoveRequest;
import com.thg.accelerator.tictactoe.player.HumanMoveRequest;
import com.thg.accelerator.tictactoe.player.PlayerFactory;
import com.thg.accelerator.tictactoe.player.computer.difficulty.ComputerContext;
import com.thg.accelerator.tictactoe.player.computer.difficulty.Easy;
import com.thg.accelerator.tictactoe.player.computer.difficulty.Master;
import com.thg.accelerator.tictactoe.player.computer.difficulty.Novice;

import java.util.Arrays;
import java.util.Scanner;

public class GameRunner {
    static BoardHelper boardHelper = new BoardHelper(Board.getInstance());
    static PlayerFactory playerFactory = new PlayerFactory();
    static HumanMoveRequest humanMoveRequest = new HumanMoveRequest(playerFactory.getPlayer("human"));
//    static ComputerMoveRequest computerMoveRequest = new ComputerMoveRequest(playerFactory.getPlayer("computer"));

    public static void main(String[] args) {
        GameHandler gameHandler = new GameHandler(new GameChecker(boardHelper), boardHelper, new TurnHandler(true));

        ComputerContext context = new ComputerContext();
//        context.setStrategy(new Easy(playerFactory.getPlayer("computer")));
//        context.useMyStrategy();




        System.out.println("Welcome to ticactoe");

        //Temp Delete
        System.out.println("Select a difficulty. 1: Beginner, 2: Novice, 3: Master");

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();


        if (input == 1) {
            context.setStrategy(new Easy(playerFactory.getPlayer("computer")));
        } else if (input == 2) {
            context.setStrategy(new Novice(playerFactory.getPlayer("computer")));
        } else if (input == 3) {
            context.setStrategy(new Master(playerFactory.getPlayer("computer")));
        }

        context.useMyStrategy();


        //**
        boardHelper.printBoard();

        System.out.println();

        while (gameHandler.isGameRunning()) {
            if (gameHandler.getCurrentPlayer()) {
                System.out.println("Your turn: ");
                gameHandler.placeMove(humanMoveRequest.requestMove(), Symbol.CROSS);
            } else {
                gameHandler.placeMove(context.useMyStrategy(), Symbol.CIRCLE);
            }
            System.out.println(Arrays.deepToString(gameHandler.getArrayOfEmptyCells()));

        }


    }
}
