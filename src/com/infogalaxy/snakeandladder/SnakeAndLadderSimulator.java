package com.infogalaxy.snakeandladder;

import java.util.Random;

public class SnakeAndLadderSimulator {
    public void playerposition(){
        System.out.println("**Welcome To Snake And Ladder Game**");
        int playerposition = 0;
        System.out.println("Player Position Is : "+playerposition);
    }
    public void rollsDie(){
        Random random = new Random();
        int rollsDie = (int) ((Math.random()*(6-1))+1);
        System.out.println("Die Number Is : "+rollsDie);
    }
    public static void main(String[] args) {
        SnakeAndLadderSimulator player1 = new SnakeAndLadderSimulator();
        player1 . playerposition();
        player1 . rollsDie();
    }
}