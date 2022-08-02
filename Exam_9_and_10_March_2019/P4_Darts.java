package BASICS.Exam_9_and_10_March_2019;

import java.util.Scanner;

public class P4_Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int startPoints = 301;
        int win = 0;
        int lost = 0;

        while(startPoints != 0){
            String area = scanner.nextLine();

            if (area.equals("Retire")){
                break;
            }

            int points = Integer.parseInt(scanner.nextLine());

            if (area.equals("Triple")){
                points *= 3;
            } else if (area.equals("Double")){
                points *= 2;
            }

            if (startPoints - points >= 0){
                startPoints -= points;
                win++;
            } else {
                lost++;
            }
        }
        if (startPoints == 0){
            System.out.printf("%s won the leg with %d shots.", name, win);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, lost);
        }
    }
}
