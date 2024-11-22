package homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String wrd = "BRYCE";
        int try = 0;
        Scanner bryscan = new bryscan(System.in);

        while (true) {
            //sout doesn't work as a shortcut :(
            System.out.print("Enter your 5-letter guess: ");
            String guess = scanner.nextLine().toUpperCase();

            // Ensure the guess is exactly 5 letters
            if (guess.length() != 5) {
                System.out.println("Please enter exactly 5 letters.");
                continue;
            }

            // Check the guess and provide feedback
            int correctPosition = 0;
            int incorrectPosition = 0;
            boolean[] targetUsed = new boolean[5]; // Track used letters from target word
            boolean[] guessUsed = new boolean[5];  // Track used letters from guess

            // First pass: Check for correct positions
            for (int i = 0; i < 5; i++) {
                if (guess.charAt(i) == targetWord.charAt(i)) {
                    correctPosition++;
                    targetUsed[i] = true;
                    guessUsed[i] = true;
                }
            }

            // Second pass: Check for incorrect positions
            for (int i = 0; i < 5; i++) {
                if (guessUsed[i]) continue; // Skip if this letter is already in the correct position

                for (int j = 0; j < 5; j++) {
                    if (!targetUsed[j] && guess.charAt(i) == targetWord.charAt(j) && !guessUsed[i]) {
                        incorrectPosition++;
                        targetUsed[j] = true; // Mark target letter as used
                        guessUsed[i] = true;  // Mark guess letter as used
                        break; // Stop looking for this letter in the target word
                    }
                }
            }

            // Increment the attempt count
            attemptCount++;

            // Display feedback
            System.out.println(correctPosition + " letters in the correct position.");
            System.out.println(incorrectPosition + " letters are correct but in the wrong position.");

            // If the guess is correct
            if (correctPosition == 5) {
                System.out.println("Congratulations! You guessed the word in " + attemptCount + " attempts.");
                break; // Exit the loop if the user guesses correctly
            }
        }

      
        scanner.close();
    }
}
