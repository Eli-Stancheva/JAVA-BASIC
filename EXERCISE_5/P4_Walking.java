package BASICS.EXERCISE_5;

import java.util.Scanner;

public class P4_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int goal = 10000;
       int steps = 0;

       while (steps < goal){
           String input = scanner.nextLine();

           if (input.equals("Going home")){
               steps = steps + Integer.parseInt(scanner.nextLine());
               break;
           }
           steps = steps + Integer.parseInt(input);
       }
       if (steps >= goal){
           System.out.printf("Goal reached! Good job!\n" +
                   "%d steps over the goal!\n", steps - goal);
       } else {
           System.out.printf("%d more steps to reach goal.", goal - steps);
       }
    }
}
