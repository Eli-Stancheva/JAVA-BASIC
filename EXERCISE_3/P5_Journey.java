package BASICS.EXERCISE_3;

import java.util.Scanner;

public class P5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (season.equals("summer")) {
            if (budged <= 100) {
                budged = budged * 0.30;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", budged);
            } else if (budged <= 1000){
                budged = budged * 0.40;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f", budged);
            } else {
                budged = budged * 0.90;
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", budged);
            }
        } else if (season.equals("winter")) {
            if (budged <= 100) {
                budged = budged * 0.70;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", budged);
            } else if (budged <= 1000){
                budged = budged * 0.80;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f", budged);
            } else {
                budged = budged * 0.90;
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - %.2f", budged);
            }
        }
    }
}
