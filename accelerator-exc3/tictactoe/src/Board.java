import java.util.Arrays;

public class Board {

    public static final int NUMBER_OF_ROWS = 3;

    public void createBoard() {

        Symbol[][] board = new Symbol[NUMBER_OF_ROWS][NUMBER_OF_ROWS];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = Symbol.PLACEHOLDER;
            }
        }
        System.out.println();

        for (Symbol[] symbols : board) {
            for (int i = 0; i < board.length; i++) {
                System.out.print(i < board.length - 1 ? symbols[i].getSymbol() + " " : symbols[i].getSymbol());
            }
            System.out.println();
        }
    }

}


