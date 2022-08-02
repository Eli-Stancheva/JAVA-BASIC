package BASICS.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class P2_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        int percentMoreCosts = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            nightPrice = nightPrice * 0.95;
        }

        double allPrice = nightPrice * nights;
        double moreCosts = (1.0 * percentMoreCosts / 100) * budged;
        double all = allPrice + moreCosts;

        if (all <= budged){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budged - all);
        } else {
            System.out.printf("%.2f leva needed.", all - budged);
        }
    }
}
