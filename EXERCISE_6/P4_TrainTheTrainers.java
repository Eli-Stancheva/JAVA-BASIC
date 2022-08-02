package BASICS.EXERCISE_6;

import java.util.Scanner;

public class P4_TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();

        double averageGrade = 0;
        double averageAll = 0;
        int countPresentationName = 0;
        double sumAverageGrade = 0;

        while (!presentationName.equals("Finish")) {
            double gradeSum = 0;
            countPresentationName++;

            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSum += grade;
                averageGrade = gradeSum / jury;
            }
            System.out.printf("%s - %.2f. \n", presentationName, averageGrade);
            sumAverageGrade += averageGrade;
            averageAll = sumAverageGrade / countPresentationName;

            presentationName = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", averageAll);
    }
}
