package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P1_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lessons = Integer.parseInt(scanner.nextLine());

        double shoes = lessons * 0.60;
        double cloth = shoes * 0.80;
        double ball = cloth / 4;
        double other = ball / 5;
        double all = shoes + cloth + ball + other + lessons;
        System.out.printf("%.2f", all);
    }
}
