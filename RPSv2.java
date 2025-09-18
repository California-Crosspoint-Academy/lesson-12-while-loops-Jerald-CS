//Author Jerald Huang
//Date 2025-09-17

import java.util.Scanner;

public class RPSv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};

        while (true) {
            System.out.print("Enter rock, paper, or scissors (or quit to stop): ");
            String player = sc.nextLine().toLowerCase();
            if (player.equals("quit")) break;

            int compIndex = (int)(Math.random() * 3);
            String computer = choices[compIndex];
            System.out.println("Computer chose: " + computer);

            if (player.equals(computer)) {
                System.out.println("It's a tie!");
            } else if ((player.equals("rock") && computer.equals("scissors")) ||
                       (player.equals("paper") && computer.equals("rock")) ||
                       (player.equals("scissors") && computer.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println();
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}