package BASICS.PB_MoreExercise_1;

import java.util.Scanner;

public class P4_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablePriceKg = Double.parseDouble(scanner.nextLine());
        double fruitPriceKg = Double.parseDouble(scanner.nextLine());
        int allVegetableKg = Integer.parseInt(scanner.nextLine());
        int allFruitKg = Integer.parseInt(scanner.nextLine());

        double priceVegetable = (vegetablePriceKg * allVegetableKg);
        double priceFruit = (fruitPriceKg * allFruitKg);
        double allPrice = priceVegetable + priceFruit;
        double price = allPrice / 1.94;
        System.out.printf("%.2f",price);

    }
}
