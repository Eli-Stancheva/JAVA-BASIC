package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P6_HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wanted = Integer.parseInt(scanner.nextLine());
        int lowerGoal = wanted - 30;
        boolean failed = false;
        int jumps = 0;


        while (lowerGoal <= wanted) {
            for (int i = 0; i < 3; i++) {
                int current = Integer.parseInt(scanner.nextLine());
                jumps++;

                if (current > lowerGoal) {
                    lowerGoal += 5;
                    break;
                }
                if (i == 2) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", lowerGoal, jumps);
                    failed = true;
                }
            }
            if (failed) {
                break;
            }
        }
        if (!failed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", wanted, jumps);
        }
    }
}