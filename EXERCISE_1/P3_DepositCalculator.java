package BASICS.EXERCISE_1;

import java.util.Scanner;

public class P3_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double DepPrice = Double.parseDouble(scanner.nextLine());
        int DepMount = Integer.parseInt(scanner.nextLine());
        double YearPer = Double.parseDouble(scanner.nextLine());

        double sum = DepPrice + DepMount *((DepPrice * YearPer/100)/12);
        System.out.println(sum);
    }
}
