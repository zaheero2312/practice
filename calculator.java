// Importing function for user input
import java.util.Scanner;

public class calculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Variables
        double number1;
        double number2;
        char operator;
        double result = 0;

        // Requesting first number from user
        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();

        // Requesting operator from user
        System.out.print("Enter the operator: ");
        operator = scanner.next().charAt(0);

        // Checking if user selected a valid operator before result
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '^') {
            System.out.println("That is not a valid operator.");
            return;  // Exit the program
        }

        // Requesting second number from user
        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        // Performs operations based on selected operator
        switch(operator){
            case '+' -> result = number1 + number2; // Addition
            case '-' -> result = number1 - number2; // Subtraction
            case '*' -> result = number1 * number2; // Multiplication
            case '/' -> { // Division | Cannot divide by zero
                if(number2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                else{
                    result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);

            }

        // Print result without scientific notation
        System.out.printf("Your result is %f%n", result);

        scanner.close();

    }
}