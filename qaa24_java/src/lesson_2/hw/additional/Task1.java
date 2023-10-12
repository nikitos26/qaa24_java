package lesson_2.hw.additional;


// Выведите на экран первые 11 членов последовательности Фибоначчи.
public class Task1 {
    public static void main(String[] arg) {
        System.out.print("Первые 11 членов последовательности Фибоначчи: ");
        int a = 0;
        int b = 1;

        for (int i = 0; i < 11; i++) {
            System.out.print(a + " ");
            int nextNumber = a + b;
            a = b;
            b = nextNumber;
        }

    }
}
