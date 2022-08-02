package BASICS.PB_MoreExercise_1;

import java.util.Scanner;

public class P9_WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        if(name.equals("sunny")){
            System.out.println("It's warm outside!");
        }else{
            System.out.println("It's cold outside!");
        }
    }
}
