package com.thg.accelerator.tictactoe.gamehandler;

import com.thg.accelerator.tictactoe.player.Position;
import com.thg.accelerator.tictactoe.board.BoardHelper;
import com.thg.accelerator.tictactoe.board.Symbol;

public class GameChecker {

    private final BoardHelper boardHelper;

    public GameChecker(BoardHelper boardHelper) {
        this.boardHelper = boardHelper;
    }


    public boolean isValidMove(Position move, Symbol sym) {
        return isEmptyCell(move) && inTableRange(move) && !hasWon(sym);
    }

    public boolean inTableRange(Position move) {
        return (move.getRow() >= 0 && move.getRow() < 3) && (move.getColumn() >= 0 && move.getColumn() < 3);
    }

    public boolean isEmptyCell(Position move) {
        return boardHelper.getBoard()[move.getRow()][move.getColumn()].equals(Symbol.EMPTY_CELL);
    }

    public boolean hasWon(Symbol sym) {
        return winningRow(sym) || winningCol(sym) || winningDiag(sym);
    }

    public boolean winningRow(Symbol sym) {
        for (int i = 0; i < boardHelper.getRows(); i++) {
            if (boardHelper.getBoard()[i][0].equals(sym) && boardHelper.getBoard()[i][1].equals(sym) && boardHelper.getBoard()[i][2].equals(sym)) {
                return true;
            }
        }
        return false;
    }

    public boolean winningCol(Symbol sym) {
        for (int i = 0; i < boardHelper.getColumns(); i++) {
            if (boardHelper.getBoard()[0][i].equals(sym) && boardHelper.getBoard()[1][i].equals(sym) && boardHelper.getBoard()[2][i].equals(sym)) {
                return true;
            }
        }
        return false;
    }

    public boolean winningDiag(Symbol sym) {
        if (boardHelper.getBoard()[0][0].equals(sym) && boardHelper.getBoard()[1][1].equals(sym) && boardHelper.getBoard()[2][2].equals(sym)) {
            return true;
        }
        return boardHelper.getBoard()[2][0].equals(sym) && boardHelper.getBoard()[1][1].equals(sym) && boardHelper.getBoard()[0][2].equals(sym);
    }

    protected Symbol[][] getArrayOfEmptyCells() {
        Symbol[][] arrOfEmptyCells = boardHelper.getBoard();
        for (Symbol[] arr : arrOfEmptyCells) {
            for (Symbol cell : arr) {
                if (!cell.equals(Symbol.EMPTY_CELL)) {
                    cell.equals(null);
                }
            }
        }
        return arrOfEmptyCells;
    }

}

