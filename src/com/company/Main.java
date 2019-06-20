package com.company;

/*
 * Comments Assignment
 * Samuel Duru
 * June 19th, 2019
 */

import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // This line will be ignored by the compiler
        Random random = new Random();
        int from = 1;
        int to = 100;
        int randomNumber = random.nextInt(to - from + 1) + from;
        // Anything after the // is ignored by Java.
        int guessedNumber = 0;

        // Anything after the // is ignored by Java.
        System.out.printf("The number is between %d and %d.\n", from, to);

        // This next line of code will cowrk cos there are no slashes
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
}
