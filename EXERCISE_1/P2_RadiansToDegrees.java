package BASICS.EXERCISE_1;

import java.util.Scanner;

public class P2_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rad = Double.parseDouble(scanner.nextLine());
        double deg = rad * 180 / Math.PI;
        System.out.printf("%.0f",deg);
    }
}
