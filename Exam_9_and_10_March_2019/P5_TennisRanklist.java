package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P5_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int finalPoints = startPoints;
        int counterW = 0;

        for (int i = 1; i <= tournaments; i++) {
            String position = scanner.nextLine();

            switch (position) {
                case "W":
                    points = 2000;
                    counterW++;
                    break;
                case "F":
                    points = 1200;
                    break;
                case "SF":
                    points = 720;
                    break;
            }
            finalPoints += points;
        }
        int average = (finalPoints - startPoints) / tournaments;
        System.out.printf("Final points: %d\n", finalPoints);
        System.out.printf("Average points: %d\n", average);
        System.out.printf("%.2f%%", (counterW * 1.0 / tournaments) * 100);
    }
}
