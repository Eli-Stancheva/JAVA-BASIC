package BASICS.EXERCISE_3;

import java.util.Scanner;

public class P9_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int weekendSofia = 48 - h;
        double countGamesSofia = weekendSofia * (3.0 / 4);
        double countGamesFeast = p * (2.0 / 3);
        double games = countGamesSofia + h + countGamesFeast;
        double more = 0;

        if(year.equals("leap")){
            more = games * 0.15;
            System.out.printf("%.0f",Math.floor(more + games));

        } else {
            System.out.printf("%.0f", Math.floor(games));
        }
    }
}
