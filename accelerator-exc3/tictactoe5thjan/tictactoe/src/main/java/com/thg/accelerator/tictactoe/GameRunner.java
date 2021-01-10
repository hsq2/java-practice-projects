package com.thg.accelerator.tictactoe;

import com.thg.accelerator.tictactoe.board.BoardHelper;
import com.thg.accelerator.tictactoe.board.Board;
import com.thg.accelerator.tictactoe.board.Symbol;
import com.thg.accelerator.tictactoe.gamehandler.GameChecker;
import com.thg.accelerator.tictactoe.gamehandler.GameHandler;
import com.thg.accelerator.tictactoe.gamehandler.TurnHandler;
import com.thg.accelerator.tictactoe.gamehandler.savegame.SaveLoad;
import com.thg.accelerator.tictactoe.player.impl.HumanMoveRequest;
import com.thg.accelerator.tictactoe.player.PlayerFactory;
import com.thg.accelerator.tictactoe.player.impl.strategy.ComputerContext;

import java.io.IOException;
import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) throws IOException {

        BoardHelper boardHelper = new BoardHelper(Board.getInstance());
        PlayerFactory playerFactory = new PlayerFactory();
        HumanMoveRequest humanMoveRequest = new HumanMoveRequest(playerFactory.getPlayer("human"));
        ComputerContext context = new ComputerContext();
        GameHandler gameHandler = new GameHandler(new GameChecker(boardHelper), boardHelper,
                new TurnHandler(true), new SaveLoad(boardHelper));


        System.out.println("Welcome to ticactoe");
        System.out.println("Select a difficulty. 1: Beginner, 2: Novice, 3: Master");

        gameHandler.configureStrategy(new Scanner(System.in), context, playerFactory);

        boardHelper.printBoard();

        while (gameHandler.isGameRunning()) {
            if (gameHandler.getCurrentPlayer()) {
                System.out.println("Your turn: ");
                gameHandler.placeMove(humanMoveRequest.requestMove(), Symbol.CROSS);
            } else {
                gameHandler.placeMove(context.useMyStrategy(), Symbol.CIRCLE);
            }
//            System.out.println(Arrays.deepToString(gameHandler.getArrayOfEmptyCells()));
        }
    }
}
