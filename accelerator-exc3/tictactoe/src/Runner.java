import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Board board = Board.getInstance();
        board.createBoard();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row");
        int row = scanner.nextInt();

        System.out.println("Enter col");
        int col = scanner.nextInt();

        board.setTile(Symbol.CROSSES, row, col);

        board.createBoard();
    }
}
