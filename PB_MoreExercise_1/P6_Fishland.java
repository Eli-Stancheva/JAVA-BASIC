package BASICS.PB_MoreExercise_1;

import java.util.Scanner;

public class P6_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonito = Double.parseDouble(scanner.nextLine());
        double scad = Double.parseDouble(scanner.nextLine());
        double mussels = Double.parseDouble(scanner.nextLine());

        double musselsKg = 7.50;
        double bonitoPrice = mackerelPrice + mackerelPrice * 0.60;
        double scadPrice = spratPrice + spratPrice * 0.80;
        double sumBonito = bonito * bonitoPrice;
        double sumScad = scad * scadPrice;
        double sumMussels = mussels * musselsKg;
        double all = sumBonito + sumScad + sumMussels;
        System.out.printf("%.2f", all);

    }
}
