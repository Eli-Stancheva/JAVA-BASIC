package BASICS.PB_MoreExercise_3;

import java.util.Scanner;

public class P10_MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        while (num >= 0) {
            System.out.printf("Result: %.2f \n", num * 2);
            num = Double.parseDouble(scanner.nextLine());
        }
        if (num < 0)
            System.out.println("Negative number!");
    }
}
