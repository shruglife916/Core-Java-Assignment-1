package CogentPracticeDay9;
import java.util.*;
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter a number");
        int rollNUmber = sc.nextInt();
        System.out.println("What do you like to do?");
        String fieldOfInterest = sc.nextLine();

        System.out.println("Hey, my name is " + name + "and my roll number is " + rollNUmber + ". My field of interest are " + fieldOfInterest + ".");
    }
}


