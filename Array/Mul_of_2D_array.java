import java.util.Scanner;

public class Mul_of_2D_array {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of the matrices
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();

        // Initialize the matrices
        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];
        int[][] sumMatrix = new int[r][c];

        // Input first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Calculate the sum of the two matrices
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sumMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        // Output the resulting sum matrix
        System.out.println("Sum of the two matrices is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
