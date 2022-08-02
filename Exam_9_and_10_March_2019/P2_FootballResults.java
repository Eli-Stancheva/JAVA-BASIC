package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P2_FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        int won = 0;
        int lost = 0;
        int drawn = 0;

        int symbolFirst1 = first.charAt(0);
        int symbolFirst2 = first.charAt(2);

        if (symbolFirst1 > symbolFirst2) {
            won++;
        } else if (symbolFirst1 < symbolFirst2) {
            lost++;
        } else {
            drawn++;
        }

        int symbolSecond1 = second.charAt(0);
        int symbolSecond2 = second.charAt(2);

        if (symbolSecond1 > symbolSecond2) {
            won++;
        } else if (symbolSecond1 < symbolSecond2) {
            lost++;
        } else {
            drawn++;
        }

        int symbolThird1 = third.charAt(0);
        int symbolThird2 = third.charAt(2);

        if (symbolThird1 > symbolThird2) {
            won++;
        } else if (symbolThird1 < symbolThird2) {
            lost++;
        } else {
            drawn++;
        }

        System.out.printf("Team won %d games.\n", won);
        System.out.printf("Team lost %d games.\n", lost);
        System.out.printf("Drawn games: %d", drawn);
    }
}
