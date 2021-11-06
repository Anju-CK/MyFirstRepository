import java.util.Scanner;
public class game4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;
        int guess = 50;

        while (true) {
            System.out.println("\nI guess " + guess + ".");
            System.out.print("Your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = guess + 1;
            } else if (input.equals("lower")) {
                max = guess - 1;
            } else if (input.equals("correct")) {
                System.out.println("\n" + guess + ", easy peasy!");
                break;
            }

            guess = (min + max) / 2;

            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
                guess = 50;
            }
        }
    }
}
