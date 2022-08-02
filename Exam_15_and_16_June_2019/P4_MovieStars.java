package BASICS.Exam_15_and_16_June_2019;

import java.util.Scanner;

public class P4_MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();

        while (!name.equals("ACTION")) {
            if (name.length() > 15) {
                budged -= budged * 0.20;
            } else {
                double salary = Double.parseDouble(scanner.nextLine());
                budged -= salary;
            }

            if (budged < 0){
               break;
            }
            name = scanner.nextLine();
        }
        if (name.equals("ACTION")) {
            System.out.printf("We are left with %.2f leva.", budged);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budged));
        }
    }
}
