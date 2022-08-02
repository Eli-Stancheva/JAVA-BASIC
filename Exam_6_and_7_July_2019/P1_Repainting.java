package BASICS.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class P1_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paintLitres = Integer.parseInt(scanner.nextLine());
        int thinnerLitres = Integer.parseInt(scanner.nextLine());
        int hoursWork = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paintLitres + (paintLitres * 0.10)) * 14.50;
        double thinnerPrice = thinnerLitres * 5.00;
        double all = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double workPrice = (all * 0.30) * hoursWork;
        double finalPrice = workPrice + all;
        System.out.printf("Total expenses: %.2f lv.", finalPrice);
    }
}
