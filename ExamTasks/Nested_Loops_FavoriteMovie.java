package BASICS.ExamTasks;

import java.util.Scanner;

public class Nested_Loops_FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int movieCounter = 0;
        int maxAmount = 0;
        String bestMovie = "";

        while (!movie.equals("STOP")) {
            movieCounter++;
            int sum = 0;

            for (int i = 0; i < movie.length(); i++) {
                char symbol = movie.charAt(i);
                sum += symbol;

                if (symbol >= 97 && symbol <= 122) {
                    sum -= 2 * movie.length();
                } else if (symbol >= 65 && symbol <= 90) {
                    sum -= movie.length();
                }

                if (sum > maxAmount){
                    maxAmount = sum;
                    bestMovie = movie;
                }
            }

            if (movieCounter == 7) {
                System.out.println("The limit is reached.");
                break;
            }
            movie = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxAmount);
    }
}
