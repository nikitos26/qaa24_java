package lesson_2.hw.main;


// Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
// Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2').

import java.util.Scanner;

public class HW3 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свое любое число -> ");

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.print("Вы ввели 0. Введите другое число.");
        } else if (number % 2 == 0) {
            System.out.print("Число " + number + " четное.");
        } else {
            System.out.print("Число " + number + " нечетное.");
        }
    }

}

