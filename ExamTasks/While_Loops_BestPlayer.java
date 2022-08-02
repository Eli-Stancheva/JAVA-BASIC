package BASICS.ExamTasks;

import java.util.Scanner;

public class While_Loops_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int bestGoal = Integer.MIN_VALUE;
        String bestPlayer = "";
        boolean isHatTrick = false;

        while (!name.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > bestGoal){
                bestGoal = goals;
                bestPlayer = name;
            }
            if (goals >= 3){
                isHatTrick = true;
            }
            if(goals >= 10){
                break;
            }
            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!\n", bestPlayer);
        if (isHatTrick){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",bestGoal);
        } else {
            System.out.printf("He has scored %d goals.",bestGoal);
        }
    }
}
