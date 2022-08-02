package BASICS.PB_MoreExercise_2;

import java.util.Scanner;

public class P2_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holiday = Integer.parseInt(scanner.nextLine());

        int work = 365 - holiday;
        int realPlay = (work * 63) + (holiday * 127);

        if (realPlay > 30000) {
            int gap = realPlay - 30000;
            int h = gap / 60;
            int m = gap % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", h, m);
        } else if (realPlay < 30000) {
            int gap = 30000 - realPlay;
            int h = gap / 60;
            int m = gap % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", h, m);
        }
    }
}
