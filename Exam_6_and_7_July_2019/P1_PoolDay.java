package BASICS.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class P1_PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double sunbed = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());

        double allPrice = people * price;
        double sunbedPrice = Math.ceil(0.75 * people) * sunbed;
        double umbrellaPrice = Math.ceil(0.50 * people) * umbrella;
        double all = allPrice + sunbedPrice + umbrellaPrice;
        System.out.printf("%.2f lv.",all);
    }
}
