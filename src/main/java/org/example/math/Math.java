package org.example.math;

public class Math {
    public static void main(String[] args) {
        int array[][] = new int[3][4];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ++k;
                System.out.print(array[i][j] + "      ");
            }
            System.out.println();
        }
        diagonalPrint(array);
    }

    public static void diagonalPrint(int[][] array){
        int rows = array.length; // 3
        int cols = array[0].length; // 4

        // печатаем диагонали, начинающиеся в первом столбце
        for (int row = 0; row < rows; row++) {
            int i = row;
            int j = 0; // фиксируем столбец
            while (i >= 0 && j < cols){
                System.out.print(array[i][j]);
                System.out.print("  -  ");
                /**
                 * уменьшим строку и увеличиваем диагональ
                 */
                i--;
                j++;
            }
        }

        for (int col = 1; col < cols; col++){
            int i = rows - 1;
            int j = col;

            while (i >= 0 && j < cols){
                System.out.print(array[i][j]);
                System.out.print("  -  ");
                /**
                 * уменьшим строку и увеличиваем диагональ
                 */
                i--;
                j++;
            }
        }
    }
}
