package BASICS.LAB_6;

import java.util.Scanner;

public class P4_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean flag = false;

        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                count++;
                int sum = i + j;
                if (sum == magicNum) {
                    flag = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, sum);
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag){
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}
