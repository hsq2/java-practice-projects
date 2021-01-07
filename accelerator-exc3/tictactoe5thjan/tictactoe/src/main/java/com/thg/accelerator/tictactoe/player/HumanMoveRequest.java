package com.thg.accelerator.tictactoe.player;

import com.thg.accelerator.tictactoe.Position;
import com.thg.accelerator.tictactoe.player.Human;
import com.thg.accelerator.tictactoe.player.Player;

import java.util.Scanner;

public class HumanMoveRequest {

    Player human = new Human();
    Scanner scanner = new Scanner(System.in);

    public Position requestMove() {
        return human.makeMove(requestRow(), requestColumn());
    }

    private int requestRow() {
        System.out.println("Enter row");
        return scanner.nextInt();
    }

    private int requestColumn() {
        System.out.println("Enter column");
        return scanner.nextInt();
    }


}
