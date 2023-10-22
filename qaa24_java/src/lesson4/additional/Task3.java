package lesson4.additional;

//  Создайте двумерный массив. Выведите на консоль диагонали массива.

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] arg) {
        int[][] arr = new int[3][3];
        Random random = new Random();

        // Заполняем массив случайными числами
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                arr[a][b] = random.nextInt(10);
            }
        }
        System.out.println("Заполненный массив -> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Главная диагональ:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }

        System.out.println("\nПобочная диагональ:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length - i - 1] + " ");
        }
    }
}
