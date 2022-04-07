package com.infogalaxy.snakeandladder;

import java.util.Random;

public class SnakeAndLadderSimulator {
    //Position of Player
    int playerposition = 0;
    //Showing The Player Current Position
    public void playerposition() {
        System.out.println("Player Position Is : " + playerposition);
    }

    //Rolling The Die To Get Position
    public void rollsDie() {
        //UC-4-Repeate Till the Player Reaches Winning Position 100
        while (playerposition != 100) {
            Random random = new Random();
            int rollsDie = (int) ((Math.random() * (7 - 1)) + 1);
            System.out.println("Die Number Is : " + rollsDie);

            int option = (int) (Math.random() * (4 - 1) + 1);
            System.out.println("Opsition No : " + option);
            //UC-3 Checking for Opsition to Play
            switch (option) {
                case Constants.NO_PLAY:
                    System.out.println("No Play Arrived.Stay Same Position.");
                    break;
                case Constants.LADDER:
                    System.out.println("HURRAY!!! You Got ladder.");
                    playerposition = playerposition + rollsDie;
                    break;
                case Constants.SNAKE:
                    System.out.println("OOPS!!! You Got Snake.");
                    playerposition = playerposition - rollsDie;
                    if (playerposition < 0) {
                        playerposition = 0;
                    }
                    break;
            }
            playerposition();
        }
    }

    public static void main(String[] args) {
        //Creating Player1 Object
        SnakeAndLadderSimulator player1 = new SnakeAndLadderSimulator();
        //Showing Snake and Ladder Position
        player1.playerposition();
        //Rollinng the Dice
        player1.rollsDie();
    }
}