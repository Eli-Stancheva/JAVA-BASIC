package BASICS.EXERCISE_3;

import java.util.Scanner;

public class P3_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budged = Integer.parseInt(scanner.nextLine());
        double priceR = 5.00;
        double priceD = 3.80;
        double priceT = 2.80;
        double priceN = 3.00;
        double priceG = 2.50;
        double totalPrice = 0;

        switch (flower) {
            case "Roses":
                if (count > 80) {
                    priceR *= 0.90;
                }
                totalPrice = priceR * count;
                break;

            case "Dahlias":
                if (count > 90) {
                    priceD *= 0.85;
                }
                totalPrice = priceD * count;
                break;

            case "Tulips":
                if (count > 80) {
                    priceT *= 0.85;
                }
                totalPrice = priceT * count;
                break;

            case "Narcissus":
                if (count < 120) {
                    priceN *= 1.15;
                }
                totalPrice = priceN * count;
                break;

            case "Gladiolus":
                if (count < 80) {
                    priceG *= 1.20;
                }
                totalPrice = priceG * count;
                break;
        }
        if (budged >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count, flower, budged - totalPrice );
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budged);
        }
    }
}
