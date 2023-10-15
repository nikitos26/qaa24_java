package lesson3.additional;

import java.util.Arrays;
import java.util.Random;

//   Создайте массив и заполните массив.
//   Выведите массив на экран в строку.
//   Замените каждый элемент с нечётным индексом на ноль.
//   Снова выведете массив на экран на отдельной строке.
public class Task2 {
    public static void main(String[] arg) {
        Random random = new Random();
        int[] arr = new int[20];

        // Заполняем массив рандомными значениями
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(arr));

        // Заменяем нечётным индексом на ноль
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.print(Arrays.toString(arr));
    }
}
