package BASICS.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class P5_FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        int countGames = Integer.parseInt(scanner.nextLine());
        int winner = 0;
        int dou = 0;
        int loser = 0;
        int pointsW = 0;
        int pointsD = 0;
        int pointsL = 0;
        int allPoints = 0;

        for (int i = 1; i <= countGames; i++) {
            String option = scanner.nextLine();

            switch (option) {
                case "W":
                    winner++;
                    pointsW = winner * 3;
                    break;
                case "D":
                    dou++;
                    pointsD = dou;
                    break;
                case "L":
                    loser++;
                    pointsL = 0;
                    break;
            }
            allPoints = pointsW + pointsD + pointsL;
        }
        if (countGames != 0) {
            System.out.printf("%s has won %d points during this season.\n", team, allPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d\n", winner);
            System.out.printf("## D: %d\n", dou);
            System.out.printf("## L: %d\n", loser);
            System.out.printf("Win rate: %.2f%%", winner * 1.0 / countGames * 100);
        } else {
            System.out.printf("%s hasn't played any games during this season.", team);
        }
    }
}