import java.util.Scanner;

public class Substring {
    //create a method find the substiring a string using charAt() method
    public static String createSubString(String str, int start, int end) {
        // then i am taken a variable is empty
        String res = "";
        //and i am itreate the loop start to end of given string
        for(int i=start;i<end;i++){
            // then store the subtring on res variable
            res+=str.charAt(i);
        }
        // then display the substring on given string
        return res;
    }

    // create a method compare two string again using charAt() method
    public static boolean compareSubstrings(String str1, String str2) {
        //check the both string size are equal or not
        if (str1.length() != str2.length()) {
            // and string length are not equal then return false
            return false;
        }
        //then using for loop check the both string character are same or not using charAt() 
        for (int i = 0; i < str1.length(); i++) {
            // again check the string1 and string2 character are  equal or not
            if (str1.charAt(i) != str2.charAt(i)) {
                // then character are not equal then return false
                return false;
            }
        }
        //otherwise return true (string1 and string2 are equal)
        return true;
    }

    public static void main(String[] args) {
        // using scanner class create a object 
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the str: ");
        String str = s.nextLine();

        System.out.print("Enter start index: ");
        int start = s.nextInt();

        System.out.print("Enter end index: ");
        int end = s.nextInt();

        // and call the method on createsubString() and store the another string
        String subStringCharAt = createSubString(str, start, end);
        // find the substring using substring() method given index start or end
        String subStringBuiltIn = str.substring(start, end);
        //call the method comparesubstring() compare the substring 
        boolean areEqual = compareSubstrings(subStringCharAt, subStringBuiltIn);

        //display the result
        System.out.println("Substring using charAt(): " + subStringCharAt);
        System.out.println("Substring using built-in method: " + subStringBuiltIn);
        System.out.println("Are both substrings equal: " + areEqual);
    }
}
