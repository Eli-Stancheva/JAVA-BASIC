package BASICS.EXERCISE_2;

import java.util.Scanner;

public class P5_TimepPlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int minutes = (min + 15) % 60;


        if (min >=45) {
            hour = hour+1;
        }
        if(hour == 24){
            hour = 0;
        }
        if(minutes < 10){
            System.out.printf("%d:0%d",hour,minutes);
        }else{
            System.out.printf("%d:%d",hour,minutes);
        }

    }
}
