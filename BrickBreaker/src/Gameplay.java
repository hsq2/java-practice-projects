import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    private boolean gameRunning = false;
    private int score = 0;

    private int totalBricks = 21;

    private Timer timer;
    private int delay = 8;

    private int playerX = 310;

    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;

    public Gameplay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();

    }

    public void paint(Graphics graphics) {
        //background
        graphics.setColor(new Color(0, 0, 153));
        graphics.fillRect(1, 1, 692, 592);

        //borders
        graphics.setColor(new Color(0, 128, 255));
        graphics.fillRect(0, 0, 3, 592);
        graphics.fillRect(0, 0, 692, 3);
        graphics.fillRect(691, 0, 3, 592);

        //paddle
        graphics.setColor(new Color(255, 255, 255));
        graphics.fillRect(playerX, 550, 100, 8);

        //Ball
        graphics.setColor(new Color(102, 255, 255));
        graphics.fillRect(ballposX, ballposY, 20, 20);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        gameRunning = true;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            playerX = playerX >= 600 ? 600 : moveRight();
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            playerX = playerX < 10 ? 10 : moveLeft();
        }
    }

    public int moveRight() {
        return playerX += 20;
    }

    public int moveLeft() {
        return playerX -= 20;
    }


}
