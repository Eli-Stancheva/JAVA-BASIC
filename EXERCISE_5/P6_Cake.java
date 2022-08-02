package BASICS.EXERCISE_5;

import java.util.Scanner;

public class P6_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int cakePieces = width * length;

        while (!input.equals("STOP")) {
            int eatenPieces = Integer.parseInt(input);
            cakePieces = cakePieces - eatenPieces;

            if (cakePieces <= 0){
                break;
            }

            input = scanner.nextLine();
        }

        if (cakePieces <= 0){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        } else {
            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}
