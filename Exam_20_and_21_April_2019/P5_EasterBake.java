package BASICS.Exam_20_and_21_April_2019;

import java.util.Scanner;

public class P5_EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        double allSugar = 0;
        double allSugarG = 0;
        double allFlour = 0;
        double allFlourG = 0;

        double maxSugar = Double.NEGATIVE_INFINITY;
        double maxFlour = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= count; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            allSugar = allSugar + sugar;
            allFlour = allFlour + flour;

            if (sugar > maxSugar){
                maxSugar = sugar;
            }

            if (flour > maxFlour){
                maxFlour = flour;
            }
        }
        allSugarG = Math.ceil(allSugar / 950);
        allFlourG = Math.ceil(allFlour / 750);

        System.out.printf("Sugar: %.0f\n", allSugarG);
        System.out.printf("Flour: %.0f\n", allFlourG);
        System.out.printf("Max used flour is %.0f grams, max used sugar is %.0f grams.", maxFlour, maxSugar);
    }
}
