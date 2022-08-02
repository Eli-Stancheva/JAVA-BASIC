package BASICS.Exam_15_and_16_June_2019;

import java.util.Scanner;

public class P5_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double diff = 0;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double priceSerial = Double.parseDouble(scanner.nextLine());

            switch (name) {
                case "Thrones":
                    diff = priceSerial * 0.50;
                    break;
                case "Lucifer":
                    diff = priceSerial * 0.60;
                    break;
                case "Protector":
                    diff = priceSerial * 0.70;
                    break;
                case "TotalDrama":
                    diff = priceSerial * 0.80;
                    break;
                case "Area":
                    diff = priceSerial * 0.90;
                    break;
                default:
                    diff = priceSerial;
                    break;
            }
            sum = sum + diff;
        }
        if (budged >= sum){
            System.out.printf("You bought all the series and left with %.2f lv.", budged - sum);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", sum - budged);
        }
    }
}
