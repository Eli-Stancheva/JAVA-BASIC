package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P5_FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int back = 0;
        int chest = 0;
        int abs = 0;
        int legs = 0;
        int proteinShake = 0;
        int proteinBar = 0;

        for (int i = 1; i <= people; i++) {
            String activity = scanner.nextLine();

            switch (activity){
                case "Back":
                    back++;
                    break;
                case "Chest":
                    chest++;
                    break;
                case "Legs":
                    legs++;
                    break;
                case "Abs":
                    abs++;
                    break;
                case "Protein shake":
                    proteinShake++;
                    break;
                case "Protein bar":
                    proteinBar++;;
                    break;
            }
        }
        System.out.printf("%d - back\n", back);
        System.out.printf("%d - chest\n", chest);
        System.out.printf("%d - legs\n", legs);
        System.out.printf("%d - abs\n", abs);
        System.out.printf("%d - protein shake\n", proteinShake);
        System.out.printf("%d - protein bar\n", proteinBar);
        System.out.printf("%.2f%% - work out\n",((back + chest + legs + abs) * 1.0 / people) * 100);
        System.out.printf("%.2f%% - protein",((proteinBar + proteinShake) * 1.0 / people) * 100);
    }
}
