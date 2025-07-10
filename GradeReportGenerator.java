import java.util.Scanner;

public class GradeReportGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students? ");
        int totalStudents = input.nextInt();
        input.nextLine(); // consume leftover newline

        String[] studentNames = new String[totalStudents];
        String[] studentAddresses = new String[totalStudents];
        double[][] subjectMarks = new double[totalStudents][5]; // 5 subjects

        // Input Loop
        for (int s = 0; s < totalStudents; s++) {
            System.out.println("\n-- Student " + (s + 1) + " Info --");
            System.out.print("Full Name: ");
            studentNames[s] = input.nextLine();
            System.out.print("Residential Address: ");
            studentAddresses[s] = input.nextLine();

            System.out.println("Enter marks for 5 subjects:");
            for (int subj = 0; subj < 5; subj++) {
                System.out.print("Subject " + (subj + 1) + " Marks: ");
                subjectMarks[s][subj] = input.nextDouble();
            }
            input.nextLine(); // consume newline after last mark
        }

        // Display Output
        System.out.println("\n=== Grade Report ===");
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("\nStudent #" + (i + 1));
            System.out.println("Name     : " + studentNames[i]);
            System.out.println("Address  : " + studentAddresses[i]);

            double sum = 0;
            for (double mark : subjectMarks[i]) {
                sum += mark;
            }
            double average = sum / 5;
            char finalGrade = computeGrade(average);

            System.out.printf("Average  : %.2f\n", average);
            System.out.println("Grade    : " + finalGrade);
        }
    }

    // Grade calculator based on average marks
    public static char computeGrade(double avg) {
        if (avg >= 90)
            return 'A';
        else if (avg >= 80)
            return 'B';
        else if (avg >= 70)
            return 'C';
        else if (avg >= 60)
            return 'D';
        else
            return 'F';
    }
}
