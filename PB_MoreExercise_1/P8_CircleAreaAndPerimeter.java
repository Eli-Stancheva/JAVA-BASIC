package BASICS.PB_MoreExercise_1;

import java.util.Scanner;

public class P8_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double P = 2 * r * Math.PI;
        double S = r * r * Math.PI;
        System.out.printf("%.2f\n%.2f",S, P);
    }
}
