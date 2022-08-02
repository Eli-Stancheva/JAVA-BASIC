package BASICS.Exam_15_and_16_June_2019;

import java.util.Scanner;

public class P2_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int brakeTime = Integer.parseInt(scanner.nextLine());

        double lunchBreak = brakeTime / 8.0;
        double sleepBreak = brakeTime / 4.0;
        double otherTime = brakeTime - lunchBreak - sleepBreak;

        if (otherTime >= episode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(otherTime - episode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(episode - otherTime));
        }
    }
}
