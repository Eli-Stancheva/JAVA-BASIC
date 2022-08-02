package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P2_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.parseInt(scanner.nextLine());
        int sec = Integer.parseInt(scanner.nextLine());
        double len = Double.parseDouble(scanner.nextLine());
        int secFor100m = Integer.parseInt(scanner.nextLine());

        int allSec = min * 60 + sec;
        double lateLen = len / 120;
        double allLate = lateLen * 2.5;
        double marin = (len / 100) * secFor100m - allLate;

        if (marin <= allSec){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", marin);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", marin - allSec);
        }
    }
}
