package BASICS.Exam_6_and_7_April_2019;

import java.util.Scanner;

public class P2_GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothPrice = Double.parseDouble(scanner.nextLine());

        double decor = budged * 0.10;

        if (statists > 150){
            clothPrice *= 0.90;
        }

        double all = decor + clothPrice * statists;

        if (all > budged){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", all - budged);
        } else if (all <= budged){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budged - all);
        }
    }
}
