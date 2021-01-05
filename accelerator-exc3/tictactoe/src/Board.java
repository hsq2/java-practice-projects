import java.util.Arrays;

public class Board {

    private static Board instance = null;

    private Board() {
    }

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }

    private static final int NUMBER_OF_ROWS = 3;
    private static final int NUMBER_OF_COLUMNS = 3;
    public final Symbol[][] board = new Symbol[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
    public final GameChecks gameChecks = new GameChecks();





    public void createBoard() {
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

    public boolean inRange(int x, int y) {
        return (x >= 0 && x < NUMBER_OF_ROWS) && (y >= 0 && y < NUMBER_OF_COLUMNS);
    }

    public boolean isEmpty(int x, int y) {
        return board[x][y] == Symbol.PLACEHOLDER;
    }

    public boolean setTile(Symbol sym, int x, int y) {
        if (!inRange(x, y)) {
            return false;
        }

        if (isEmpty(x, y)) {
            this.board[x][y] = sym; //switch turn
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(board);
    }
}


