import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.print("Enter the first number (a): ");
        a = input.nextDouble();
        
        System.out.print("Enter the second number (b): ");
        b = input.nextDouble();
        
        System.out.print("Enter the third number (c): ");
        c = input.nextDouble();
        
        // Perform double operations
        double result1 = a + b * c; 
        double result2 = a * b + c; 
        double result3 = c + a / b;
        double result4 = a % b + c; 

        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f.%n", result1, result2, result3, result4);

    }
}
