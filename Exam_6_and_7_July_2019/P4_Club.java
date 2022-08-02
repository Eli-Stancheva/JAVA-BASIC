package BASICS.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class P4_Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double earnings = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double priceDrink = 0;
        double price = 0;
        double discountPrice = 0;

        while (!input.equals("Party!")){
            String drink = input;
            int countDrink = Integer.parseInt(scanner.nextLine());

            priceDrink = drink.length();
            price = priceDrink * countDrink;

            if (price % 2 != 0){
                price = price * 0.75;
            }

            discountPrice = discountPrice + price;

            if (discountPrice >= earnings){
                break;
            }

            input = scanner.nextLine();
        }
        if (discountPrice >= earnings){
            System.out.println("Target acquired.");
        } else {
            System.out.printf("We need %.2f leva more.\n", earnings - discountPrice);
        }
        System.out.printf("Club income - %.2f leva.", discountPrice);
    }
}
