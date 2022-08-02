package BASICS.EXERCISE_1;

import java.util.Scanner;

public class P5_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());

        double cake = rent * 0.20;
        double drinks = cake - cake * 0.45;
        double animator = 1.0 * rent * 1/3;

        double price = rent + cake + drinks + animator;
        System.out.println(price);
    }
}
