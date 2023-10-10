package lesson_2.hw.main;

// Вывести 10 первых чисел последовательности 0, -5,-10,-15

public class HW12 {
    public static void main(String[] arg) {
        int start = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + start);
            start -= 5;
        }
    }
}
