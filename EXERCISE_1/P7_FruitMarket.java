package BASICS.EXERCISE_1;

import java.util.Scanner;

public class P7_FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double StrawberryPrice = Double.parseDouble(scanner.nextLine());
        double BananaCount = Double.parseDouble(scanner.nextLine());
        double OrangeCount = Double.parseDouble(scanner.nextLine());
        double RaspberryCount = Double.parseDouble(scanner.nextLine());
        double StrawberryCount = Double.parseDouble(scanner.nextLine());

        double RaspberryPrice =(StrawberryPrice * 0.50);
        double OrangePrice = RaspberryPrice-(RaspberryPrice * 0.40);
        double BananaPrice = RaspberryPrice-(RaspberryPrice * 0.80);

        double sum =(BananaCount * BananaPrice) + (OrangeCount * OrangePrice) + (RaspberryCount * RaspberryPrice) + (StrawberryCount * StrawberryPrice);
        System.out.printf("%.2f",sum);
    }
}
