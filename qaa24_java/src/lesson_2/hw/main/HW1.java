package lesson_2.hw.main;

import java.util.Scanner;

//  Написать программу для вывода названия поры года по номеру месяца.
//  При решении используйте оператор switch-case

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца что бы узнать пору года -> ");
        int mounth = scanner.nextInt();

        switch (mounth) {
            case 12:
            case 1:
            case 2:
                System.out.println("Пора года: Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Пора года: Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Пора года: Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Пора года: Осень");
                break;
            default:
                System.out.println("Некорректный номер месяца");
                break;
        }


    }
}
