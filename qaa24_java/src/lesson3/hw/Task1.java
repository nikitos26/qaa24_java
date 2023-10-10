package lesson3.hw;

//    Создайте массив целых чисел. Напишете программу, которая выводит
//    сообщение о том, входит ли заданное число в массив или нет.
//    Пусть число для поиска задается с консоли (класс Scanner).

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            int number = random.nextInt(20);
            numbers[i] = number;
        }

        System.out.print("Введите число от 0 до 20 -> ");
        int userNumber = scanner.nextInt();

        if ((userNumber < 0) || (userNumber > 20)) {
            System.out.println("Число " + userNumber + " вне диапозона!");
        } else {
            boolean target = false;
            for (int number : numbers) {
                if (number == userNumber) {
                    target = true;
                    break;
                }
            }
            if (target) {
                System.out.println("Число " + userNumber + " есть в списке!");
            } else {
                System.out.println("Числа " + userNumber + " нет в списке!");
            }
        }
    }
}
