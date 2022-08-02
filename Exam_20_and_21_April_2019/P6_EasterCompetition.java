package BASICS.Exam_20_and_21_April_2019;

import java.util.Scanner;

public class P6_EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String winner = "";
        int winnerPoints = Integer.MIN_VALUE;

        for (int i = 1; i <= count; i++) {
            String name = scanner.nextLine();
            int points = 0;
            String command = scanner.nextLine();

            while (!command.equals("Stop")) {
                points += Integer.parseInt(command);
                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.\n", name, points);

            if (points > winnerPoints){
                winnerPoints = points;
                winner = name;
                System.out.printf("%s is the new number 1!\n", winner);
            }
        }
        System.out.printf("%s won competition with %d points!", winner,winnerPoints);
    }
}
