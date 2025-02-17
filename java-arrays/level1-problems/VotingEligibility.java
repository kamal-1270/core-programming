import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array 10 ");
        int[] ages = new int[10];
        
        // Taking input for 10 students' ages
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }
        
        // Checking voting eligibility
        for (int i=0;i<ages.length;i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age entered.");
            } else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }
    }
}
