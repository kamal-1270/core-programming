import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        // Check if the number is positive
        if (number < 1) {
            System.out.println("Error: Please enter a positive integer.");
            sc.close();
            return;
        }
        
        // Create a String array to store results
        String[] results = new String[number + 1];
        
        // Loop through numbers and apply FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        
        // Display the results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
