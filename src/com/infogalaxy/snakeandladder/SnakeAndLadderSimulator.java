package com.infogalaxy.snakeandladder;

import java.util.Random;

public class SnakeAndLadderSimulator {
    public void playerposition(){
        System.out.println("**Welcome To Snake And Ladder Game**");
        int playerposition = 0;
        System.out.println("Player Position Is : "+playerposition);
    }

    public static void main(String[] args) {
        SnakeAndLadderSimulator player1 = new SnakeAndLadderSimulator();
        player1 . playerposition();
    }
}