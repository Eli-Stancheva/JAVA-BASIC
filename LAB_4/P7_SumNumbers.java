package BASICS.LAB_4;

import java.util.Scanner;

public class P7_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            int curr = Integer.parseInt(scanner.nextLine());
            sum = curr + sum;
        }
        System.out.println(sum);
    }
}
