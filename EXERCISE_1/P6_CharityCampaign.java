package BASICS.EXERCISE_1;

import java.util.Scanner;

public class P6_CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner (System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int cookersCount = Integer.parseInt(scanner.nextLine());
        int cakesCount = Integer.parseInt(scanner.nextLine());
        int wafflesCount = Integer.parseInt(scanner.nextLine());
        int pancakesCount = Integer.parseInt(scanner.nextLine());

        double cakes = cakesCount * 45.0;
        double waffles = wafflesCount * 5.80;
        double pancakes = pancakesCount * 3.20;
        double sumAllCookers = (cakes + waffles + pancakes) * cookersCount;
        double AllPrice = sumAllCookers * daysCount;
        double PriceAfterCosts = AllPrice - 1.0 * 1/8 *AllPrice;

        System.out.printf("%.2f", PriceAfterCosts);

    }
}
