// Write a program the find the distance in yards and miles for the distance provided by user in feets

import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        
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
