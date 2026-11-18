import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again;

        do {
            int number = (int)(Math.random() * 100) + 1;
            int guess = 0;
            int count = 0;

            System.out.println("Guess a number between 1 and 100");

            while (guess != number && count < 5) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                count++;

                if (guess == number)
                    System.out.println("Yes, the number is " + number);
                else if (guess > number)
                    System.out.println("Your guess is too high");
                else
                    System.out.println("Your guess is too low");
            }

            if (guess != number)
                System.out.println("No more trials. The number was " + number);

            System.out.print("Continue playing? [Y/N]: ");
            again = input.next();

        } while (again.toUpperCase().indexOf("Y") == 0);
    }
}




























































