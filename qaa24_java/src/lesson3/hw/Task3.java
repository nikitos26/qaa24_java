package lesson3.hw;


//        Создайте 2 массива из 5 чисел.
//        Выведите массивы на консоль в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива и
//        сообщите, для какого из массивов это значение оказалось больше (либо
//        сообщите, что их средние арифметические равны).

import java.util.Random;

public class Task3 {
    static int avgArr1 = 0;
    static int avgArr2 = 0;

    public static void main(String[] arg) {
        Random random = new Random();
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        //  Заполняем первый массив
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(15);
        }

        //  Заполняем второй массив
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(15);
        }

        //  Узнаем среднее значение arr1
        int sumArr1 = 0;
        for (int j : arr1) {
            sumArr1 += j;
        }
        avgArr1 = sumArr1 / 5;

        //  Узнаем среднее значение arr2
        int sumArr2 = 0;
        for (int j : arr2) {
            sumArr2 += j;
        }
        avgArr2 = sumArr2 / 5;

        if (avgArr1 > avgArr2) {
            System.out.println("\nСреднее арифметическое элементов первого массива больше.");
        } else if (avgArr1 < avgArr2) {
            System.out.println("\nСреднее арифметическое элементов второго массива больше.");
        } else {
            System.out.println("\nСредние арифметические элементов обоих массивов равны.");
        }
    }
}
