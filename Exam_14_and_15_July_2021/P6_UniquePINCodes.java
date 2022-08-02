package BASICS.Exam_14_and_15_July_2021;

import java.util.Scanner;

public class P6_UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= first; i++) {
            for (int j = 1; j <= second; j++) {
                if (j % 2 == 0 && j != 2) continue;
                for (int k = 1; k <= third; k++) {
                    if (i % 2 == 0 && k % 2 == 0) {
                        if (j >= 2 && j <= 7) {
                            System.out.printf("%d %d %d\n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}
