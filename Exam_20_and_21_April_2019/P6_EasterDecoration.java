package BASICS.Exam_20_and_21_April_2019;

import java.util.Scanner;

public class P6_EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 1; i <= people; i++) {
            String option = scanner.nextLine();
            double price = 0;
            int counter = 0;

            while (!option.equals("Finish")) {
                counter++;

                switch (option) {
                    case "basket":
                        price += 1.50;
                        break;
                    case "wreath":
                        price += 3.80;
                        break;
                    case "chocolate bunny":
                        price += 7.00;
                        break;
                }
                option = scanner.nextLine();
            }
            if (counter % 2 == 0) {
                double discount = price * 0.20;
                price -= discount;
            }
            System.out.printf("You purchased %d items for %.2f leva.\n", counter, price);
            total += price;
        }
        System.out.printf("Average bill per client is: %.2f leva.", total / people);
    }
}
