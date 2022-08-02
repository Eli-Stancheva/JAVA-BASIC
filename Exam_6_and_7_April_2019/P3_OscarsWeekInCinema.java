package BASICS.Exam_6_and_7_April_2019;

import java.util.Scanner;

public class P3_OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String roomType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (movieName) {
            case "A Star Is Born":
                if (roomType.equals("normal")) {
                    price = tickets * 7.50;
                } else if (roomType.equals("luxury")) {
                    price = tickets * 10.50;
                } else if (roomType.equals("ultra luxury")) {
                    price = tickets * 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (roomType.equals("normal")) {
                    price = tickets * 7.35;
                } else if (roomType.equals("luxury")) {
                    price = tickets * 9.45;
                } else if (roomType.equals("ultra luxury")) {
                    price = tickets * 12.75;
                }
                break;
            case "Green Book":
                if (roomType.equals("normal")) {
                    price = tickets * 8.15;
                } else if (roomType.equals("luxury")) {
                    price = tickets * 10.25;
                } else if (roomType.equals("ultra luxury")) {
                    price = tickets * 13.25;
                }
                break;
            case "The Favourite":
                if (roomType.equals("normal")) {
                    price = tickets * 8.75;
                } else if (roomType.equals("luxury")) {
                    price = tickets * 11.55;
                } else if (roomType.equals("ultra luxury")) {
                    price = tickets * 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movieName, price);
    }
}
