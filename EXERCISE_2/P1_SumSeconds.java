package BASICS.EXERCISE_2;

import java.util.Scanner;

public class P1_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int time = first + second + third;
        int min = time /60;
        int sec = time % 60;

        if (sec < 10){
            System.out.printf("%d:0%d",min,sec);
        }else{
            System.out.printf("%d:%d",min,sec);
        }
    }
}
