package BASICS.EXERCISE_1;

import java.util.Scanner;

public class P8_FishTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int len = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int capacityWater = len * width * height;
        double capacityLiter = capacityWater * 0.001;
        double percentNumber = percent / 100;
        double realLiter = capacityLiter * (1-percentNumber);
        System.out.printf("%.2f",realLiter);

    }
}
