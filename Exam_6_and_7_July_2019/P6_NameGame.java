package BASICS.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class P6_NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int points = 0;
        String winner = "";

        while (!name.equals("Stop")) {
            int allPoints = 0;

            for (int i = 0; i < name.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());

                if (number == name.charAt(i)) {
                    allPoints = allPoints + 10;
                } else {
                    allPoints = allPoints + 2;
                }
            }
            if (allPoints >= points){
                points = allPoints;
                winner = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winner, points);
    }
}
