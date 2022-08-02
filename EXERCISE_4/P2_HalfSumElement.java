package BASICS.EXERCISE_4;

import java.util.Scanner;

public class P2_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxValue = Integer.MIN_VALUE;
        int otherSum = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > maxValue){
                maxValue = number;
            }

            otherSum = otherSum + number;
            sum = otherSum - maxValue;
        }

        if (sum == maxValue){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sum - maxValue));
        }
    }
}
