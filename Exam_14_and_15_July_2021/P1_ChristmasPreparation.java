package BASICS.Exam_14_and_15_July_2021;

import java.util.Scanner;

public class P1_ChristmasPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPaper = Integer.parseInt(scanner.nextLine());
        int countCloth = Integer.parseInt(scanner.nextLine());
        double litres = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double paperPrice = countPaper * 5.80;
        double clothPrice = countCloth * 7.20;
        double litresPrice = litres * 1.20;
        double all = paperPrice + clothPrice + litresPrice;
        double discount = all - (all * percentDiscount / 100);
        System.out.printf("%.3f",discount);
    }
}
