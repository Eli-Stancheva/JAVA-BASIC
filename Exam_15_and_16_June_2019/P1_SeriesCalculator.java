package BASICS.Exam_15_and_16_June_2019;

import java.util.Scanner;

public class P1_SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodeTime = Double.parseDouble(scanner.nextLine());


        double add = 0.20 * episodeTime;
        double episodeAdd = episodeTime + add;
        double more = seasons * 10;
        double all = episodeAdd * episodes * seasons + more;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",name,Math.floor(all));
    }
}
