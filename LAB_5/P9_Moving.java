package BASICS.LAB_5;

import java.util.Scanner;

public class P9_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int volumeHouse = width * length * height;
        int sumBoxes = 0;

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);

            sumBoxes = sumBoxes + boxes;

            if (sumBoxes > volumeHouse){
                break;
            }

            input = scanner.nextLine();
        }

        int diff = Math.abs(volumeHouse - sumBoxes);

        if (sumBoxes > volumeHouse){
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else{
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}
