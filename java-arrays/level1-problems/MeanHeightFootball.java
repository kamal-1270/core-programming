import java.util.Scanner;

public class MeanHeightFootball {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Define an array to store the heights of 11 players
        double[] heights = new double[11];
        
        // Get input from the user
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        
        // Calculate the sum of all heights
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        
        // Calculate the mean height
        double mean = sum / 11;
        
        // Print the mean height
        System.out.printf("The mean height of the football team is: %.2f meters\n", mean);
    }
}
