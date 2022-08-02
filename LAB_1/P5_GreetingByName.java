package BASICS.LAB_1;

import java.util.Scanner;

public class P5_GreetingByName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
