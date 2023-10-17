package lesson3.additional;


//  Создайте массив из n случайных целых чисел и выведите его нa экран.
//  Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
//  Если n не удовлетворяет условию - выведите сообщение об этом.
//  Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//  Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userNumber;

        // Получаем число от пользователя и проверяем его
        do {
            System.out.println("Введите число от 5 до 10 -> ");
            userNumber = scanner.nextInt();
            if (userNumber < 5) {
                System.out.println("Число слишком маленькое.\n");
            } else if (userNumber > 10) {
                System.out.println("Число должно быть не менее 10.\n");
            }

        } while (userNumber < 5 || userNumber > 10);

        //   Создаем массив и выводим его на экран
        int[] arr1 = new int[userNumber];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += random.nextInt(20);
        }
        System.out.println(Arrays.toString(arr1));

        // Проверяем есть ли четные числа в первом массиве, если есть считаем их
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0 && arr1[i] != 0) {
                count += 1;
            }
        }

        // Создаем новый массив из четных чисел первого массива
        int[] arr2 = new int[count];
        int index = 0;
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] % 2 == 0 && arr1[j] != 0) {
                System.arraycopy(arr1, j, arr2, index, 1);
                index += 1;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}