package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        double Harmonic=0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                Harmonic = (1.0 / i);
                sum+= Harmonic;
            }
            System.out.println("Sum of Harmonic number upto N is:"+sum);
        }
        else
        {
            System.out.println("Enter the valid value for N (N>0)");
        }
    }
}
