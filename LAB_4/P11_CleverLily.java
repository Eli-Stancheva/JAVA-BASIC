package BASICS.LAB_4;

import java.util.Scanner;

public class P11_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sumMoney = 0;
        double countToys = 0;
        double currMoney = 0;
        int brotherCount = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                brotherCount++;
                currMoney = currMoney + 10;
                sumMoney = sumMoney + currMoney;
            } else {
                countToys++;
            }
        }
        double allSavedMoney = (countToys * toyPrice) + (sumMoney - brotherCount);
        double diff = Math.abs(allSavedMoney - washPrice);
        if (allSavedMoney >= washPrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
