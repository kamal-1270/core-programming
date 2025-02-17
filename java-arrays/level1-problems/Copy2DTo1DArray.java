import java.util.Scanner;

public class Copy2DTo1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        
        // Create a 2D array (Matrix)
        int[][] matrix = new int[rows][columns];
        
        // Get user input for matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Create a 1D array to store elements of 2D array
        int[] array = new int[rows * columns];
        int index = 0;
        
        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }
        
        // Display the 1D array
        System.out.println("The elements of the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
