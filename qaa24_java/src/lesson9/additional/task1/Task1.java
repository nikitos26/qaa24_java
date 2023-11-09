package lesson9.additional.task1;

//        Дана строка произвольной длины с произвольными словами.
//        Найти самое короткое слово в строке и вывести его на экран.
//        Найти самое длинное слово в строке и вывести его на экран.
//        Если таких слов несколько, то вывести последнее из них.


import java.util.Scanner;

public class Task1 {
    static public void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольную строкe -> ");
        String line = scanner.nextLine();

        if (line.length() == 0 || line == null) {
            System.out.println("Вы ничего не ввели. ");
            return;

        }

        String[] words = line.trim().split("[.!?:\\s,]+");
        String shortWord = words[0];
        String longWord = words[0];

        for (String word : words) {
            if (word.length() >= longWord.length()) {
                longWord = word;
            }
            if (word.length() <= shortWord.length()) {
                shortWord = word;
            }
        }

        System.out.println("Cамое короткое слово в строке -> " + shortWord);
        System.out.println("Cамое длинное слово в строке -> " + longWord);

    }
}
