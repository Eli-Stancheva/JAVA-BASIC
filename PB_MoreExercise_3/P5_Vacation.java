package BASICS.PB_MoreExercise_3;

import java.util.Scanner;

public class P5_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budged <= 1000){
            if (season.equals("Summer")) {
                budged *= 0.65;
                System.out.printf("Alaska - Camp - %.2f",budged);
            } else if (season.equals("Winter")) {
                budged *= 0.45;
                System.out.printf("Morocco - Camp - %.2f",budged);
            }
        } else if (budged <= 3000){
            if (season.equals("Summer")) {
                budged *= 0.80;
                System.out.printf("Alaska - Hut - %.2f",budged);
            } else if (season.equals("Winter")) {
                budged *= 0.60;
                System.out.printf("Morocco - Hut - %.2f",budged);
            }
        } else {
            budged *= 0.90;
            if (season.equals("Summer")) {
                System.out.printf("Alaska - Hotel - %.2f",budged);
            } else if (season.equals("Winter")) {
                System.out.printf("Morocco - Hotel - %.2f",budged);
            }
        }
    }
}
