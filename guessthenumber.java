// Importing random class
import java.util.Random;

// Importing scanner class
import java.util.Scanner;

public class guessthenumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Variables
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Welcome to the number guessing game!");

        // Print instruction to guess between min and max variable values
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt(); // User to input their guess
            attempts++; // Adds total attempts until correct answer is given

            // Hint to user that the guess is less than the random number
            if(guess < randomNumber){
                System.out.println("Your guess is too low. Try again");
            }

            // Hint to user that the guess is more than the random number
            else if(guess > randomNumber){
                System.out.println("Your guess is too high. Try again");
            }

            // Prints success and number of attempts it took
            else{
                System.out.println("You're correct! Well done! The number was " + randomNumber);
                System.out.println("It took you " + attempts + " attempts");
            }

        }while(guess != randomNumber);

        scanner.close();

    }
}