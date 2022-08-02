package BASICS.Exam_Preparation;

import java.util.Scanner;

public class P5_Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int notPaint = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int surface = height * width * 4;
        double finalSurface = Math.ceil(surface - (surface * notPaint * 1.0 / 100));

        while (!input.equals("Tired!")) {
            int litresPaint = Integer.parseInt(input);

            finalSurface = finalSurface - litresPaint;

            if (finalSurface <= 0){
                break;
            }
            input = scanner.nextLine();
        }
        if(input.equals("Tired!")){
            System.out.printf("%.0f quadratic m left.", finalSurface);
        } else if (finalSurface < 0){
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(finalSurface));
        } else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
