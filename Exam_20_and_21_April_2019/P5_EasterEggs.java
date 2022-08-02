package BASICS.Exam_20_and_21_April_2019;

import java.util.Scanner;

public class P5_EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());

        int countRed = 0;
        int countOrange = 0;
        int countBlue = 0;
        int countGreen = 0;

        int max = Integer.MIN_VALUE;
        String name = "";

        for (int i = 1; i <= eggs; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    countRed++;
                    break;
                case "orange":
                    countOrange++;
                    break;
                case "blue":
                    countBlue++;
                    break;
                case "green":
                    countGreen++;
                    break;
            }
        }
        System.out.printf("Red eggs: %d\n", countRed);
        System.out.printf("Orange eggs: %d\n", countOrange);
        System.out.printf("Blue eggs: %d\n", countBlue);
        System.out.printf("Green eggs: %d\n", countGreen);

        if (countRed > max) {
            max = countRed;
            name = "red";
        }
        if (countOrange > max) {
            max = countOrange;
            name = "orange";
        }
        if (countBlue > max) {
            max = countBlue;
            name = "blue";
        }
        if (countGreen > max) {
            max = countGreen;
            name = "green";
        }
        System.out.printf("Max eggs: %d -> %s", max, name);
    }
}
