package BASICS.LAB_2;

import java.util.Scanner;

public class P5_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String phrase = "s3cr3t!P@ssw0rd";
        if(password.equals(phrase)){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}
