package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        int bet = 1;
        int wins = 0;
        int lose = 0;
        for (int day = 1; day <= 30; day++) {
            int stake = 100;
            while (stake > 50 && stake < 150) {
                double gameCheck = Math.floor(Math.random() * 10) % 2;
                if (bet == gameCheck) {
                    //System.out.println("you won the game");
                    stake++;
                } else {
                    //System.out.println("you lost the game");
                    stake--;
                }
            }
            if (stake == 50) {
                lose++;
                System.out.println("Day" + day + " is a unlucky day where gambler lost maximum");
            } else {
                wins++;
                System.out.println("Day" + day + " is a lucky day where gambler wins maximum");

            }
        }
        int finalAmount = wins * 50 - lose * 50;
        if (finalAmount > 2000) {
            int profitAmount = finalAmount - 2000;
            System.out.println("After 30 days Gambler won:" + profitAmount);
        } else if (finalAmount < 0) {
            int lossAmount = 2000 - finalAmount;
            System.out.println("After 30 days Gambler lost:" + lossAmount);
        }else
            System.out.println("No profit or lose");
        System.out.println("In this month " + wins + " Days Won. " + lose + " Days lost");

    }
}