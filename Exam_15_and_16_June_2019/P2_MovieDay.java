package BASICS.Exam_15_and_16_June_2019;

import java.util.Scanner;

public class P2_MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int sceneTime = Integer.parseInt(scanner.nextLine());

        double timeTerain = time * 0.15;
        int timeFilming = sceneTime * scenes;
        double allTime = timeTerain + timeFilming;

        if (allTime <= time) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", time - allTime);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.abs(allTime - time));
        }
    }
}
