package BASICS.LAB_4;

import java.util.Scanner;

public class P8_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n ; i++) {
            int curr = Integer.parseInt(scanner.nextLine());

            if (curr > max){
                max = curr;
            }
            if (curr < min){
                min = curr;
            }
        }
        System.out.printf("Max number: %d \n", max);
        System.out.printf("Min number: %d", min);
    }
}
