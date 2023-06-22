package com.bridgelabz.coreprograms;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        int power;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        if (N < 0 || N >= 31) {
            System.out.println("Please enter valid value for N (i.e 0-30)");
            return;
        }
        for (int i = 0; i <= N; i++) {
            power = (int) Math.pow(2, i);
            System.out.println(power);
        }
    }
}
