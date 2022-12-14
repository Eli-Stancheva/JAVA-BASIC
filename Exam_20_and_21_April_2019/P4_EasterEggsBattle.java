package BASICS.Exam_20_and_21_April_2019;

import java.util.Scanner;

public class P4_EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int player1 = Integer.parseInt(scanner.nextLine());
        int player2 = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();


        while (!input.equals("End of battle")) {
            String option = input;

            if (option.equals("one")) {
                player2--;
            } else if (option.equals("two")) {
                player1--;
            }

            if (player1 == 0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", player2);
                break;
            } else if (player2 == 0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", player1);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.\n", player1);
            System.out.printf("Player two has %d eggs left.", player2);
        }
    }
}
