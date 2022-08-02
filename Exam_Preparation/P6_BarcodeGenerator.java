package BASICS.Exam_Preparation;

import java.util.Scanner;

public class P6_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String min = scanner.nextLine();
        String max = scanner.nextLine();

        for (int i = min.charAt(0); i <= max.charAt(0); i++) {
            if (i % 2 == 0) continue;
            for (int j = min.charAt(1); j <= max.charAt(1); j++) {
                if (j % 2 == 0) continue;
                for (int k = min.charAt(2); k <= max.charAt(2); k++) {
                    if (k % 2 == 0) continue;
                    for (int l = min.charAt(3); l <= max.charAt(3); l++) {
                        if (l % 2 == 0) continue;

                        System.out.printf("%c%c%c%c ", i, j, k, l);
                    }
                }
            }
        }
    }
}
