package BASICS.LAB_4;

import java.util.Scanner;

public class P5_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int len = word.length();

        for (int i = 0; i < len; i++) {
            char letter = word.charAt(i);
            System.out.println(letter);
        }
    }
}
