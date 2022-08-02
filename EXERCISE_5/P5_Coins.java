package BASICS.EXERCISE_5;

import java.util.Scanner;

public class P5_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        price = Math.floor(price * 100);
        int count = 0;

        while (price > 0){
            if (price >= 200){
                price -= 200;
            } else if (price >= 100){
                price -= 100;
            } else if (price >= 50){
                price -= 50;
            }else if (price >= 20){
                price -= 20;
            }else if (price >= 10){
                price -= 10;
            }else if (price >= 5){
                price -= 5;
            }else if (price >= 2){
                price -= 2;
            }else if (price >= 1){
                price -= 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
