package BASICS.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class P3_CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeDrink = scanner.nextLine();
        String typeSugar = scanner.nextLine();
        int countDrinks = Integer.parseInt(scanner.nextLine());

        double prise = 0;

        switch (typeDrink) {
            case "Espresso":
                if (typeSugar.equals("Without")) {
                    prise = prise + 0.90 * countDrinks;
                    prise = prise * 0.65;
                } else if (typeSugar.equals("Normal")) {
                    prise = prise + 1.00 * countDrinks;
                } else if (typeSugar.equals("Extra")) {
                    prise = prise + 1.20 * countDrinks;
                }
                if (prise >= 5){
                    prise = prise * 0.75;
                }
                break;
            case "Cappuccino":
                if (typeSugar.equals("Without")) {
                    prise = prise + 1.00 * countDrinks;
                    prise = prise * 0.65;
                } else if (typeSugar.equals("Normal")) {
                    prise = prise + 1.20 * countDrinks;
                } else if (typeSugar.equals("Extra")) {
                    prise = prise + 1.60 * countDrinks;
                }
                break;
            case "Tea":
                if (typeSugar.equals("Without")) {
                    prise = prise + 0.50 * countDrinks;
                    prise = prise * 0.65;
                } else if (typeSugar.equals("Normal")) {
                    prise = prise + 0.60 * countDrinks;
                } else if (typeSugar.equals("Extra")) {
                    prise = prise + 0.70 * countDrinks;
                }
                break;
        }

        if (prise > 15.0){
            prise = prise * 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", countDrinks, typeDrink, prise);
    }
}
