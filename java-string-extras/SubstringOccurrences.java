import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string and substring
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the substring to count: ");
        String subString = sc.nextLine();

        int count = 0, index = 0;

        // Find occurrences of the substring
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }

        // Output result
        System.out.println("Occurrences of \"" + subString + "\": " + count);

        sc.close();
    }
}
