import java.util.Scanner;
import java.util.ArrayList;

public class StringSplit {
    public static String[] customSplit(String str) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                words.add(word.toString());
                word.setLength(0);
            } else {
                word.append(ch);
            }
        }
        words.add(word.toString());
        return words.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] customWords = customSplit(str);
        String[] builtInWords = str.split(" ");

        System.out.println("Custom Split: " + java.util.Arrays.toString(customWords));
        System.out.println("Built-in Split: " + java.util.Arrays.toString(builtInWords));
    }
}
