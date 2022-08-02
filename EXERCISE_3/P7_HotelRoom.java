package BASICS.EXERCISE_3;

import java.util.Scanner;

public class P7_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mount = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0;
        double apartment = 0;

        switch (mount) {
            case "May":
            case "October":
                studio = 50.00;
                apartment = 65.00;
                if (nights > 7 && nights <= 14) {
                    studio *= 0.95;
                } else if (nights > 14) {
                    studio *=  0.70;
                }
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                if (nights > 14) {
                    studio *= 0.80;
                }
                break;
            case "July":
            case "August":
                studio = 76.00;
                apartment = 77.00;
                break;
        }
        if (nights > 14){
            apartment *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.\n", apartment * nights);
        System.out.printf("Studio: %.2f lv.", studio * nights);
    }
}
