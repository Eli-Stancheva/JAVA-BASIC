package BASICS.LAB_1;

import java.util.Scanner;

public class P6_ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String FirstName = scan.nextLine();
        String LastName = scan.nextLine();
        String Age = scan.nextLine();
        String City = scan.nextLine();

        System.out.println("You are " + FirstName + " " + LastName + ", a " + Age + "-years old person from " + City + ".");

    }
}
