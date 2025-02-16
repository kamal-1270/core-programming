// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 

import java.util.Scanner;
public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height;
        
        System.out.print("Enter base of the triangle in cm: ");
        base = input.nextDouble();
        
        System.out.print("Enter height of the triangle in cm: ");
        height = input.nextDouble();
        
        // Calculate area in square cm and square inches
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516; // 1 square inch = 6.4516 square cm
        
        // Convert height to feet and inches
        double heightInInches = height / 2.54;
        double heightInFeet = heightInInches / 12;
        
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f.%n", height, heightInFeet, heightInInches);
        
    }
}
