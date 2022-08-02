package BASICS.Exam_14_and_15_July_2021;

import java.util.Scanner;

public class P2_DeerOfSanta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int missingDays = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double dayFoodFirst = Double.parseDouble(scanner.nextLine());
        double dayFoodSecond = Double.parseDouble(scanner.nextLine());
        double dayFoodThird = Double.parseDouble(scanner.nextLine());

        double first = missingDays * dayFoodFirst;
        double second = missingDays * dayFoodSecond;
        double third = missingDays * dayFoodThird;
        double allFood = first + second + third;

        if (allFood < foodKg){
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKg - allFood));
        } else if (allFood > foodKg){
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(allFood - foodKg));
        }
    }
}
