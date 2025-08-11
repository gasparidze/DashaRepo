package org.example;

/**
 * Основные понятия:
 * 1) инициализация чего-либо - это создание или заполнение чего-либо
 * 2) конкатенация строк - соединение строк через оператор +
 * 3) инкремент/декремент - увеличение/уменьшение на единицу
 * 4) итерация - проход в цикле, бытовое использование - какая-то попытка
 * 5) локальная переменная - это переменная, область видимости которой находится в пределах некоторого блока кода и после
 * выхода из этого блока кода, переменная уничтожается
 * в качестве блока кода может выступать: определение for, метод, статический/нестатический блок, конструктор и т д
 */
public class App {
    public static void main( String[] args ) {
        /**
         * int, long - целочисленный тип
         * float, double - вещественный тип
         * boolean - логический тип
         * String - строка
         */
        System.out.println("Hello World");

        /**
         * примеры инициализации переменных
         */
        int a = 3;
        a = 2;
        String name = "Dasha";
        var s = 12.2;

        /**
         * Операторы в if:
         * 1) == - сравнение
         * 2) >, >=, <, <= и т д
         * 3) && - логическое И (AND)
         * 4) || - логиское ИЛИ (OR)
         * 5) ! - логическое отрицание (инверсия)
         */
        if (name == "Dasha"){
            System.out.println("Dasha is here");
        } else if (name == "Artur") {
            System.out.println("Artur is gone");
        } else {
            System.out.println("Nobody is here");
        }

        /**
         * UTC (GMT) - время по гринвичу, Время по Лондону, где проходит нулевой меридиан
         * MSK -> UTC+3
         * SAM -> UTC+4
         * EKB -> UTC+5
         * VL -> UTC+12
         */

        String timezone = "MSK";

        /**
         * switch-case новый синтаксис
         */
        int delta = switch (timezone){
            case "MSK" -> 3;
            case "SAM" -> 4;
            case "EKB" -> 5;
            case "VL" -> 12;
            default -> 0;
        };

        System.out.println(delta);

        /**
         * тип данных + []
         * ключевое слово new выделяет память в оперативке под наш объект
         * кол-во элементов в массиве обязательно указываем, т.к. это нединамический массив
         */
        int[] array = new int[10];

        /**
         * 4 основных вида цикла:
         * 1) for с индексом
         * 2) foreach
         * 3) while
         * 4) do-while
         */

        /**
         * for с индексом обычно используется, если нужны индексы
         * int i = 0 - инициализация локальной переменной, которая является нашим счетчиком/индексом
         * i < array.length - это условие, которое проверяется на каждой итерации цикла
         * i++ (i = i + 1) - инкремент
         */
        System.out.println("Цикл for с индексом\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

        /**
         * как правило, индексы не нужны, поэтому чаще используется foreach
         * на каждой итерации цикла мы получаем весь элемент из массива и помещаем его в локальную переменную element
         */
        System.out.println("Цикл for\n");
        for (int element : array){
            System.out.println(element);
        }

        /**
         * в while есть только 1 условие
         */
        System.out.println("Цикл while\n");
        int i = 0;
        while (i < array.length){
            System.out.println(array[i]);
            i++;
        }

        /**
         * do-while (почти не исопльзуется)
         * разница от while лишь в том, что в do-while первая итерация (первый заход в цикл) осуществялется без условия
         */
        System.out.println("Цикл do-while\n");
        int j = 0;
        do {
            System.out.println(array[j]);
            j++;
        } while (j < array.length);
    }
}
