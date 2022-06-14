package com.bridgelabz;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        int bet = 1;
        int totalAmount = 100;
        double gameCheck = Math.floor(Math.random() * 10) % 2;
        if (bet == gameCheck) {
            System.out.println("Gambler win");
            totalAmount++;
        } else {
            System.out.println("Gambler loose");
            totalAmount--;

        }
        System.out.println("Total amount :" + totalAmount);
    }

}
