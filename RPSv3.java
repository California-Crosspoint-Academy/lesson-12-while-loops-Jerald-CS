//Author Jerald Huang
//Date 2025-09-17

import java.util.Scanner;

public class RPSv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        int playerScore = 0, computerScore = 0;

        while (true) {
            System.out.print("Enter r/p/s (rock/paper/scissors) or q to quit: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("q")) break;

            String player = switch(input) {
                case "r" -> "rock";
                case "p" -> "paper";
                case "s" -> "scissors";
                default -> "";
            };

            if (player.equals("")) {
                System.out.println("Invalid input!");
                continue;
            }

            String computer = choices[(int)(Math.random() * 3)];
            System.out.println("Computer chose: " + computer);

            if (player.equals(computer)) {
                System.out.println("It's a tie!");
            } else if ((player.equals("rock") && computer.equals("scissors")) ||
                       (player.equals("paper") && computer.equals("rock")) ||
                       (player.equals("scissors") && computer.equals("paper"))) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }

            System.out.println("Score -> You: " + playerScore + " | Computer: " + computerScore);
            System.out.println();
        }

        System.out.println("Final Score -> You: " + playerScore + " | Computer: " + computerScore);
        System.out.println("Thanks for playing!");
        sc.close();
    }
}