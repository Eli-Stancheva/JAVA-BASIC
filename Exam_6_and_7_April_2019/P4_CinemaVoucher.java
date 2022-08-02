package BASICS.Exam_6_and_7_April_2019;

import java.util.Scanner;

public class P4_CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherPrice = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int tickets = 0;
        int other = 0;

        while (!input.equals("End")) {
            int price = 0;

            if (input.length() > 8) {
                char symbol1 = input.charAt(0);
                char symbol2 = input.charAt(1);
                price = symbol1 + symbol2;
                if (voucherPrice - price < 0) {
                    break;
                } else {
                    tickets++;
                    voucherPrice = voucherPrice - price;
                }
            } else {
                char symbol = input.charAt(0);
                price = symbol;
                if (voucherPrice - price < 0) {
                    break;
                } else {
                    other++;
                    voucherPrice = voucherPrice - price;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(tickets);
        System.out.println(other);
    }
}
