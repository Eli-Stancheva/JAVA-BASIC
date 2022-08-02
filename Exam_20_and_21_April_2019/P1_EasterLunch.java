package BASICS.Exam_20_and_21_April_2019;

import java.util.Scanner;

public class P1_EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int countEggs = Integer.parseInt(scanner.nextLine());
        int biscKg = Integer.parseInt(scanner.nextLine());

        double priceK = count * 3.20;
        double priceEggs = countEggs * 4.35;
        double priceBisc = biscKg * 5.40;
        double paint = countEggs * 12 * 0.15;
        double all = priceK + priceEggs + priceBisc + paint;

        System.out.printf("%.2f", all);
    }
}
