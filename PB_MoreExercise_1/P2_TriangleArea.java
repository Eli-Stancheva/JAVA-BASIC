package BASICS.PB_MoreExercise_1;

import java.util.Scanner;

public class P2_TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double s = a * h/2;
        System.out.printf("%.2f",s);
    }
}
