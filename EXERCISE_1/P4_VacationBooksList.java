package BASICS.EXERCISE_1;

import java.util.Scanner;

public class P4_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int PagesInBook = Integer.parseInt(scanner.nextLine());
        int PagesForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int minHours = (PagesInBook / days) / PagesForHour;
        System.out.println(minHours);

    }
}
