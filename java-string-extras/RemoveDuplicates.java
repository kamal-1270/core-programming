import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder uniqueString = new StringBuilder();

        // Remove duplicate characters
        for (char ch : input.toCharArray()) {
            if (uniqueString.indexOf(String.valueOf(ch)) == -1) {
                uniqueString.append(ch);
            }
        }

        // Output result
        System.out.println("String after removing duplicates: " + uniqueString.toString());

        sc.close();
    }
}
