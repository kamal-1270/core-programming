// Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024

import java.util.Scanner;

public class FindAge{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Birth-Year : ");
        int BirthYear=sc.nextInt();
        System.out.print("Enter a Current-Year : ");
        int CurrentYear=sc.nextInt();

        int CurrentAge=CurrentYear-BirthYear;
        System.out.println("Harry's age in"+ CurrentYear +"is : "+CurrentAge);

        sc.close();
    }
}