package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        int stake = 100;
        int bet = 1;
        int wins = 0;
        int lose = 0;
        for (int day = 1; day <= 20; day++) {
            while (stake > 50 && stake < 150) {
                double gameCheck = Math.floor(Math.random() * 10) % 2;
                if (bet == gameCheck) {
                    // System.out.println("you won the game");
                    stake++;
                } else {
                    // System.out.println("you lost the game")
                    stake--;
                }
            }
            if (stake == 50) {
                lose++;
                System.out.println("Day" + day + " Lost");
            } else {
                wins++;
                System.out.println("Day" + day + " Won");

            }
        }
        int finalAmount = wins * 50 - lose * 50;
        if (finalAmount > 0)
            System.out.println("After 20 days Gambler won:" + finalAmount);
        else if (finalAmount < 0)
            System.out.println("After 20 days Gambler lost:" + finalAmount);
        else
            System.out.println("No profit or lose");

    }
}
