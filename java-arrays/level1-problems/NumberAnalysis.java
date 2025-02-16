import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Checking for positive, negative, or zero and even or odd for positive numbers
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is positive and even.");
                } else {
                    System.out.println("The number " + num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println("The number " + num + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // Comparing the first and last elements of the array
        if (numbers[0] > numbers[4]) {
            System.out.println("The first element " + numbers[0] + " is greater than the last element " + numbers[4] + ".");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("The first element " + numbers[0] + " is less than the last element " + numbers[4] + ".");
        } else {
            System.out.println("The first and last elements are equal.");
        }
    }
}
