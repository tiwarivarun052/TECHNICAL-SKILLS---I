// Q: Rotate a square matrix by 90 degree clockwise (bottom right as a center).
// Pseudo code: (1) Transpose of matrix. (2) Reverse each row.

import java.util.Scanner;
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.print("Enter elements: ");
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose: ");
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
