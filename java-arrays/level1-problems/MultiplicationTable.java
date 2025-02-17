// package  bridgelabz-workspace.core-programming.java-arrays.MultiplicationTable;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[10];
        
        // Compute the multiplication table
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }
        
        // Display the multiplication table
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

    }
}
