//Author Jerald Huang
//Date 2025-09-17

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        //question 1
        //while ()
        //{
        // code here 
        //}

        //question 2
        //do
        //{
        // code here 
        //} while ();

        //question 3
        /*
        int m = 97;
        while (m <= 195) {
        k = k * k + 3 * m;
        p = p + m + 1;
        m++;
        */

        //question 4
        /*
        int v = 2;
        do {
        k = k * k + 3 * v;
        q = Math.sqrt(q + v + 1);
        v *= 3;
        } while (v <= 195);
        */

        //question 5
        //the while because that is what controls if the loop should keep going or break

        //question 6
        //there is a ; next to do 

        //question 7
        //inf because there is no stop

        //question 8
        //inf because the statement never becomes false 

        //question 9
        //the variable type for j isnt defined (int, double, etc), done variable isnt definded, there a ; after the } get rid of it 

        //question 10
        // it prints "0,0 0,1 0,2 1,0 1,1 1,2 2,0 2,1 2,2 3,0 3,1 3,2"  12 different things printed becuase outer loop runs 4 times inner runs 3 which is 4 times 3, 12

        //question 11
        // using the break statement

        //question 12
        //while loop

        //question 13
        //prints 92.801 because it uses doubles and that how the math work 

        //question 14
           Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter an integer (0 to quit): "); //ask the user to type a number and type 0 to stop
            num = input.nextInt(); //sets num = to the number the user types

            if (num != 0) { //if the number is not 0 then do this
                int square = num * num;//squares the number
                System.out.println("The square is: " + square); //shows the users the number 
            }

        } while (num != 0);//checks again if the number is not 0

        System.out.println("Program ended.");
        input.close();

        //mcq
        //question 1
        //question 2
        //question 3
        //question 4
        //question 5
    }
}
