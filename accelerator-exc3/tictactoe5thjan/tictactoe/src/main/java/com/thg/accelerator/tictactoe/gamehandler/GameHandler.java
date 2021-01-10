package com.thg.accelerator.tictactoe.gamehandler;

import com.thg.accelerator.tictactoe.player.Position;
import com.thg.accelerator.tictactoe.board.BoardHelper;
import com.thg.accelerator.tictactoe.board.Symbol;
import com.thg.accelerator.tictactoe.gamehandler.savegame.SaveLoad;
import com.thg.accelerator.tictactoe.player.PlayerFactory;
import com.thg.accelerator.tictactoe.player.impl.strategy.ComputerContext;
import com.thg.accelerator.tictactoe.player.impl.strategy.Easy;
import com.thg.accelerator.tictactoe.player.impl.strategy.Master;
import com.thg.accelerator.tictactoe.player.impl.strategy.Novice;

import java.io.IOException;
import java.util.Scanner;

public class GameHandler {
    private boolean isGameRunning = true;
    private final GameChecker gameChecker;
    private final BoardHelper boardHelper;
    private final TurnHandler turnHandler;
    private final SaveLoad saveLoad;

    public GameHandler(GameChecker gameChecker, BoardHelper boardHelper, TurnHandler turnHandler, SaveLoad saveLoad) {
        this.gameChecker = gameChecker;
        this.boardHelper = boardHelper;
        this.turnHandler = turnHandler;
        this.saveLoad = saveLoad;
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

    public void placeMove(Position move, Symbol sym) throws IOException {
        if (!gameChecker.isValidMove(move, sym)) {
            if (turnHandler.currentPlayer()) {
                System.out.println("invalid move");
            }
        } else {
            boardHelper.getBoard()[move.getRow()][move.getColumn()] = sym;
            boardHelper.printBoard();
            checkState(move, sym);
            turnHandler.switchCurrentPlayer(turnHandler.currentPlayer());
            saveLoad.saveFile(move, sym, turnHandler);
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

    public void configureStrategy(Scanner scanner, ComputerContext context, PlayerFactory playerFactory) {
        int input = scanner.nextInt();
        if (input == 1) {
            context.setStrategy(new Easy(playerFactory.getPlayer("computer")));
        } else if (input == 2) {
            context.setStrategy(new Novice(playerFactory.getPlayer("computer")));
        } else if (input == 3) {
            context.setStrategy(new Master(playerFactory.getPlayer("computer")));
        }
        context.useMyStrategy();
    }
}
