package CogentPracticeDay9;
import java.util.*;
public class RectangleArea {

    public static double Area(double length, double width) {
        return length*width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        double length = sc.nextDouble();
        System.out.println("Enter the width");
        double width = sc.nextDouble();
        System.out.println("The area of the rectangle is " + (int) Area(length,width));
    }

}
