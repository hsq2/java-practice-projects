//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class UserInput {
//
//    Scanner scanner = new Scanner(System.in);
//    private String promptText;
//    Display display = new Display(new Board());
//
//    public UserInput(String promptText) {
//        this.promptText = promptText;
//    }
//
//    public String getPromptText() {
//        return promptText;
//    }
//
//    public void setPromptText(String promptText) {
//        this.promptText = promptText;
//    }
//
//    public int getPosition() {
//        int value = 0;
//
//        while (true) {
//            try {
//                value = scanner.nextInt();
//            } catch (InputMismatchException inputMismatchException) {
//                break;
//            }
//        }
//    }
//}
