import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] numbers = new double[10]; 
        double total = 0.0; 
        int index = 0; 
        
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            
            if (num <= 0 || index == 10) {
                break; // Exit loop if 0, negative number, or max size reached
            }
            
            numbers[index] = num;
            index++;
        }
        
        // Compute total sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        
        // Display stored numbers
        System.out.print("Stored numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        // Display total sum
        System.out.println("\nTotal sum: " + total);

    }
}
