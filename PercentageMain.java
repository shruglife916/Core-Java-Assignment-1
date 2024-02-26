package CogentPracticeDay9;

abstract class Marks {
    public int[] marks;

    public Marks(int [] marks) {
        this.marks = marks;
    }

    public abstract double getPercentage();
}

class A extends Marks {
    public A(int... marks) {
        super(marks);
    }

    @Override
    public double getPercentage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double percentage = ((double) totalMarks / 300) * 100; // Each subject is out of 100
        return percentage;
    }
}

class B extends Marks {
    public B(int... marks) {
        super(marks);
    }

    @Override
    public double getPercentage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double percentage = ((double) totalMarks / 400) * 100; // Each subject is out of 100
        return percentage;
    }
}

public class PercentageMain {
    public static void main(String[] args) {
        // For Student A
        A studentA = new A(85, 90, 95); // Marks for three subjects
        double percentageA = studentA.getPercentage();
        System.out.println("Percentage of Student A: " + percentageA);

        // For Student B
        B studentB = new B(75, 80, 85, 90); // Marks for four subjects
        double percentageB = studentB.getPercentage();
        System.out.println("Percentage of Student B: " + percentageB);
    }
}
