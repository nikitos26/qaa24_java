package lesson_2.hw.main;

//  Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до
//  введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner.

import java.util.Scanner;

public class HW10 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите любое целое положительное числ -> ");
        int number = scanner.nextInt();
        int sum = 0;

        if (number == 0) {
            System.out.print("Вы ввели неположительное число.");
        } else{
            for (; number>=1; number--){
                sum += number;
            }
            System.out.print("\nCумма чисел -> " + sum);
        }

    }
}
