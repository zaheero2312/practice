import java.util.Scanner;

public class compoundcalculator {

    public static void main(String[] args){

        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        double amount;
        int timesCompounded;
        int years;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("How many times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years?: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is R%.2f", years, amount);

        scanner.close();



    }
}