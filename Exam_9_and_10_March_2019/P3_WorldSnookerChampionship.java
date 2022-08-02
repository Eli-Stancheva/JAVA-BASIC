package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P3_WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentStage = scanner.nextLine();
        String typeTicket = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());
        String trophyPhoto = scanner.nextLine();

        double price = 0;

        if (typeTicket.equals("Standard")) {
            if (tournamentStage.equals("Quarter final")) {
                price = 55.50;
            } else if (tournamentStage.equals("Semi final")) {
                price = 75.88;
            } else if (tournamentStage.equals("Final")) {
                price = 110.10;
            }
        } else if (typeTicket.equals("Premium")) {
            if (tournamentStage.equals("Quarter final")) {
                price = 105.20;
            } else if (tournamentStage.equals("Semi final")) {
                price = 125.22;
            } else if (tournamentStage.equals("Final")) {
                price = 160.66;
            }
        } else if (typeTicket.equals("VIP")) {
            if (tournamentStage.equals("Quarter final")) {
                price = 118.90;
            } else if (tournamentStage.equals("Semi final")) {
                price = 300.40;
            } else if (tournamentStage.equals("Final")) {
                price = 400;
            }
        }

        double allTicketsPrice = price * ticketsCount;

        if (allTicketsPrice > 4000) {
            allTicketsPrice = allTicketsPrice * 0.75;
        } else if (allTicketsPrice > 2500) {
            allTicketsPrice = allTicketsPrice * 0.90;
            if (trophyPhoto.equals("Y")) {
                allTicketsPrice = allTicketsPrice + (ticketsCount * 40);
            }
        } else {
            if (trophyPhoto.equals("Y")) {
                allTicketsPrice = allTicketsPrice + (ticketsCount * 40);
            }
        }
        System.out.printf("%.2f", allTicketsPrice);
    }
}
