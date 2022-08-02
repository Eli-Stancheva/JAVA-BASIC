package BASICS.Exam_15_and_16_June_2019;

import java.util.Scanner;

public class P3_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Summer")) {
                    price = (days * 40000) * 0.70;
                } else if (season.equals("Winter")) {
                    price = (days * 45000) * 0.70;
                }
                break;
            case "Sofia":
                if (season.equals("Summer")) {
                    price = ((days * 12500) * 0.25) + (days * 12500);
                } else if (season.equals("Winter")) {
                    price = ((days * 17000) * 0.25) + (days * 17000);
                }
                break;
            case "London":
                if (season.equals("Summer")) {
                    price = days * 20250;
                } else if (season.equals("Winter")) {
                    price = days * 24000;
                }
                break;
        }
        if (budged >= price){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",budged - price);
        } else {
            System.out.printf("The director needs %.2f leva more!", price - budged);
        }
    }
}
