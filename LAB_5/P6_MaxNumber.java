package BASICS.LAB_5;

import java.util.Scanner;

public class P6_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);

            if (number > max){
                max = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(max);
    }
}
