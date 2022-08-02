package BASICS.LAB_5;

import java.util.Scanner;

public class P3_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < number) {
            int numberNew = Integer.parseInt(scanner.nextLine());
            sum = sum + numberNew;
        }
        System.out.println(sum);
    }
}
