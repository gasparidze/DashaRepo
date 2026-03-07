package org.example.quick_sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuickSelectManager {
    public static void main(String[] args) {
        // DO NOT CHANGE ANYTHING IN THIS FUNCTION
//        if (args.length == 0) {
//            throw new IllegalArgumentException("CSV file path must be provided as a command-line argument");
//        }

        QuickSelectManager quickSelectManager = new QuickSelectManager();
        quickSelectManager.executeFromCSV("src/main/java/org/example/ExampleInputW4.csv");
//        quickSelectManager.executeFromCSV(args[0]);
        // Example method to call it from the .jar file: "java -jar QuickSelectManager.jar
        // ExampleInputW4.csv".

    }

    public QuickSelectManager() {

    }

    /**
     * Основной метод
     * @param A - входной массив
     * @param k - позиция для поиска (k-й наименьший элемент)
     * @return
     */
    public Integer quickSelect(int[] A, int k) {
        Integer result = null;

        if (A == null || A.length == 0 || k < 1 || k > A.length) {
            return null;
        }

        // Создаем копию исходного массива, чтобы не изменять его
        int[] arrCopy = new int[A.length];
        System.arraycopy(A, 0, arrCopy, 0, A.length);

        // вызываем рекрсивный метод
        result = quickSelectHelper(arrCopy, k - 1, 0, arrCopy.length - 1);

        return result;
    }

    /**
     * Рекурсивный вспомогательный метод
     * @param arr - исходный массив, в котором осуществляем поиск
     * @param k - индекс искомого элемента, начиная с 0
     * @param left - левая граница текущего подмассива
     * @param right - правая граница текущего подмассива
     * @return kй наименьший элемент
     */
    private Integer quickSelectHelper(int[] arr, int k, int left, int right){
        // если остался один элемент
        if (left == right) {
            return arr[left];
        }

        /**
         * разделяем массив и получаем позицию опорного элемента
         */
        int pivotIndex = partition(arr, left, right);

        // сраниваем индекс искомого элемента (k) с позицией опорного элемента
        if (k == pivotIndex) {
            // если нашли нужный элемент
            return arr[pivotIndex];
        } else if (k < pivotIndex) {
            // исходный элемент находится в левой части, то вызываем рекурсивно поиск для левой части
            return quickSelectHelper(arr, k, left, pivotIndex - 1);
        } else {
            // исходный элемент находится в правой части, то вызываем рекурсивно поиск для правой части
            return quickSelectHelper(arr, k, pivotIndex + 1, right);
        }
    }

    /**
     * Метод, разделяющий массив относительно граничных элементов
     * @param arr
     * @param left
     * @param right
     * @return индекс опорного элемента после разделения массива
     */
    private int partition(int[] arr, int left, int right){
        // выбираем опорный элемент, последний элемент в текущем подмассиве
        int rightPivot = arr[right];

        // индекс для элементов меньше опорного
        int i = left - 1;

        // проходим по всем элементам кроме опорного (не включая его)
        for (int j = left; j < right; j++) {
            // если текущий элемент меньше либо равен опорному, то меняем местами элементы
            if (arr[j] <= rightPivot){
                i++;
                swap(arr , i , j);
            }
        }

        // после всех наименьших элементов, ставим опорный элемент на правильное место
        swap(arr, i + 1, right);

        // возвращаем индекс опорного элемента
        return i + 1;
    }

    /**
     * вспомогательный метод для обмена двух элементов
     * @param arr - массив
     * @param i - 1й индекс
     * @param j - 2й инедекс
     */
    private void swap(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void executeFromCSV(String filePath) {
        // DO NOT CHANGE ANYTHING IN THIS FUNCTION
        // Example csv is available
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty())
                    continue;

                String[] tokens = line.split(",");
                String[] arrayElements = tokens[0].trim().split(";");
                String kString = tokens[1].trim().toUpperCase();

                int[] A = new int[arrayElements.length];

                for(int i=0; i<arrayElements.length; i++){
                    A[i] = Integer.parseInt(arrayElements[i]);
                }

                int k = Integer.parseInt(kString);

                Integer res = quickSelect(A, k);

                System.out.print("A: ");
                for(int e : A) {
                    System.out.print(e + ";");
                }
                System.out.println("\nk: " + k);
                System.out.println("Result: " + res);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
