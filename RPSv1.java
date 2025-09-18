//Author Jerald Huang
//Date 2025-09-17

import java.util.Scanner;

public class RPSv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};

        System.out.print("Enter rock, paper, or scissors: ");
        String player = sc.nextLine().toLowerCase();

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

        sc.close();
    }
}
   
