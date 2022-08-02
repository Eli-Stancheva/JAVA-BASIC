package BASICS.EXERCISE_5;

import java.util.Scanner;

public class P1_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String book = scanner.nextLine();
        int countBooks = 0;


        while (!book.equals("No More Books")){
            if (book.equals(input)){
                break;
            }
            countBooks ++;
            book = scanner.nextLine();

        }

        if (book.equals(input)){
            System.out.printf("You checked %d books and found it.",countBooks);
        } else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",countBooks);
        }
    }
}
