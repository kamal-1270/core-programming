import java.util.Scanner;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();
        
        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        System.out.printf("The Quotient is %d and Reminder is %d of two numbers %d and %d.%n", quotient, remainder, number1, number2);
        
    }
}
