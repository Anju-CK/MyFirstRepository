import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class game2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int count=0;

        int randomnumber = ThreadLocalRandom.current().nextInt(1, 101);

        do {
            System.out.println("guess?");
            guess = scanner.nextInt();
            count++;

            if (guess < randomnumber) {
                System.out.println("higher");
            } else if (guess > randomnumber) {
                System.out.println("lower");
            } else {
                System.out.println("correct");
            }
        } while (guess != randomnumber);
        System.out.print("guess taken="+ count++);
    }
}

        /*else
        {
            System.out.println("hard luck");
            System.out.print("guess the number= ");
            guess=scanner.nextInt();
            if(guess==randomnumber)
            {
                System.out.println("correct");
            }
            else
            {
                System.out.println("hard luck");}

        }
    }*/


