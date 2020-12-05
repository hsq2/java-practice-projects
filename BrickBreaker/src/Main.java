import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        Gameplay gameplay = new Gameplay();
        jFrame.setBounds(10, 10, 700, 600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Brick Breaker @hsq2");
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(gameplay);
        jFrame.setVisible(true);


    }
}
