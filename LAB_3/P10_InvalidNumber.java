package BASICS.LAB_3;

import java.util.Scanner;

public class P10_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if((num >= 100 && num <= 200) || num == 0){

        }else{
            System.out.println("invalid");
        }
    }
}
