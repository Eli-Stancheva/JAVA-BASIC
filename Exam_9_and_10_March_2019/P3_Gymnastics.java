package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P3_Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String instrument = scanner.nextLine();

        double all = 0;

        switch (country) {
            case "Russia":
                if (instrument.equals("ribbon")) {
                    all = 9.100 + 9.400;
                } else if (instrument.equals("hoop")) {
                    all = 9.300 + 9.800;
                } else if (instrument.equals("rope")) {
                    all = 9.600 + 9.000;
                }
                break;
            case "Bulgaria":
                if (instrument.equals("ribbon")) {
                    all = 9.600 + 9.400;
                } else if (instrument.equals("hoop")) {
                    all = 9.550 + 9.750;
                } else if (instrument.equals("rope")) {
                    all = 9.500 + 9.400;
                }
                break;
            case "Italy":
                if (instrument.equals("ribbon")) {
                    all = 9.200 + 9.500;
                } else if (instrument.equals("hoop")) {
                    all = 9.450 + 9.350;
                } else if (instrument.equals("rope")) {
                    all = 9.700 + 9.150;
                }
                break;
        }
        double diffToGoal = 20.000 - all;
        double percent = (diffToGoal / 20) * 100;
        System.out.printf("The team of %s get %.3f on %s.\n",country,all,instrument);
        System.out.printf("%.2f%%", percent);
    }
}
