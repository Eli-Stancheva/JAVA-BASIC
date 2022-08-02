package BASICS.EXERCISE_2;

import java.util.Scanner;

public class P2_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startCount = Integer.parseInt(scanner.nextLine());

        double bonus = 0;
        if(startCount <= 100){
            bonus = 5;
        }else if(startCount <= 1000){
            bonus = startCount * 0.20;
        }else{
            bonus = startCount * 0.10;
        }

        if(startCount % 2 == 0){
            bonus += 1;
        }else if(startCount % 10 ==5){
            bonus +=2;
        }
        System.out.println(bonus);
        System.out.println(startCount + bonus);
    }
}
