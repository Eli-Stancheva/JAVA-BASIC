package BASICS.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class P5_PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sold = Integer.parseInt(scanner.nextLine());

        int hearthstone = 0;
        int fornite = 0;
        int overwatch = 0;
        int others = 0;

        for (int i = 1; i <= sold; i++) {
            String game = scanner.nextLine();

            if (game.equals("Hearthstone")) {
                hearthstone++;
            } else if (game.equals("Fornite")) {
                fornite++;
            } else if (game.equals("Overwatch")) {
                overwatch++;
            } else {
                others++;
            }
        }
        System.out.printf("Hearthstone - %.2f%%\n", hearthstone * 1.0 / sold * 100);
        System.out.printf("Fornite - %.2f%%\n", fornite * 1.0 / sold * 100);
        System.out.printf("Overwatch - %.2f%%\n", overwatch * 1.0 / sold * 100);
        System.out.printf("Others - %.2f%%", others * 1.0 / sold * 100);
    }
}