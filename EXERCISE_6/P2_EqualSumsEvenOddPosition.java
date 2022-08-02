package BASICS.EXERCISE_6;

import java.util.Scanner;

public class P2_EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        for (int i = num1; i <= num2; i++) {
            int number = i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 6; j > 0; j--) {
                int digit = number % 10;
                            number /= 10;

                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
