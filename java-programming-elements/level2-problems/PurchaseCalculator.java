import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice;
        int quantity;
        
        System.out.print("Enter the unit price of the item (INR): ");
        unitPrice = input.nextDouble();
        
        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();
        
        // Calculate total price
        double totalPrice = unitPrice * quantity;
        
        // Display the output
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and the unit price is INR %.2f.%n", totalPrice, quantity, unitPrice);
        
    }
}
