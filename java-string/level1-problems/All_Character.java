import java.util.Arrays;
import java.util.Scanner;

public class All_Character {

    //create a method charArray() on given variable a string 
    public static char[] getCharacters(String str) {
        // create a character array and size of given string length
        char[] charArr = new char[str.length()];
        //iterate  string using for loop 
        for (int i = 0; i < str.length(); i++) {
            //and store the character array on string charAt()
            charArr[i] = str.charAt(i);
        }
        //display the result
        return charArr;
    }

    //create a boolean type method of comparion two character array
    public static boolean comparison(char charArr1[], char charArr2[]) {
        //check the char array length are equal or not
        if (charArr1.length != charArr2.length) {
            //both char array not equal then return false
            return false;
        }
        //iterate the charArr1 using for loop 
        for (int i = 0; i < charArr1.length; i++) {
            //both char array are not equal 
            if (charArr1[i] != charArr2[i]) {
                // then return false
                return false;
            }
        }
        //otherwise return true and both char array are equal
        return true;
    }

    public static void main(String[] args) {
        // create a object using scanner class
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        //taken a string
        String str = s.nextLine();

        //call and store the getCharacters() method on char array 
        char use[] = getCharacters(str);

        char builtArr[] = str.toCharArray();

        boolean areEqual = comparison(builtArr, use);

        //display 
        System.out.println("Characters using user-defined method: " + Arrays.toString(use));
        System.out.println("Characters using built-in toCharArray(): " + Arrays.toString(builtArr));
        System.out.println("Are both character arrays equal: " + areEqual);

    }
}
