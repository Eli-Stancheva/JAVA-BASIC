package BASICS.EXERCISE_5;

import java.util.Scanner;

public class P2_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failed = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int solvedProblems = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (failedTimes < failed){
            String problemName = scanner.nextLine();
            if(problemName.equals("Enough")){
                isFailed = false;
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());
            if(grade <= 4){
                failedTimes ++;
            }
            gradesSum += grade;
            solvedProblems ++;
            lastProblem = problemName;

        }

        if(isFailed){
            System.out.printf("You need a break, %d poor grades.",failed);
        } else {
            System.out.printf("Average score: %.2f\n", gradesSum/solvedProblems);
            System.out.printf("Number of problems: %d\n",solvedProblems);
            System.out.printf("Last problem: %s",lastProblem);
        }
    }
}
