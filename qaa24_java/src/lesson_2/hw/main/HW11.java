package lesson_2.hw.main;

//  Необходимо, чтоб программа выводила на экран вот такую последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//  В решении используйте цикл while.

public class HW11 {
    public static void main (String[] arg){
        int i = 7;
        while (i<=98){
            System.out.print(" " + i);
            i += 7;
        }
    }
}
