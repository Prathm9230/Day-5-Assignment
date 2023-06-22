package com.bridgelabz.coreprograms;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year(in YYYY):");
        int year = sc.nextInt();
        int a = year % 4;
        int b = year % 100;
        int c = year % 400;
        if((a == 0 ) && (b!=0 || c==0))
        {
            System.out.println("Year is leap year:"+year);
        }
        else
        {
            System.out.println("Year is not leap year:"+year);
        }
    }
}
