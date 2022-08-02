package BASICS.Exam_20_and_21_April_2019;

import java.util.Scanner;

public class P2_EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double priceOne = Double.parseDouble(scanner.nextLine());
        double budgedDesi = Double.parseDouble(scanner.nextLine());

        if (people >= 10 && people <= 15) {
            priceOne *= 0.85;
        } else if ( people > 15 && people <= 20) {
            priceOne *= 0.80;
        } else if (people > 20) {
            priceOne *= 0.75;
        } else {
            priceOne = priceOne;
        }

        double cake = budgedDesi * 0.10;
        double all = people * priceOne + cake;

        if (budgedDesi >= all){
            System.out.printf("It is party time! %.2f leva left.", budgedDesi - all);
        } else {
            System.out.printf("No party! %.2f leva needed.", all - budgedDesi);
        }
    }
}
