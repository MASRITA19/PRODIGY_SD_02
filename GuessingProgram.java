
//the correct number is 49
package com.GuessingProgram;


import java.util.Random;
import java.util.Scanner;


public class GuessingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        boolean guessedCorrectly = false;
     // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess what it is?");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess;
            // Ensure the input is an integer
            try {
                guess = Integer.parseInt(scanner.nextLine());
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        // Close the scanner
        scanner.close();
	}

}