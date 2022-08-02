package BASICS.Exam_Preparation;

import java.util.Scanner;

public class P1_OscarsCeremony {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int rent = Integer.parseInt(scanner.nextLine());

            double statue = rent * 0.70;
            double food = statue * 0.85;
            double music = food / 2;
            double all = rent + statue + food + music;
            System.out.printf("%.2f ", all);
        }

    }
