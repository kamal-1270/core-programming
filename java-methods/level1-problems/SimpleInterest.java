import java.util.Scanner;

public class SimpleInterest {
    
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);

        System.out.println("\nThe Simple Interest is: " + interest);
        System.out.println("For Principal: " + principal + ", Rate: " + rate + "%, Time: " + time + " years.");
        
        sc.close(); // Close the Scanner to prevent resource leak
    }
}
