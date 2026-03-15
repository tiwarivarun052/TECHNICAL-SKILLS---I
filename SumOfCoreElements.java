// Q(12): WAP to find sum of core elements of a matrix.

import java.util.Scanner;
public class SumOfCoreElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.print("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         if (i != 0 && i != r - 1 && j != 0 && j != c - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c -1; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum: " + sum);
    }
}