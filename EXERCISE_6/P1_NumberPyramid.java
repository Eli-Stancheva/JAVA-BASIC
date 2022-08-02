package BASICS.EXERCISE_6;

import java.util.Scanner;

public class P1_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int curr = 1;
        boolean flag = false;

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <=r ; c++) {

                if(curr > n){
                    flag = true;
                    break;
                }
                System.out.print(curr + " ");
                curr++;
            }
            if (flag){
                break;
            }
            System.out.println();
        }
    }
}
