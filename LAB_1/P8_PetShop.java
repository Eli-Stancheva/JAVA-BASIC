package BASICS.LAB_1;

import java.util.Scanner;

public class P8_PetShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int animals = Integer.parseInt(scan.nextLine());
        double forDogs = dogs * 2.50;
        double forAnimals = animals * 4.0;
        double price = forDogs + forAnimals;
        System.out.printf("%.2f lv.\n",price);
    }
}
