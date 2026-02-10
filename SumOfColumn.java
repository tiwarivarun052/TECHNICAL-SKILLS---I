// Q: WAP to find sum of every column of a matrix.

import java.util.Scanner;
public class SumOfColumn {
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
        for (int j=0; j<c; j++) {
            int sum = 0;
            for (int i=0; i<r; i++) {
                sum+=matrix[i][j];
            }
            System.out.print("Sum of cols "+(j+1)+": "+sum + " ");
        }
    }
}
