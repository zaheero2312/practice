import java.util.Random;
import java.util.Scanner;

public class guessthenumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Welcome to the number guessing game!");
        System.out.printf("Guess a number between %d-%d", min, max);

        do{
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Your guess is too low. Try again");
            }

            else if(guess > randomNumber){
                System.out.println("Your guess is too high. Try again");
            }

            else{
                System.out.println("You're correct! Well done! The number was " + randomNumber);
                System.out.println("It took you " + attempts + " attempts");
            }

        }while(guess != randomNumber);

        scanner.close();

    }
}
