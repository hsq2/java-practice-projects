import components.Ball;
import components.Player;
import frame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

//    Player player = new Player();
//    Ball ball = new Ball();
//    Game game = new Game(player, ball);

    private Timer timer;
    private int delay = 8;
    private final Player player;
    private final Ball ball;
    private final Game game;



    public Gameplay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        timer = new Timer(delay, this);
        timer.start();

        player = new Player();
        ball = new Ball();

        game = new Game(player, ball);

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
        graphics.setColor(player.getPaddleColor());
        graphics.fillRect(player.getPlayerPosX(), player.getPlayerPosY(), player.getPaddleWidth(), player.getPaddleHeight());

        //Ball
        graphics.setColor(ball.getColor());
        graphics.fillRect(ball.getBallposX(), ball.getBallposY(), ball.getBallWidth(), ball.getBallHeight());


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
        game.setGameRunning(true);
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            player.setPlayerPosX(player.getPlayerPosX() >= MainFrame.BORDER_RIGHT.getSize() ? MainFrame.BORDER_RIGHT.getSize() : player.moveRight());
            player.setPlayerPosX(Math.min(MainFrame.BORDER_RIGHT.getSize(), player.moveRight()));
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.setPlayerPosX(Math.max(MainFrame.BORDER_LEFT.getSize(), player.moveLeft()));
        }
    }


}
