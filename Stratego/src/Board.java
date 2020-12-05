import java.util.Arrays;

public class Board {

    public void createBoard(int n) {
        Symbol[][] board = new Symbol[n][n]; //10 x 10 2d array


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = Symbol.PLACEHOLDER;
            }
        }
        System.out.println();

        for (Symbol[] symbols : board) {
            for (int i = 0; i < board.length; i++) {
                System.out.println(i < board.length - 1 ? symbols[i].getSymbol() + " " : symbols[i].getSymbol());
            }
            System.out.println();
        }
    }

}
