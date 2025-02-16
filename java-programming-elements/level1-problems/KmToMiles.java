//3. Create a program to convert the distance of 10.8 kilometers to miles.
public class KmToMiles {
    public static void main(String[] args) {
        double kilometers = 10.8;
        
        // Conversion factor: 1 km = 1.6 miles
        double miles = kilometers / 1.6;

        System.out.printf("The distance %.2f km in miles is %.2f miles.%n", kilometers, miles);
    }
}
