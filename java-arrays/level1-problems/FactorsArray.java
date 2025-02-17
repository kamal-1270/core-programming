import java.util.Scanner;
import java.util.Arrays;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Initialize factor array and variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    factors = Arrays.copyOf(factors, maxFactor);
                }
                factors[index++] = i;
            }
        }
        
        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}
