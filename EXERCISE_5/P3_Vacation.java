package BASICS.EXERCISE_5;

import java.util.Scanner;

public class P3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        int allDays = 0;
        while (ownedMoney < vacationMoney) {
            String action = scanner.nextLine();
            double actionMoney = Double.parseDouble(scanner.nextLine());
            allDays++;

            switch (action) {
                case "spend":
                    ownedMoney -= actionMoney;
                    spendDays ++;
                    if (ownedMoney < 0){
                        ownedMoney = 0;
                    }
                    break;
                case "save":
                    ownedMoney += actionMoney;
                    spendDays = 0;
                    break;
            }
            if (spendDays == 5){
                break;
            }
        }

        if (ownedMoney >= vacationMoney){
            System.out.printf("You saved the money for %d days.", allDays);
        } else {
            System.out.println("You can't save the money.");
            System.out.println(allDays);
        }
    }
}
