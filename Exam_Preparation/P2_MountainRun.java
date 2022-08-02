package BASICS.Exam_Preparation;

import java.util.Scanner;

public class P2_MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMetres = Double.parseDouble(scanner.nextLine());
        double timeSec = Double.parseDouble(scanner.nextLine()); // za 1 metar

        double climbing = distanceMetres * timeSec;
        double late = Math.floor(distanceMetres / 50) * 30;
        double georgiTime = climbing + late;

        if (recordSeconds < georgiTime){
            System.out.printf("No! He was %.2f seconds slower.", georgiTime - recordSeconds);
        } else if (recordSeconds > georgiTime){
            System.out.printf("Yes! The new record is %.2f seconds.", georgiTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", recordSeconds - georgiTime);
        }
    }
}
