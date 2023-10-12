package lesson_2.hw.main;

//    Для введенного числа t (температура на улице) вывести
//    Если t>–5, то вывести «Тепло».
//    Если –5>= t > –20, то вывести «Нормально».
//    Если –20>= t, то вывести «Холодно».

import java.util.Scanner;

public class HW4 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температура на улице -> ");
        int t = scanner.nextInt();

        if (t > -5) {
            System.out.print("Тепло");
        } else if (t >= -20) {
            System.out.print("Нормально");
        } else {
            System.out.print("Холодно");
        }
    }
}
