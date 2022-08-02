package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P6_BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournaments = scanner.nextLine();
        int count = 0;
        boolean isWin = false;
        int winners = 0;
        int losers = 0;

        while (!tournaments.equals("End of tournaments")) {
            int countMatch = Integer.parseInt(scanner.nextLine());
            int result = 0;
            int eachMatch = 0;

            for (int i = 1; i <= countMatch; i++) {
                int desiPoint = Integer.parseInt(scanner.nextLine());
                int othersPoint = Integer.parseInt(scanner.nextLine());

                if (desiPoint > othersPoint) {
                    result = desiPoint - othersPoint;
                    isWin = true;
                    winners++;
                } else if (othersPoint > desiPoint) {
                    result = othersPoint - desiPoint;
                    isWin = false;
                    losers++;
                }
                eachMatch++;
                if (isWin) {
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", eachMatch, tournaments, result);
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", eachMatch, tournaments, result);
                }
            }
            count = count + countMatch;
            tournaments = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win\n", winners * 1.0 / count * 100);
        System.out.printf("%.2f%% matches lost", losers * 1.0 / count * 100);
    }
}
