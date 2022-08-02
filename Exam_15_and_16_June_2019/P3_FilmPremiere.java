package BASICS.Exam_15_and_16_June_2019;

import java.util.Scanner;

public class P3_FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String food = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (movie) {
            case "John Wick":
                if (food.equals("Drink")) {
                    price = tickets * 12;
                } else if (food.equals("Popcorn")) {
                    price = tickets * 15;
                } else if (food.equals("Menu")) {
                    price = tickets * 19;
                }
                break;
            case "Star Wars":
                if (food.equals("Drink")) {
                    price = tickets * 18;
                } else if (food.equals("Popcorn")) {
                    price = tickets * 25;
                } else if (food.equals("Menu")) {
                    price = tickets * 30;
                }
                if (tickets >= 4){
                    price *= 0.70;
                }
                break;
            case "Jumanji":
                if (food.equals("Drink")) {
                    price = tickets * 9;
                } else if (food.equals("Popcorn")) {
                    price = tickets * 11;
                } else if (food.equals("Menu")) {
                    price = tickets * 14;
                }
                if (tickets == 2){
                    price *= 0.85;
                }
                break;
        }
        System.out.printf("Your bill is %.2f leva.", price);
    }
}

