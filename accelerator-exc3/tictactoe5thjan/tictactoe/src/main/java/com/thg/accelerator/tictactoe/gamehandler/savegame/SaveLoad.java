package com.thg.accelerator.tictactoe.gamehandler.savegame;

import com.thg.accelerator.tictactoe.player.Position;
import com.thg.accelerator.tictactoe.board.BoardHelper;
import com.thg.accelerator.tictactoe.board.Symbol;
import com.thg.accelerator.tictactoe.gamehandler.TurnHandler;

import java.io.FileWriter;
import java.io.IOException;

public class SaveLoad {

    private final BoardHelper boardHelper;

    public SaveLoad(BoardHelper boardHelper) {
        this.boardHelper = boardHelper;
    }

    public void saveFile(Position move, Symbol symbol, TurnHandler turnHandler) throws IOException {
        String fileName = "src/main/java/com/thg/accelerator/tictactoe/gamehandler/savegame/gamestate.txt";
        FileWriter fw = new FileWriter(fileName);
        Symbol[][] boardArr = boardHelper.getBoard();
        for (Symbol[] arr : boardArr) {
            for (Symbol cell : arr) {
                fw.write(String.valueOf(cell));
            }
            fw.write("\n");
        }
    }
}

