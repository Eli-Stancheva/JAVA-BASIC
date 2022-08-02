package BASICS.PB_MoreExercise_3;

import java.util.Scanner;

public class P6_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmMount = Double.parseDouble(scanner.nextLine());
        double discount = 0;
        double price = 0;
        double km = 0;

        if (kmMount <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                km = kmMount * 4 * 0.75;
                discount = km * 0.10;
                price = km - discount;
                System.out.printf("%.2f",price);
            } else if (season.equals("Summer")) {
                km = kmMount * 4 * 0.90;
                discount = km * 0.10;
                price = km - discount;
                System.out.printf("%.2f",price);
            } else if (season.equals("Winter")) {
                km = kmMount * 4 * 1.05;
                discount = km * 0.10;
                price = km - discount;
                System.out.printf("%.2f",price);
            }
        } else if (kmMount <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                km = kmMount * 4 * 0.95;
                discount = km * 0.10;
                price = km - discount;
                System.out.printf("%.2f",price);
            } else if (season.equals("Summer")) {
                km = kmMount * 4 * 1.10;
                discount = km * 0.10;
                price = km - discount;
                System.out.printf("%.2f",price);
            } else if (season.equals("Winter")) {
                km = kmMount * 4 * 1.25;
                discount = km * 0.10;
                price = km - discount;
                System.out.printf("%.2f",price);
            }
        } else if (kmMount <= 20000) {
            km = kmMount * 4 * 1.45;
            discount = km * 0.10;
            price = km - discount;
            System.out.printf("%.2f",price);
        }
    }
}
