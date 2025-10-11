package org.example.math;

public class Math {
    public static void main(String[] args) {
        int array[][] = new int[4][4];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ++k;
                System.out.print(array[i][j] + "      ");
            }
            System.out.println();
        }
        spiralPrint(array);
    }

    public static void spiralPrint(int[][] array){
        int top = 0, bottom = array.length - 1;
        int left = 0, right = array[0].length - 1;

        while (top <= bottom && left <= right) {
            // Верхняя строка слева направо
            for (int j = left; j <= right; j++) {
                System.out.print(array[top][j] + " ");
            }
            top++;

            // Правый столбец сверху вниз
            for (int i = top; i <= bottom; i++) {
                System.out.print(array[i][right] + " ");
            }
            right--;

            // Нижняя строка справа налево
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(array[bottom][j] + " ");
                }
                bottom--;
            }

            // Левый столбец снизу вверх
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(array[i][left] + " ");
                }
                left++;
            }
        }
    }
}
