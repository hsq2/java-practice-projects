package com.thg.accelerator.tictactoe.player;

public class PlayerFactory {

    public Player getPlayer(String myPlayer) {
        if (myPlayer.equalsIgnoreCase("human")) {
            return new Human();
        } else if (myPlayer.equalsIgnoreCase("computer")) {
            return new Computer();
        }
        return null;
    }
}
