import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of absents: ");
        int absents = scanner.nextInt();
        if (absents > 12) {
            System.out.println("FA");
            return;
        }
        System.out.println("1. Single Component Course");
        System.out.println("2. Dual Component Course");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter marks: ");
                int marks = scanner.nextInt();
                if (marks >= 90) System.out.println("A");
                else if (marks >= 80) System.out.println("B");
                else if (marks >= 70) System.out.println("C");
                else if (marks >= 60) System.out.println("D");
                else System.out.println("F");
            }
            case 2 -> {
                System.out.print("Enter theory marks: ");
                int theory = scanner.nextInt();
                System.out.print("Enter lab marks: ");
                int lab = scanner.nextInt();
                if (theory < 60) {
                    System.out.println("FA (Theory)");
                    System.out.println("FA (Lab)");
                } else {
                    String theoryGrade = "F";
                    if (theory >= 90) theoryGrade = "A";
                    else if (theory >= 80) theoryGrade = "B";
                    else if (theory >= 70) theoryGrade = "C";
                    else if (theory >= 60) theoryGrade = "D";
                    String labGrade = "F";
                    if (lab >= 90) labGrade = "A";
                    else if (lab >= 80) labGrade = "B";
                    else if (lab >= 70) labGrade = "C";
                    else if (lab >= 60) labGrade = "D";
                    System.out.println("Theory Grade: " + theoryGrade);
                    System.out.println("Lab Grade: " + labGrade);
                }
            }
            default -> System.out.println("Invalid choice");
        }
    }
}