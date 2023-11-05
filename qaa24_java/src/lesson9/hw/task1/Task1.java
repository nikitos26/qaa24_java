package lesson9.hw.task1;

//  Написать программу со следующим функционалом:
//  На вход передать строку (будем считать, что это номер документа).
//  Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy,
//  где x — это число, а y — это буква.
//    - Вывести на экран в одну строку два первых блока по 4 цифры.
//    - Вывести на экран номер документа, но блоки из трех букв заменить
//  на *** (каждая буква заменятся на *).
//    - Вывести на экран только одни буквы из номера документа в
//  формате yyy/yyy/y/y в нижнем регистре.
//    - Вывести на экран буквы из номера документа в формате
//  "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
//    - Проверить содержит ли номер документа последовательность abc и
//  вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
//    - Проверить начинается ли номер документа с последовательности 555.
//    - Проверить заканчивается ли номер документа на последовательность 1a2b.
//  Все эти методы реализовать в отдельном классе в статических методах,
//  которые на вход (входным параметром) будут принимать вводимую на вход программы строку.


import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер документа в формате xxxx-yyy-xxxx-yyy-xyxy," +
                "где x — это число, а y — это буква-> ");
        String docNumber = scanner.nextLine();


        docHelper.validateDocNumberFormat(docNumber);
        docHelper.printNumbersFromBlocks(docNumber);
        docHelper.replaceChars(docNumber);
        docHelper.printLettersInFormatLowerCase(docNumber);
        docHelper.printLettersInFormatUpperCase(docNumber);
        docHelper.valueContains(docNumber, "abc");
        docHelper.checkStart(docNumber);
        docHelper.checkEnd(docNumber);
    }

}
