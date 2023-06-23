package com.bridgelabz.coreprograms;
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int N = scanner.nextInt();
        int[][] arr = new int[M][N];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Array matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
