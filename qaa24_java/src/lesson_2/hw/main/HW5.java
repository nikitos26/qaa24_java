package lesson_2.hw.main;


import java.util.Scanner;

// По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.)

public class HW5 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер цвета радуги -> ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.print("Цвет радуги -> красный");
                break;
            case 2:
                System.out.print("Цвет радуги -> оранжевый");
                break;
            case 3:
                System.out.print("Цвет радуги -> желтый");
                break;
            case 4:
                System.out.print("Цвет радуги -> зеленый");
                break;
            case 5:
                System.out.print("Цвет радуги -> голубой");
                break;
            case 6:
                System.out.print("Цвет радуги -> синий");
                break;
            case 7:
                System.out.print("Цвет радуги -> фиолетовый");
                break;
            default:
                System.out.print("Некорректный номер цвета!");
                break;
        }
    }
}
