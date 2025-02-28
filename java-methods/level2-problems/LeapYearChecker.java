import java.util.Scanner;
public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if(year < 1582) {
            return false;
        }
        if(year % 400 == 0) {
            return true;
        }
        if(year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(year + " is " + (isLeapYear(year) ? "a Leap Year." : "Not a Leap Year."));
    }
}
