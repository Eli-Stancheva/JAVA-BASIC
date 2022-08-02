package BASICS.LAB_1;

import java.util.Scanner;

public class P9_YardGreening {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double metres = Double.parseDouble(scan.nextLine());
        double price =  metres * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        System.out.printf("The final price is: %.2f lv. \n",finalPrice);
        System.out.printf("The discount is: %.2f lv. \n", discount);
    }
}
