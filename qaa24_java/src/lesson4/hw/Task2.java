package lesson4.hw;

//    Шахматная доска
//    Создать программу для раскраски шахматной доски с помощью цикла.
//    Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
//    циклам значения B(Black) или W(White). Результат работы программы:
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W
//        W B W B W B W B
//        B W B W B W B W

public class Task2 {
    public static void main(String[] srg) {
        String[][] chaseTable = new String[8][8];

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                // Проверяем, четный или нечетный рад
                if (row % 2 == 0) {
                    // Если четная колонка
                    if (col % 2 == 0) {
                        chaseTable[row][col] = "W";
                    } else {
                        chaseTable[row][col] = "B";
                    }
                } else {
                    // Если нечетная колонка
                    if (col % 2 == 0) {
                        chaseTable[row][col] = "B";
                    } else {
                        chaseTable[row][col] = "W";
                    }
                }
            }
        }

        for (int i = 0; i < chaseTable.length; i++) {
            for (int j = 0; j < chaseTable[i].length; j++) {
                System.out.print(" " + chaseTable[i][j]);
            }
            System.out.println();
        }
    }
}
