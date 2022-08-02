package BASICS.EXERCISE_3;

import java.util.Scanner;

public class P6_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum;
        double dou;
        String operator = scanner.nextLine();

        if (operator.equals("+")) {
            sum = num1 + num2;
            if (sum % 2 == 0) {
                System.out.printf("%d + %d = %d - even", num1, num2, sum);
            } else {
                System.out.printf("%d + %d = %d - odd", num1, num2, sum);
            }
        } else if (operator.equals("-")) {
            sum = num1 - num2;
            if (sum % 2 == 0) {
                System.out.printf("%d - %d = %d - even", num1, num2, sum);
            } else {
                System.out.printf("%d - %d = %d - odd", num1, num2, sum);
            }
        } else if (operator.equals("*")) {
            sum = num1 * num2;
            if (sum % 2 == 0) {
                System.out.printf("%d * %d = %d - even", num1, num2, sum);
            } else {
                System.out.printf("%d * %d = %d - odd", num1, num2, sum);
            }
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                dou = 1.00 * num1 / num2;
                System.out.printf("%d / %d = %.2f", num1, num2, dou);
            }
        } else if (operator.equals("%")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                sum = num1 % num2;
                char a = '%';
                System.out.printf("%d %c %d = %d", num1, a, num2, sum);
            }
        }
    }
}
