package BASICS.Exam_6_and_7_April_2019;

import java.util.Scanner;

public class P5_MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFilms = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.NEGATIVE_INFINITY;
        double minValue = Double.POSITIVE_INFINITY;
        String bestMovie = "";
        String worstMovie = "";
        boolean isMax = false;
        boolean isMin = false;
        double average = 0;

        for (int i = 1; i <= countFilms; i++) {
            String nameFilms = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            if (rating > maxValue) {
                maxValue = rating;
                bestMovie = nameFilms;
                isMax = true;
            } else if (rating < minValue) {
                minValue = rating;
                worstMovie = nameFilms;
                isMin = true;
            }
            average = average + (rating / countFilms);
        }

        if (isMax) {
            System.out.printf("%s is with highest rating: %.1f\n", bestMovie, maxValue);
        }
        if (isMin) {
            System.out.printf("%s is with lowest rating: %.1f\n", worstMovie, minValue);
        }
        System.out.printf("Average rating: %.1f", average);
    }
}
