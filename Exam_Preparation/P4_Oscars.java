package BASICS.Exam_Preparation;

import java.util.Scanner;

public class P4_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        double finalPoints = academyPoints;

        for (int i = 1; i <= juryCount; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            int lenName = juryName.length();
            double points = (lenName * juryPoints) / 2;
            finalPoints = finalPoints + points;

            if (finalPoints > 1250.5) {
                break;
            }
        }
        double diff = 1250.5 - finalPoints;
        if (finalPoints > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, finalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, diff);
        }
    }
}
