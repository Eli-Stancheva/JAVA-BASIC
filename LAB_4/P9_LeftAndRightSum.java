package BASICS.LAB_4;

import java.util.Scanner;

public class P9_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            int curr = Integer.parseInt(scanner.nextLine());

            leftSum += curr;
        }

        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int curr = Integer.parseInt(scanner.nextLine());

            rightSum += curr;
        }

        if (rightSum == leftSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(rightSum - leftSum));
        }
    }
}
