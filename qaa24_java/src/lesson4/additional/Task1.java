package lesson4.additional;

//      Умножение двух матриц
//      Создайте два массива целых чисел размером 3х3 (две матрицы).
//      Напишите программу для умножения двух матриц.
//      Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
//      Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
//      Ожидаемый результат: 1 2 3 1 1 1 0 0 0


import java.util.Arrays;

public class Task1 {
    public static void main(String[] arg) {
        int[][] arr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};


        int rowsFirst = arr1.length;
        int colsFirst = arr1[0].length;
        int colsSecond = arr2[0].length;

        int[][] result = new int[rowsFirst][colsSecond];

        for (int i = 0; i < rowsFirst; i++) {
            for (int j = 0; j < colsSecond; j++) {
                for (int k = 0; k < colsFirst; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(result));

    }


}
