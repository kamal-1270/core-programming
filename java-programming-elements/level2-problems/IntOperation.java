import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter the first number (a): ");
        a = input.nextInt();
        
        System.out.print("Enter the second number (b): ");
        b = input.nextInt();
        
        System.out.print("Enter the third number (c): ");
        c = input.nextInt();
        
        // Perform integer operations
        int result1 = a + b * c;
        int result2 = a * b + c; 
        int result3 = c + a / b; 
        int result4 = a % b + c; 
        
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d.%n", result1, result2, result3, result4);

    }
}
