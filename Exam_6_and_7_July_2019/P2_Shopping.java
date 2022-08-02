package BASICS.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class P2_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        int nCount = Integer.parseInt(scanner.nextLine());
        int mCount = Integer.parseInt(scanner.nextLine());
        int pCount = Integer.parseInt(scanner.nextLine());

        double priceN = nCount * 250;
        double priceM = (priceN * 0.35) * mCount;
        double priceP = (priceN * 0.10) * pCount;
        double all = priceN + priceM + priceP;

        if (nCount > mCount) {
            all = all * 0.85;
        }

        if (all <= budged) {
            System.out.printf("You have %.2f leva left!", budged - all);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", all - budged);
        }

    }
}
