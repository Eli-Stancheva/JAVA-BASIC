package BASICS.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class P6_TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String winnerWord = "";
        double maxPower = 0;

        while (!input.equals("End of words")) {
            double sum = 0;

            for (int i = 0; i < input.length(); i++) {
                sum = sum + input.charAt(i);
            }
            int numLength = input.length();
            String firstLetter = input.toLowerCase();

            if (firstLetter.charAt(0) == 'a' ||
                    firstLetter.charAt(0) == 'e' ||
                    firstLetter.charAt(0) == 'i' ||
                    firstLetter.charAt(0) == 'o' ||
                    firstLetter.charAt(0) == 'u' ||
                    firstLetter.charAt(0) == 'y') {
                sum = sum * numLength;
            } else {
                sum = Math.floor(sum / numLength);
            }
            if (sum > maxPower) {
                maxPower = sum;
                winnerWord = input;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f",winnerWord,maxPower);
    }
}
