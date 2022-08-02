package BASICS.EXERCISE_2;

import java.util.Scanner;

public class P4_MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if(first.equals("cm")){
            number = number * 0.01;
        }else if(first.equals("mm")){
            number = number * 0.001;
        }

        if(second.equals("cm")){
            number = number * 100;
        }else if(second.equals("mm")){
            number = number * 1000;
        }
        System.out.printf("%.3f", number);
    }
}
