import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Input word to replace
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        // Input replacement word
        System.out.print("Enter the replacement word: ");
        String newWord = sc.next();

        // Replace word in sentence
        String modifiedSentence = sentence.replace(oldWord, newWord);

        // Output result
        System.out.println("Modified Sentence: " + modifiedSentence);

        sc.close();
    }
}
