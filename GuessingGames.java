import java.util.Scanner;

public class GuessingGames {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int totalScore = 0;
    boolean playAgain = true;

    while (playAgain) {
      // Generate a random number between 1 and 100
      int answer = (int)(Math.random() * 100) + 1;
      int attemptsLeft = 5;
      boolean guessedCorrectly = false;

      System.out.println("Welcome to the Number Guessing Game!");
      System.out.println("A number between 1 and 100 has been chosen.");
      System.out.println("You have 5 tries to guess the number.");

      while (attemptsLeft > 0) {
        System.out.print("Enter your guess: ");
        int guess = input.nextInt();

        if (guess == answer) {
          System.out.println("You guessed the number! You win!");
          guessedCorrectly = true;
          totalScore += attemptsLeft; // score based on remaining tries
          break;
        } else if (guess > answer) {
          System.out.println("Your guess is too high.");
        } else {
          System.out.println("Your guess is too low.");
        }

        attemptsLeft--;
        System.out.println("You have " + attemptsLeft + " tries left.");
      }

      if (!guessedCorrectly) {
        System.out.println("You ran out of tries. You lose! Better luck next time!");
      }

      System.out.println("Your total score so far is: " + totalScore);
      System.out.print("Do you want to play again? (yes/no): ");
      String response = input.next();

      if (response.equalsIgnoreCase("no")) {
        playAgain = false;
      }
    }

    System.out.println("Thank you for playing! Your final score is: " + totalScore);
    input.close();
  }
}
