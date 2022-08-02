package BASICS.Exam_14_and_15_July_2021;

import java.util.Scanner;

public class P3_SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();
        int nights = days - 1;

        double price = 0;

        if (room.equals("room for one person")) {
            if (days < 10) {
                price = 18.00 * nights;
            } else if (days > 10 && days < 15) {
                price = 18.00 * nights;
            } else {
                price = 18.00 * nights;
            }
        } else if (room.equals("apartment")) {
            if (days < 10) {
                price = (nights * 25.00) * 0.60;
            } else if (days > 10 && days < 15) {
                price = (nights * 25.00) * 0.65;
            } else {
                price = (nights * 25.00) * 0.50;
            }
        } else if (room.equals("president apartment")) {
            if (days < 10) {
                price = (nights * 35.00) * 0.90;
            } else if (days > 10 && days < 15) {
                price = (nights * 35.00) * 0.85;
            } else {
                price = (nights * 35.00) * 0.80;
            }
        }

        if (grade.equals("positive")) {
            price = price + (price * 0.25);
        } else if (grade.equals("negative")) {
            price = price - (price * 0.10);
        }

        System.out.printf("%.2f", price);
    }
}
