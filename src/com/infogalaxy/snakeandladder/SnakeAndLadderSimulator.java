
package com.infogalaxy.snakeandladder;

import java.util.Random;

import static java.lang.System.out;

public class SnakeAndLadderSimulator {
    //Position of Player
    int playerposition = 0;
    //Showing The Player Current Position
    public void playerposition() {
        out.println("Player Position Is : " + playerposition);
    }
    //Rolling The Die To Get Position
    public void rollsDie() {
            Random random = new Random();
            int rollsDie = (int) ((Math.random() * (6 - 1)) + 1);
            out.println("Die Number Is : " + rollsDie);
            //UC-3 Checking for Opsition to Play
            int option = (int) (Math.random() * (3 - 1) + 1);
            out.println("Opsition No : " + option);
            switch (option) {
                case Constants.NO_PLAY:
                    System.out.println("No Play Arrived.Stay Same Position.");
                    break;
                case Constants.LADDER:
                    out.println("HURRAY!!! You Got ladder.");
                    playerposition = playerposition + rollsDie;
                    break;
                case Constants.SNAKE:
                    if (playerposition == 0) {
                        playerposition = -(playerposition);
                    }
                    out.println("OOPS!!! You Got Snake.");
                    playerposition = playerposition + rollsDie;
                    break;
            }
        }

    public static void main(String[] args) {
        //Creating Player1 Object
        SnakeAndLadderSimulator player1 = new SnakeAndLadderSimulator();
        player1.playerposition();
        //Showing The Player1 Position
        player1.rollsDie();
        //Rolling The Die
        player1.playerposition();
    }
}