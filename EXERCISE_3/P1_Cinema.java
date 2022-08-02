package BASICS.EXERCISE_3;

import java.util.Scanner;

public class P1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;

        if(type.equals("Premiere")){
            sum = rows * cols * 12.00;
        } else if (type.equals("Normal")){
            sum = rows * cols * 7.50;
        } else if (type.equals("Discount")){
            sum = rows * cols * 5.00;
        }
        System.out.printf("%.2f leva", sum);
    }
}
