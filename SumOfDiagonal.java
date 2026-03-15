// Q: WAP to sum of diagonal of User-Defined Matrix. 
// Note: Diagonal elements are those elements whose row and column number are same (i==j).

import java.util.Scanner;
public class SumOfDiagonal {
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
        int sum = 0;
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (i==j) {
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements: " + sum);
    }
}
