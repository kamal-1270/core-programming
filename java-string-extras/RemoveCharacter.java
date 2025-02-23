import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Input character to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);

        // Remove occurrences of the character
        String modifiedString = "";
        for (char ch : input.toCharArray()) {
            if (ch != charToRemove) {
                modifiedString += ch;
            }
        }

        // Output result
        System.out.println("Modified String: " + modifiedString);

        sc.close();
    }
}
