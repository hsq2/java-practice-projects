import components.Ball;
import components.Paddle;
import frame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    private Timer timer;
    private int delay = 8;
    private final Paddle paddle;
    private final Ball ball;
    private final Game game;



    public Gameplay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        timer = new Timer(delay, this);
        timer.start();

        paddle = new Paddle();
        ball = new Ball();

        game = new Game(paddle, ball);

    }

    public void paint(Graphics graphics) {
        //background
        graphics.setColor(new Color(0, 0, 153));
        graphics.fillRect(1, 1, MainFrame.WIDTH.getSize() - 8, MainFrame.HEIGHT.getSize() - 8);

        //borders
        graphics.setColor(new Color(0, 128, 255));
        graphics.fillRect(0, 0, 3, 592);
        graphics.fillRect(0, 0, 692, 3);
        graphics.fillRect(691, 0, 3, 592);

        //paddle
        graphics.setColor(paddle.getColor());
        graphics.fillRect(paddle.getPosition().getPosX(), paddle.getPosition().getPosY(), paddle.getSize().getWidth(), paddle.getSize().getHeight());

        //Ball
        graphics.setColor(ball.getColor());
        graphics.fillRect(ball.getPosition().getPosX(), ball.getPosition().getPosY(), ball.getSize().getWidth(), ball.getSize().getHeight());

        graphics.dispose();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        game.setGameRunning(true);
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
<<<<<<< HEAD
//            paddle.setPlayerPosX(paddle.getPlayerPosX() >= MainFrame.BORDER_RIGHT.getSize() ? MainFrame.BORDER_RIGHT.getSize() : paddle.moveRight());
//            paddle.setPlayerPosX(Math.min(MainFrame.BORDER_RIGHT.getSize(), paddle.moveRight()));
            paddle.getPosition().setPosX(Math.min(MainFrame.BORDER_RIGHT.getSize(), paddle.moveRight()));
=======
            player.setPlayerPosX(Math.min(MainFrame.BORDER_RIGHT.getSize(), player.moveRight()));
>>>>>>> e42feaef82f39577a4384fd5535f5a2350592650
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            paddle.getPosition().setPosX(Math.min(MainFrame.BORDER_LEFT.getSize(), paddle.moveLeft()));
        }
    }


}
