package BASICS.PB_MoreExercise_3;

import java.util.Scanner;

public class P4_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double cabrio = 0;
        double jeep = 0;

        if (budged <= 100) {
            System.out.println("Economy class");
            if (season.equals("Summer")) {
                cabrio = budged * 0.35;
                System.out.printf("Cabrio - %.2f",cabrio);
            } else if (season.equals("Winter")) {
                jeep = budged * 0.65;
                System.out.printf("Jeep - %.2f",jeep);
            }
        } else if (budged <= 500) {
            System.out.println("Compact class");
            if (season.equals("Summer")) {
                cabrio = budged * 0.45;
                System.out.printf("Cabrio - %.2f",cabrio);
            } else if (season.equals("Winter")) {
                jeep = budged * 0.80;
                System.out.printf("Jeep - %.2f",jeep);
            }
        } else {
            System.out.println("Luxury class");
            jeep = budged * 0.90;
            System.out.printf("Jeep - %.2f",jeep);
        }
    }
}
