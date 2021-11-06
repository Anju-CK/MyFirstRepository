import java.util.Scanner;
public class statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum possible score for this exam: ");
        int maxScore = scanner.nextInt();

        System.out.print("How many students took the exam: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];

        System.out.println("\nEnter each student's score.");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        System.out.println("\n--- Statistics ---");

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            double studentScore = scores[i];
            double studentPercentage = ((double)scores[i] / maxScore) * 100;
            System.out.println("Student " + (i + 1) + ": " + studentScore + "/" + maxScore + " (" + studentPercentage + "%)");
            sum += studentScore;
        }

        double mean = (double)sum / scores.length;
        double meanPercentage = (mean / maxScore) * 100;
        System.out.println("Mean: " + mean + "/" + maxScore + " (" + meanPercentage + "%)");
    }
}
