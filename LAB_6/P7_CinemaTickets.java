package BASICS.LAB_6;

import java.util.Scanner;

public class P7_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int countAllTickets = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidsCount = 0;

        while (!input.equals("Finish")) {
            String nameMovie = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int countTickets = 0;
            String command = scanner.nextLine();

            while (!command.equals("End")) {
                String option = command;

                countTickets++;
                countAllTickets++;

                switch (option) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidsCount++;
                        break;
                }

                if (countTickets == freeSeats) {
                    break;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", nameMovie, countTickets * 1.0 / freeSeats * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n",countAllTickets);
        System.out.printf("%.2f%% student tickets.\n", studentCount * 1.0 / countAllTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standardCount * 1.0 / countAllTickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", kidsCount * 1.0 / countAllTickets * 100);
    }
}
