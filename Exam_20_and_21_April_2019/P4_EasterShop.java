package BASICS.Exam_20_and_21_April_2019;

import java.util.Scanner;

public class P4_EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsCount = Integer.parseInt(scanner.nextLine());
        int soldEggs = 0;

        String command = scanner.nextLine();

        while (!command.equals("Close")) {
            if (command.equals("Fill")) {
                int toFill = Integer.parseInt(scanner.nextLine());
                eggsCount += toFill;
            }
            if (command.equals("Buy")) {
                int count = Integer.parseInt(scanner.nextLine());
                if (count <= eggsCount) {
                    eggsCount -= count;
                    soldEggs += count;
                } else {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", eggsCount);
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if (command.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        }
    }
}
