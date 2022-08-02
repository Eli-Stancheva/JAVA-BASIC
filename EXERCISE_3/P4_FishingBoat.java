package BASICS.EXERCISE_3;

import java.util.Scanner;

public class P4_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budged = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double priceS = 3000;
        double priceSumAut = 4200;
        double priceW = 2600;
        double totalPrice = 0;

        switch (season) {
            case "Spring":
                if (fishers <= 6) {
                    priceS *= 0.90;
                } else if (fishers <= 11) {
                    priceS *= 0.85;
                } else if (fishers > 12) {
                    priceS *= 0.75;
                }
                if (fishers % 2 == 0) {
                    priceS *= 0.95;
                }
                totalPrice = priceS;
                break;
            case "Summer":
                if (fishers <= 6) {
                    priceSumAut *= 0.90;
                } else if (fishers <= 11) {
                    priceSumAut *= 0.85;
                } else if (fishers > 12) {
                    priceSumAut *= 0.75;
                }
                if (fishers % 2 == 0) {
                    priceSumAut *= 0.95;
                }
                totalPrice = priceSumAut;
                break;
            case "Autumn":
                if (fishers <= 6) {
                    priceSumAut *= 0.90;
                } else if (fishers <= 11) {
                    priceSumAut *= 0.85;
                } else if (fishers > 12) {
                    priceSumAut *= 0.75;
                }
                totalPrice = priceSumAut;
                break;
            case "Winter":
                if (fishers <= 6) {
                    priceW *= 0.90;
                } else if (fishers <= 11) {
                    priceW *= 0.85;
                } else if (fishers > 12) {
                    priceW *= 0.75;
                }
                if (fishers % 2 == 0) {
                    priceW *= 0.95;
                }
                totalPrice = priceW;
                break;
        }
        if (budged >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budged - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budged);
        }
    }
}
