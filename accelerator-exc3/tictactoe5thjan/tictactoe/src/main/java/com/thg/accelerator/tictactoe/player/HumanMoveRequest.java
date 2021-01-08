package com.thg.accelerator.tictactoe.player;

import com.thg.accelerator.tictactoe.Position;

import java.util.Scanner;

public class HumanMoveRequest implements MoveRequest {

    private final Player human = new Human();
    private final Scanner scanner = new Scanner(System.in);


    private int requestRow() {
        System.out.println("Enter row");
        return scanner.nextInt();
    }

    private int requestColumn() {
        System.out.println("Enter column");
        return scanner.nextInt();
    }

    @Override
    public Position requestMove() {
        return human.makeMove(requestRow(), requestColumn());
    }
}
