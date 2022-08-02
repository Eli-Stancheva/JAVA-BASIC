package BASICS.PB_MoreExercise_3;

import java.util.Scanner;

public class P1_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (category) {
            case "VIP":
                if (people >= 1 && people <= 4) {
                    budged *= 0.25;
                } else if (people <= 9) {
                    budged *= 0.40;
                } else if (people <= 24) {
                    budged *= 0.50;
                } else if (people <= 49) {
                    budged *= 0.60;
                } else {
                    budged *= 0.75;
                }

                price = 499.99 * people;
                if (price < budged){
                    System.out.printf("Yes! You have %.2f leva left.", budged - price);
                } else{
                    System.out.printf("Not enough money! You need %.2f leva.", price - budged);
                }
                break;

            case "Normal":
                if (people >= 1 && people <= 4) {
                    budged *= 0.25;
                } else if (people <= 9) {
                    budged *= 0.40;
                } else if (people <= 24) {
                    budged *= 0.50;
                } else if (people <= 49) {
                    budged *= 0.60;
                } else {
                    budged *= 0.75;
                }

                price = 249.99 * people;
                if (price < budged){
                    System.out.printf("Yes! You have %.2f leva left.", budged - price);
                } else{
                    System.out.printf("Not enough money! You need %.2f leva.", price - budged);
                }
                break;
        }
    }
}
