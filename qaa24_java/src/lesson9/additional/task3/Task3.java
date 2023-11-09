package lesson9.additional.task3;

//  Дана строка произвольной длины с произвольными словами.
//  Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
//  Например, есть строка, вводится число 3, значит необходимо проверить
//  является ли 3-е слово в этой строке палиндромом. Предусмотреть предупреждающие сообщения на случаи ошибочных
//  ситуаций: например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.


import java.util.Scanner;

public class Task3 {
    static public void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольную строкe -> ");
        String line = scanner.nextLine();

        System.out.println("Введите номер слова в строке -> ");
        int userNumber = scanner.nextInt();

        Helper.checkPalindrome(line, userNumber);

    }
}
