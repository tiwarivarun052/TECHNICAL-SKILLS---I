// Q: WAP to read and print a User-Defined Matrix.

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.print("Enter elements: ");
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}