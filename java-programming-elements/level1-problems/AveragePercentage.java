// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM

import java.util.Scanner;

class AveragePercentage{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Mark of Math : ");
        int Math=sc.nextInt();
        System.out.print("Enter a Mark of Physics : ");
        int Physics=sc.nextInt();
        System.out.print("Enter a Mark of Chemistry : ");
        int Chemistry=sc.nextInt();

        float percent=(Math+Physics+Chemistry)/3;
        System.out.println("Sam's average marks in PCM is : "+percent);

        sc.close();
    }
}