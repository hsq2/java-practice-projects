package com.thg.accelerator.tictactoe.gamehandler;

import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.board.Symbol;

public class GameChecker {
    private final Symbol[][] board;

    public GameChecker(Symbol[][] board) {
        this.board = board;
    }

    public boolean isValid(Position move, Symbol sym) {
        return isEmptyCell(move) && inTableRange(move) && !winningMove(sym);
    }

    public boolean inTableRange(Position move) {
        return (move.getRow() >= 0 && move.getRow() < 3) && (move.getColumn() >= 0 && move.getColumn() < 3);
    }

    public boolean isEmptyCell(Position move) {
        return board[move.getRow()][move.getColumn()].equals(Symbol.EMPTY_CELL);
    }

    public boolean winningMove(Symbol sym) {
        return winningRow(sym) && winningCol(sym) && winningDiag(sym);
    }

    public boolean winningRow(Symbol sym) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0].equals(sym) && board[i][1].equals(sym) && board[i][2].equals(sym)) {
                return true;
            }
        }
        return false;
    }

    public boolean winningCol(Symbol sym) {
        for (int i = 0; i < board.length; i++) {
            if (board[0][i].equals(sym) && board[1][i].equals(sym) && board[2][i].equals(sym)) {
                return true;
            }
        }
        return false;
    }

    public boolean winningDiag(Symbol sym) {
        if (!board[1][1].equals(sym)) {
            return false;
        }

        if (board[0][0].equals(sym) && board[2][2].equals(sym)) {
            return true;
        }

        if (board[0][2].equals(sym) && board[2][0].equals(sym)) {
            return true;
        }

        return false;
    }

//    public boolean isDraw(char[][] board, char sym) {
//        return !winningMove(board, sym) &&
//    }
}







//
//
//
//
//package com.thg.accelerator.tictactoe.gamehandler;
//
//public class GameChecker {
//
//
//    public boolean isValid(char[][] board, int x, int y) {
//        return isEmpty(board, x, y) && inRange(x, y);
//    }
//
//    public boolean inRange(int x, int y) {
//        return (x >= 0 && x < 3) && (y >= 0 && y < 3);
//    }
//
//    public boolean isEmpty(char[][] board, int x, int y) {
//        return board[x][y] == '_';
//    }
//
//    public boolean winningRow(char sym, char[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][0] == sym && board[i][1] == sym && board[i][2] == sym) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean winningCol(char sym, char[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            if (board[0][i] == sym && board[1][i] == sym && board[2][i] == sym) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean winningDiag(char sym, char[][] board) {
//        if (board[1][1] != sym) {
//            return false;
//        }
//
//        if (board[0][0] == sym && board[2][2] == sym) {
//            return true;
//        }
//
//        if (board[0][2] == sym && board[2][0] == sym) {
//            return true;
//        }
//
//        return false;
//    }
//}
