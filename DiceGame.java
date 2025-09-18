import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        while(playAgain) {
            // Roll two dice
            int die1 = (int)(Math.random() * 6) + 1; // 1-6
            int die2 = (int)(Math.random() * 6) + 1; // 1-6
            int sum = die1 + die2;

            System.out.println("You rolled: " + die1 + " and " + die2);
            System.out.println("Sum of dice: " + sum);

            // Optional challenge: guess the sum
            System.out.print("Guess the sum (or 0 to skip): ");
            int guess = sc.nextInt();
            if (guess != 0) {
                if (guess == sum) {
                    System.out.println("Correct! You guessed the sum!");
                } else {
                    System.out.println("Wrong guess. The sum was " + sum);
                }
            }

            // Ask if they want to play again
            System.out.print("Play again? (yes=1 / no=0): ");
            int choice = sc.nextInt();
            playAgain = (choice == 1);
            System.out.println();
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}