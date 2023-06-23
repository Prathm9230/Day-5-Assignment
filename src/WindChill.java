
package com.bridgelabz.coreprograms;
import java.util.Scanner;
public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of t (in Fahrenheit):");
        double t = sc.nextDouble();
        System.out.println("Enter the value of v (in miles/hr):");
        double v = sc.nextDouble();
        double w = 0;

        if (t <= 50 && v >= 3 && v <= 120) {
            w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        }

        System.out.println("Wind Chill: " + w);
    }}