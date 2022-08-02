package BASICS.EXERCISE_3;

import java.util.Scanner;

public class P8_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arriveTime = arriveHour * 60 + arriveMinute;

        if (arriveTime < examTime - 30) {           //early
            System.out.println("Early");
            int diff = examTime - arriveTime;
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                int h = diff / 60;
                int m = diff % 60;
                System.out.printf("%d:%02d hours before the start", h, m);
            }
        } else if (arriveTime <= examTime) {       //on time
            System.out.println("On time");
            int diff = examTime - arriveTime;
            if (diff > 0){
                System.out.printf("%d minutes before the start", diff);
            }
        } else {                                   //late
            System.out.println("Late");
            int diff = arriveTime - examTime;
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                int h = diff / 60;
                int m = diff % 60;
                System.out.printf("%d:%02d hours after the start", h, m);
            }
        }
    }
}
