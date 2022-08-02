package BASICS.LAB_2;

import java.util.Scanner;

public class P7_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double sum = (puzzleCount * 2.60) + (dollsCount * 3) + (teddyCount * 4.10) + (minionsCount * 8.20) + (trucksCount * 2);

        int countAllToys = puzzleCount + dollsCount + teddyCount + minionsCount + trucksCount;

        if (countAllToys >= 50) {
            sum = sum - (sum * 0.25);
        }

        sum = sum * 0.90;
        double diff = Math.abs(sum - tripPrice);
        if (sum >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
