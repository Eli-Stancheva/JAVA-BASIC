package BASICS.Exam_6_and_7_April_2019;

import java.util.Scanner;

public class P6_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = 0;
        int standard = 0;
        int kids = 0;


        String filmName = scanner.nextLine();

        while (!"Finish".equals(filmName)) {
            int places = Integer.parseInt(scanner.nextLine());
            int people = 0;

            for (int i = 0; i < places; i++) {
                String command = scanner.nextLine();

                if ("student".equals(command)) {
                    students++;
                } else if ("standard".equals(command)) {
                    standard++;
                } else if ("kid".equals(command)) {
                    kids++;
                } else if ("End".equals(command)) {
                    break;
                }
                people++;
            }
            System.out.println(String.format("%s - %.2f%% full.", filmName, people * 1.0 / places * 100));
            filmName = scanner.nextLine();
        }
        int totalTickets = standard + students + kids;
        System.out.println(String.format("Total tickets: %d", totalTickets));
        System.out.println(String.format("%.2f%% student tickets.", (students * 1.0 / totalTickets * 100)));
        System.out.println(String.format("%.2f%% standard tickets.", (standard * 1.0 / totalTickets * 100)));
        System.out.println(String.format("%.2f%% kids tickets.", (kids * 1.0 / totalTickets * 100)));
       /* SECOND VARIANT

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
        */

    }
}
