package lesson4.hw;

//  Создать трехмерный массив из целых чисел.
//  С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
//  Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int[][][] arr = new int[2][2][3];
        Random random = new Random();

        // Заполняем массив случайными числами
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                for (int c = 0; c < arr[a][b].length; c++) {
                    arr[a][b][c] = random.nextInt(10);
                }
            }
        }
        System.out.println("Заполненный массив -> " + Arrays.deepToString(arr));

        System.out.print("Введите целое число -> ");
        int userNumber = scanner.nextInt();

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                for (int c = 0; c < arr[a][b].length; c++) {
                    arr[a][b][c] += userNumber;
                }
            }
        }

        System.out.println("Измененный массив -> " + Arrays.deepToString(arr));
    }
}