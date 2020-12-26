import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Display class is used to represent the View component of the Model-View-Controller design pattern.
 * Here, the Display class is mainly responsible for receiving input from the user and outputting messages and game state information to the console.
 * This abstraction moves all the user input/output to a single place (the Display class) allowing other classes to deal with other functionality of the game.
 *
 * @author Alexander Koster
 * @version 2017-07-21
 */


public class Display {

    private final Board board;
    Scanner scanner = new Scanner(System.in);

    public Display(Board board) {
        this.board = board;
    }

    public void printBoard() {
        board.createBoard();
    }

    public void resignMessage() {
        System.out.println("User has resigned from the game.");
    }

    public int getPlayerPosition() {
        int position = 0;

        while(true) {
            System.out.println("Enter square number or enter a letter to quit");

            try {
                position = scanner.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                resignMessage();
                break;
            }
            if (isValidMove(position);) {

            }
        }
    }

    public void isValidMove(int position) {

    }
}
