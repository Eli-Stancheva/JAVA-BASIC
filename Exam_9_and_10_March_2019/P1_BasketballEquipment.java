package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P1_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racket = Double.parseDouble(scanner.nextLine());
        int countRacket = Integer.parseInt(scanner.nextLine());
        int countShoes = Integer.parseInt(scanner.nextLine());

        double racketPrice = racket * countRacket;
        double shoePrice = racket / 6;
        double allShoes = shoePrice * countShoes;
        double otherPrice = (racketPrice + allShoes) * 0.20;
        double finalPrice = racketPrice + allShoes + otherPrice;
        double djokovic = Math.floor(finalPrice / 8);
        double sponsors = Math.ceil(finalPrice * 7 / 8);

        System.out.printf("Price to be paid by Djokovic %.0f\n", djokovic);
        System.out.printf("Price to be paid by sponsors %.0f", sponsors);
    }
}
