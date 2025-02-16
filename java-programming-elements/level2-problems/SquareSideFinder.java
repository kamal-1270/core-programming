// package .core-programming.java-programming-elements.level2-problems;
// Write a program to find the side of the square whose parameter you read from user 

import java.util.Scanner;
public class SquareSideFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter;

        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();
        
        // Calculate the side of the square
        double side = perimeter / 4;
        
        // Display the output
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f.%n", side, perimeter);
    }
}

