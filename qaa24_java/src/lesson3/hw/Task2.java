package lesson3.hw;

//   Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
//   Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
//   В результате должен быть новый массив без указанного числа.


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] arg) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }


        System.out.println(Arrays.toString(numbers));
        System.out.println("Введите любое число -> ");
        int userNumber = scanner.nextInt();

        // Считаем, сколько раз встречается число для удаления в массиве

        boolean found = false;
        int count = 0;
        for (int number : numbers) {
            if (number == userNumber) {
                count++;
                found = true;
            }
        }
        if (found) {
            int[] newNumbers = new int[numbers.length - count];
            for (int number : numbers) {
                if (number != userNumber) {
                    newNumbers[index] = number;
                    index++;
                }
            }
            System.out.println(Arrays.toString(newNumbers));
        }
    }
}
