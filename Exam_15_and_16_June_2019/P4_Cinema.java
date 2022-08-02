package BASICS.Exam_15_and_16_June_2019;

import java.util.Scanner;

public class P4_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seats = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int price = 0;

        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);

            if (seats - people >= 0) {
                seats = seats - people;
                price += people * 5;
                if (people % 3 == 0) {
                    price -= 5;
                }
            } else {
                System.out.println("The cinema is full.");
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.\n", seats);
        }
        System.out.printf("Cinema income - %d lv.", price);
    }
}
