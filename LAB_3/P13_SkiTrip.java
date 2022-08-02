package BASICS.LAB_3;

import java.util.Scanner;

public class P13_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();
        double sum = 0;
        int nights = days - 1;

        if (room.equals("room for one person")) {
            sum = nights * 18.00;

        } else if (room.equals("apartment")) {
            sum = nights * 25.00;

            if (days < 10) {
                sum = sum * 0.70;
            } else if (days <= 15) {
                sum = sum * 0.65;
            } else {
                sum = sum * 0.50;
            }
        } else if (room.equals("president apartment")) {
            sum = nights * 35.00;

            if (days < 10) {
                sum = sum * 0.90;
            } else if (days <= 15) {
                sum = sum * 0.85;
            } else {
                sum = sum * 0.80;
            }
        }
        if (grade.equals("positive")) {
            sum = sum * 1.25;
        } else {
            sum = sum * 0.90;
        }
        System.out.printf("%.2f", sum);
    }
}
