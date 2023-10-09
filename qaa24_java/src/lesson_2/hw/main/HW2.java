package lesson_2.hw.main;

import java.util.Scanner;


//     Написать программу для вывода названия поры года по номеру месяца.
//     При решении используйте оператор if-else-if

public class HW2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца что бы узнать пору года -> ");
        int mounth = scanner.nextInt();

        if (mounth<3 || mounth==12){
            System.out.println("Пора года: Зима");
        } else if (2 < mounth && mounth < 6) {
            System.out.println("Пора года: Весна");
        } else if (5 < mounth && mounth < 9) {
            System.out.println("Пора года: Лето");
        } else if (8 < mounth && mounth < 12) {
            System.out.println("Пора года: Осень");
        } else {
            System.out.println("Некорректный номер месяца");
        }

    }
}
