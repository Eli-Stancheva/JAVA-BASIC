package BASICS.EXERCISE_6;

import java.util.Scanner;

public class P3_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int prime = 0;
        int nonPrime = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                prime += number;
            } else {
                nonPrime += number;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n" +
                "Sum of all non prime numbers is: %d", prime, nonPrime);
    }
}
