package lesson9.additional.task4;

//  Дана произвольная строка.
//  Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
//  Например, "Hello" -> "HHeelllloo"

import java.util.Scanner;

public class Task4 {
    static public void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольную строкe -> ");
        String line = scanner.nextLine();

        Helper.printModifiedLine(line);

    }
}
