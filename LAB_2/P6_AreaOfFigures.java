package BASICS.LAB_2;

import java.util.Scanner;

public class P6_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        String first = "square";
        String second = "rectangle";
        String third = "circle";
        String forth = "triangle";

        if (figure.equals(first)) {
            double size = Double.parseDouble(scanner.nextLine());
            double S = size * size;
            System.out.printf("%.3f", S);
        }
        if (figure.equals(second)) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double S = a * b;
            System.out.printf("%.3f", S);
        }
        if (figure.equals(third)) {
            double r = Double.parseDouble(scanner.nextLine());
            double S = Math.PI * r * r;
            System.out.printf("%.3f", S);
        }
        if (figure.equals(forth)) {
            double a = Double.parseDouble(scanner.nextLine());
            double ha = Double.parseDouble(scanner.nextLine());
            double S = (a / 2) * ha;
            System.out.printf("%.3f", S);
        }
    }
}
