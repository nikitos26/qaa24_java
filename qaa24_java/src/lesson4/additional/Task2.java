package lesson4.additional;

//  Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    static public void main(String[] srg) {
        int[][] arr = new int[3][3];
        Random random = new Random();

        // Заполняем массив случайными числами
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                arr[a][b] = random.nextInt(10);
            }
        }

        System.out.println("Заполненный массив -> " + Arrays.deepToString(arr));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива -> " + sum);
    }
}
