package BASICS.LAB_5;

import java.util.Scanner;

public class P4_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int count = 1;
        while (count <= number) {
            System.out.println(count);
            count = count * 2 + 1;
        }
    }
}
