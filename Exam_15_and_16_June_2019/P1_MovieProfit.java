package BASICS.Exam_15_and_16_June_2019;

import java.util.Scanner;

public class P1_MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double dayPrice = tickets * ticketPrice;
        double period = days * dayPrice;
        double percentLeft = period * percent / 100;
        double all = period - percentLeft;

        System.out.printf("The profit from the movie %s is %.2f lv.", film, all);
    }
}
