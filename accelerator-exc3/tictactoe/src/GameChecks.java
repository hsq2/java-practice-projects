public class GameChecks {

    public boolean winningRow(Symbol sym, Symbol[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == sym && board[i][1] == sym && board[i][2] == sym) {
                return true;
            }
        }
        return false;
    }

    public boolean winningCol(Symbol sym, Symbol[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == sym && board[1][i] == sym && board[2][i] == sym) {
                return true;
            }
        }
        return false;
    }

    public boolean winningDiag(Symbol sym, Symbol[][] board) {
        if (board[1][1] != sym) {
            return false;
        }

        if (board[0][0] == sym && board[2][2] == sym) {
            return true;
        }

        if (board[0][2] == sym && board[2][0] == sym) {
            return true;
        }

        return false;
    }
//        if (board[0][0] != sym || board[0][2] != sym || board[2][0] != sym || board[2][2] != sym) {
//            return false;
//        }
//
//        if (board[0][0] == sym && board[1][1] == sym && board[2][2] == sym) {
//            return true;
//        }
//    }
}
