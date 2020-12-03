import java.util.Arrays;

public class Board {

    Symbol computer = new Symbol("o");
    Symbol human = new Symbol("x");
    Symbol placeholder = new Symbol("-");

    public void createBoard(int n) {
        Symbol [][] board = new Symbol[n][n]; //10 x 10 2d array


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = placeholder;
            }
        }
        System.out.println();

        for (Symbol[] symbols : board) {
            for (Symbol symbol : symbols) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

}
