package BASICS.PB_MoreExercise_1;

import java.util.Scanner;

public class P5_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double len = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        len = len * 100;
        width = width * 100 - 100;
        int rows = (int)(len/120);
        int col = (int)(width/70);
        int all = (rows * col)-3;
        System.out.println(all);
    }
}
