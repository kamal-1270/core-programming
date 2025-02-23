import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] freq = new int[256]; // ASCII character frequency array
        char mostFrequentChar = '\0';
        int maxCount = 0;

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequentChar = ch;
            }
        }

        // Output result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        sc.close();
    }
}
