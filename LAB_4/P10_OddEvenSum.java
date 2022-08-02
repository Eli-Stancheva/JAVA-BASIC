package BASICS.LAB_4;

import java.util.Scanner;

public class P10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int odd = 0;
        int even = 0;

        for (int i = 1; i <= n; i++) {
            int curr = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0){
                even = even + curr;
            } else {
                odd = odd + curr;
            }
        }
        if (even == odd){
            System.out.println("Yes");
            System.out.printf("Sum = %d", odd);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(odd - even));
        }
    }
}
