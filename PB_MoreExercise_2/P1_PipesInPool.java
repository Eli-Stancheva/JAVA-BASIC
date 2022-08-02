package BASICS.PB_MoreExercise_2;

import java.util.Scanner;

public class P1_PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double p1Litres = p1 * h;
        double p2Litres = p2 * h;
        double allWater = p1Litres + p2Litres;
        char c = '%';

        if (allWater <= v) {
            double per = (allWater / v) * 100;
            double p1Per = (p1Litres / allWater) * 100;
            double p2Per = (p2Litres / allWater) * 100;
            System.out.printf("The pool is %.2f%c full. Pipe 1: %.2f%c. Pipe 2: %.2f%c.",per,c,p1Per,c,p2Per,c);
        } else {
            double over = allWater - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h,over);
        }
    }
}
