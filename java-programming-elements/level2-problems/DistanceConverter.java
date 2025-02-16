import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceInFeet;
        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();
        
        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        
        // Convert feet to cm, inches, and feet for height display
        double heightInCm = distanceInFeet * 30.48 / 12;
        double heightInInches = distanceInFeet * 12;
        double heightInFeetValue = distanceInFeet;
        
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f.%n", heightInCm, heightInFeetValue, heightInInches);
    }
}
