package BASICS.PB_MoreExercise_3;

import java.util.Scanner;

public class P2_BikeRace {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String terrain = scanner.nextLine();
        double sum = 0;
        double discount = 0;

        switch (terrain){
            case "trail":
                sum = juniors * 5.50 + seniors * 7;
                discount = sum * 0.95;
                System.out.printf("%.2f",discount);
                break;
            case "cross-country":
                sum = juniors * 8 + seniors * 9.50;
                if (juniors + seniors >= 50){
                    sum *= 0.75;
                }
                discount = sum * 0.95;
                System.out.printf("%.2f",discount);
                break;
            case "downhill":
                sum = juniors * 12.25 + seniors * 13.75;
                discount = sum * 0.95;
                System.out.printf("%.2f",discount);
                break;
            case "road":
                sum = juniors * 20 + seniors * 21.50;
                discount = sum * 0.95;
                System.out.printf("%.2f",discount);
                break;
        }
    }
}
