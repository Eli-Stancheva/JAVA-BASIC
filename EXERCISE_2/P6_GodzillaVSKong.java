package BASICS.EXERCISE_2;

import java.util.Scanner;

public class P6_GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priseCloth = Double.parseDouble(scanner.nextLine());
        double decor = budged * 0.10;

        if (statists > 150){
            priseCloth = priseCloth * 0.90;
        }

        double all = decor + (priseCloth * statists);

        if (all > budged){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",all - budged);
        }else if (all <= budged){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budged - all);
        }
    }
}
