// Q: WAP to find sum of every row of a matrix.

import java.util.Scanner;
public class SumOfRow {
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
        for (int i=0; i<r; i++) {
            int sum = 0;
            for (int j=0; j<c; j++) {
                sum+=matrix[i][j];
            }
            System.out.print("Sum of row "+(i+1)+": "+sum + " ");
        }
    }  
}
