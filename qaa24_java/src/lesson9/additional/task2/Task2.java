package lesson9.additional.task2;

//        Дана строка произвольной длины с произвольными словами.
//        Найти слово, в котором число различных символов минимально. Слово
//        может содержать буквы и цифры. Если таких слов несколько, найти первое
//        из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно
//        быть "fffff".


import java.util.Scanner;

public class Task2 {
    static public void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольную строкe -> ");
        String line = scanner.nextLine();

        Helper.uniqueWord(line);
    }

}
