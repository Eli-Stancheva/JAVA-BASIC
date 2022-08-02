package BASICS.Exam_14_and_15_July_2021;

import java.util.Scanner;

public class P4_Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        double firstDayKilometers = Double.parseDouble(scanner.nextLine());
        double all = 0;
        double first = firstDayKilometers;

        for (int i = 1; i <= countDays ; i++) {
            int percent = Integer.parseInt(scanner.nextLine());

            firstDayKilometers = firstDayKilometers + (firstDayKilometers * percent/100);
            all = all + firstDayKilometers;
        }
        double bla =  all + first;

        if (bla >= 1000){
            System.out.printf("You've done a great job running %.0f more kilometers!",Math.ceil(bla - 1000));
        } else if (bla < 1000){
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",Math.ceil(1000 - bla));
        }
    }
}
