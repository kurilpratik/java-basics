
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix2 = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nYour matrix:");
        printMatrix(matrix2);
        
        // Row wise sum
        System.out.println("\nRow-wise sum:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum = sum + matrix2[i][j];
            }
            System.out.println("\nSum of row " + i + " = " + sum);
        }

        sc.close();
    }    

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
    Trick to find rows & cols of 2D arr:
        matrix[][]
        System.out.println(matrix.length); -> gets 
        System.out.println(matrix[i].length); -> cols

*/
