package BASICS.PB_MoreExercise_1;

import java.util.Scanner;

public class P7_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double frontWall = (x * x) - 2.4;
        double backWall = (x * x);
        double leftRight = (x * y) * 2 - 2.25 * 2;
        double roof = (2*(x * y) + 2*(x / 2.0 * h)) / 4.3;
        double walls = (frontWall + backWall + leftRight) / 3.4;

        System.out.printf("%.2f \n", walls);
        System.out.printf("%.2f", roof);
    }
}
