package BASICS.Exam_14_and_15_July_2021;

import java.util.Scanner;

public class P5_ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seeCount = Integer.parseInt(scanner.nextLine());
        int mountainCount = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        double price = 0;
        double priceS = 0;
        double priceM = 0;

        while (!input.equals("Stop")) {
            String vacation = input;

            if (vacation.equals("sea")) {
                priceS = priceS + 680;
                seeCount--;
            } else if (vacation.equals("mountain")) {
                priceM = priceM + 499;
                mountainCount--;
            }

            if (seeCount <= 0 && mountainCount <= 0) {
                break;
            }

            price = priceS + priceM;
            input = scanner.nextLine();
        }

        if (seeCount <= 0 && mountainCount <= 0) {
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %.0f leva.", price);
        } else {
            System.out.printf("Profit: %.0f leva.", price);
        }
    }
}
