package BASICS.PB_MoreExercise_3;

import java.util.Scanner;

public class P3_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemumCount = Integer.parseInt(scanner.nextLine());
        int roseCount = Integer.parseInt(scanner.nextLine());
        int tulipCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isHoliday = scanner.nextLine();
        double sum = 0;

        if (season.equals("Spring") || season.equals("Summer")) {
            sum = chrysanthemumCount * 2.00 + roseCount * 4.10 + tulipCount * 2.50;
            if (isHoliday.equals("Y")) {
                sum = sum + sum * 0.15;
            }
            if (tulipCount > 7) {
                sum *= 0.95;
            }
            if (chrysanthemumCount + roseCount + tulipCount > 20 ){
                sum *= 0.80;
            }
            sum = sum + 2;
            System.out.printf("%.2f",sum);
        } else if (season.equals("Autumn") || season.equals("Winter")){
            sum = chrysanthemumCount * 3.75 + roseCount * 4.50 + tulipCount * 4.15;
            if (isHoliday.equals("Y")) {
                sum = sum + sum * 0.15;
            }
            if (season.equals("Winter") && roseCount >= 10) {
                sum *= 0.90;
            }
            if (chrysanthemumCount + roseCount + tulipCount > 20 ){
                sum *= 0.80;
            }
            sum = sum + 2;
            System.out.printf("%.2f",sum);
        }

    }
}
