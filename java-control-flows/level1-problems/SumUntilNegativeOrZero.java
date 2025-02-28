import java.util.Scanner;
public class SumUntilNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();
            
            // Break the loop if the user enters 0 or a negative number
            if (number <= 0) {
                break;
            }
            
            total += number;
        }
        
        System.out.println("The total sum is: " + total);
    }
}
