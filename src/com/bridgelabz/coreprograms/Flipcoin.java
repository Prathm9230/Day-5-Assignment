package com.bridgelabz.coreprograms;
import java.util.Random;

public class Flipcoin {
    public static void main(String[] args) {
        int numFlips = 5;  // Number of times to flip the coin

        int headsCount = 0;
        int tailsCount = 0;

        Random random = new Random();

        for (int i = 0; i < numFlips; i++) {
            double randomValue = random.nextDouble(); // Generates a random value between 0.0 and 1.0

            if (randomValue < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        double headsPercentage = (headsCount / (double) numFlips) * 100;
        double tailsPercentage = (tailsCount / (double) numFlips) * 100;

        System.out.println("Percentage of Heads: " + headsPercentage);
        System.out.println("Percentage of Tails: " + tailsPercentage);
    }
}
