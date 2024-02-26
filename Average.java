package CogentPracticeDay9;

import java.util.*;
public class Average {
    public static int Average(int num1, int num2, int num3) {

        return (num1 + num2 + num3)/3;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        System.out.println("The average is " + Average(num1,num2,num3));
    }
}
