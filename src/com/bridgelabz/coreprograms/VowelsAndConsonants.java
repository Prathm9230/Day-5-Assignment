package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char Alpha = sc.nextLine().charAt(0);
        switch(Alpha)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Welcome to vowels family.");
                break;
            default:
                System.out.println("Welcome to consonant family.");
        }
    }
}
