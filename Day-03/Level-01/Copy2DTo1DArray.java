import java.util.*;

public class Copy2DTo1DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of rows and columns
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        // Create a 2D array (matrix)
        int[][] Matrix = new int[rows][cols];

        // Taking input for matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array to store the matrix elements
        int[] array = new int[rows * cols];

        // Copy elements from the 2D array to the 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = Matrix[i][j];
                index++;
            }
        }

         // Display the 2D matrix
        System.out.println("\nThe 2D Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display the 1D array
        System.out.println("\nThe 1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
