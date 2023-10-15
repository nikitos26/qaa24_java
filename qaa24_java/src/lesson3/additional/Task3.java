package lesson3.additional;


//      Создайте массив строк. Заполните его произвольными именами людей. Отсортируйте массив.
//      Результат выведите на консоль.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] arg) {
        String[] names = {"Оля", "Никита", "Варя", "Андрей", "Аня", "Саша"};
        // Сортируем массив
        Arrays.sort(names);
        // Выводим отсортированный массив на экран
        System.out.print(Arrays.toString(names));
    }
}
