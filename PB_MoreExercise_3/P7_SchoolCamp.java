package BASICS.PB_MoreExercise_3;

import java.util.Scanner;

public class P7_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double discount = 0;
        double price = 0;
        double finalPrice = 0;

   /*     switch (season) {
            case "Winter":
                if (group.equals("boys")) {
                    price = nights * 9.60 * students;
                    if (students >= 10 && students < 20) {
                       discount = price * 0.05;
                       finalPrice = price - discount;
                    } else if (students >= 20 && students < 50) {
                        discount = price * 0.15;
                        finalPrice = price - discount;
                    } else if (students >= 50){
                        discount = price * 0.50;
                        finalPrice = price - discount;
                    } else {
                        finalPrice = price;
                    }
                    System.out.printf("Judo %.2f lv.",finalPrice);
                } else if (group.equals("girls")){
                    price = nights * 9.60 * students;
                    if (students >= 10 && students < 20) {
                        discount = price * 0.05;
                        finalPrice = price - discount;
                    } else if (students >= 20 && students < 50) {
                        discount = price * 0.15;
                        finalPrice = price - discount;
                    } else if (students >= 50){
                        discount = price * 0.50;
                        finalPrice = price - discount;
                    } else {
                        finalPrice = price;
                    }
                    System.out.printf("Gymnastics %.2f lv.",finalPrice);
                } else if (group.equals("mixed")){
                    price = nights * 10 * students;
                    if (students >= 10 && students < 20) {
                        discount = price * 0.05;
                        finalPrice = price - discount;
                    } else if (students >= 20 && students < 50) {
                        discount = price * 0.15;
                        finalPrice = price - discount;
                    } else if (students >= 50){
                        discount = price * 0.50;
                        finalPrice = price - discount;
                    } else {
                        finalPrice = price;
                    }
                    System.out.printf("Ski %.2f lv.",finalPrice);
                }
                break;
            case "Spring":
                if (group.equals("boys")) {
                    price = nights * 7.20 * students;
                    if (students >= 10 && students < 20) {
                        discount = price * 0.05;
                        finalPrice = price - discount;
                    } else if (students >= 20 && students < 50) {
                        discount = price * 0.15;
                        finalPrice = price - discount;
                    } else if (students >= 50){
                        discount = price * 0.50;
                        finalPrice = price - discount;
                    } else {
                        finalPrice = price;
                    }
                    System.out.printf("Tennis %.2f lv.",finalPrice);
                } else if (group.equals("girls")){
                    price = nights * 7.20 * students;
                    if (students >= 10 && students < 20) {
                        discount = price * 0.05;
                        finalPrice = price - discount;
                    } else if (students >= 20 && students < 50) {
                        discount = price * 0.15;
                        finalPrice = price - discount;
                    } else if (students >= 50){
                        discount = price * 0.50;
                        finalPrice = price - discount;
                    } else {
                        finalPrice = price;
                    }
                    System.out.printf("Athletics %.2f lv.",finalPrice);
                } else if (group.equals("mixed")){
                    price = nights * 9.50 * students;
                    if (students >= 10 && students < 20) {
                        discount = price * 0.05;
                        finalPrice = price - discount;
                    } else if (students >= 20 && students < 50) {
                        discount = price * 0.15;
                        finalPrice = price - discount;
                    } else if (students >= 50){
                        discount = price * 0.50;
                        finalPrice = price - discount;
                    } else {
                        finalPrice = price;
                    }
                    System.out.printf("Cycling %.2f lv.",finalPrice);
                }
                break;
            case "Summer":
                if (group.equals("boys")) {
                    price = nights * 15 * students;
                    if (students >= 10 && students < 20) {
                        discount = price * 0.05;
                        finalPrice = price - discount;
                    } else if (students >= 20 && students < 50) {
                        discount = price * 0.15;
                        finalPrice = price - discount;
                    } else if (students >= 50){
                        discount = price * 0.50;
                        finalPrice = price - discount;
                    } else {
                        finalPrice = price;
                    }
                    System.out.printf("Football %.2f lv.",finalPrice);
                } else if (group.equals("girls")){
                    price = nights * 15 * students;
                    if (students >= 10 && students < 20) {
                        discount = price * 0.05;
                        finalPrice = price - discount;
                    } else if (students >= 20 && students < 50) {
                        discount = price * 0.15;
                        finalPrice = price - discount;
                    } else if (students >= 50){
                        discount = price * 0.50;
                        finalPrice = price - discount;
                    } else {
                        finalPrice = price;
                    }
                    System.out.printf("Volleyball %.2f lv.",finalPrice);
                } else if (group.equals("mixed")){
                    price = nights * 20 * students;
                    if (students >= 10 && students < 20) {
                        discount = price * 0.05;
                        finalPrice = price - discount;
                    } else if (students >= 20 && students < 50) {
                        discount = price * 0.15;
                        finalPrice = price - discount;
                    } else if (students >= 50){
                        discount = price * 0.50;
                        finalPrice = price - discount;
                    } else {
                        finalPrice = price;
                    }
                    System.out.printf("Swimming %.2f lv.",finalPrice);
                }
                break;
        } */

        switch (season) {
            case "Winter":
                if (group.equals("boys")) {
                    price = nights * 9.60 * students;
                } else if (group.equals("girls")) {
                    price = nights * 9.60 * students;
                } else if (group.equals("mixed")) {
                    price = nights * 10 * students;
                }
                break;
            case "Spring":
                if (group.equals("boys")) {
                    price = nights * 7.20 * students;
                } else if (group.equals("girls")) {
                    price = nights * 7.20 * students;
                } else if (group.equals("mixed")) {
                    price = nights * 9.50 * students;
                }
                break;
            case "Summer":
                if (group.equals("boys")) {
                    price = nights * 15 * students;
                } else if (group.equals("girls")) {
                    price = nights * 15 * students;
                } else if (group.equals("mixed")) {
                    price = nights * 20 * students;
                }


                break;
        }
        if (students >= 10 && students < 20) {
            discount = price * 0.05;
            finalPrice = price - discount;
        } else if (students >= 20 && students < 50) {
            discount = price * 0.15;
            finalPrice = price - discount;
        } else if (students >= 50) {
            discount = price * 0.50;
            finalPrice = price - discount;
        } else {
            finalPrice = price;
        }

        if(group.equals("boys")){
            if (season.equals("Winter")){
                System.out.printf("Judo %.2f lv.",finalPrice);
            } else if (season.equals("Spring")){
                System.out.printf("Tennis %.2f lv.",finalPrice);
            } else if (season.equals("Summer")){
                System.out.printf("Football %.2f lv.",finalPrice);
            }
        } else if (group.equals("girls")){
            if (season.equals("Winter")){
                System.out.printf("Gymnastics %.2f lv.",finalPrice);
            } else if (season.equals("Spring")){
                System.out.printf("Athletics %.2f lv.",finalPrice);
            } else if (season.equals("Summer")){
                System.out.printf("Volleyball %.2f lv.",finalPrice);
            }
        } else if (group.equals("mixed")){
            if (season.equals("Winter")){
                System.out.printf("Ski %.2f lv.",finalPrice);
            } else if (season.equals("Spring")){
                System.out.printf("Cycling %.2f lv.",finalPrice);
            } else if (season.equals("Summer")){
                System.out.printf("Swimming %.2f lv.",finalPrice);
            }
        }

    }
}
