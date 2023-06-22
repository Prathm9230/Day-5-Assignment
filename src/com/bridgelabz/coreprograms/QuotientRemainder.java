package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("Enter the devisor:");
        int devisor = sc.nextInt();


        int Quotient = num/devisor;
        System.out.println("Quotient for given num is:"+Quotient);
        int remainder = num % devisor;
        System.out.println("remainder for given num is:"+remainder);
    }
}
