package org.example.equals_example;

public class Main {
    public static void main(String[] args) {
        /**
         * выведится true из-за String pool (кешируется)
         */
        String hello = "hello";
        String hello1 ="hello";
        System.out.println(hello == hello1);

        LuxuryAuto ferrariGTO = new LuxuryAuto("Ferrari GTO", 1963, 700000);
        LuxuryAuto ferrariSpider = new LuxuryAuto("Ferrari Spider", 1963, 700000);

        System.out.println("ferrariGTO: " + ferrariGTO);
        System.out.println("ferrariSpider: " + ferrariSpider);

        /**
         * знак двойного равно (obj1 == obj2) - проверяет именно ссылки объектов
         * а equals как раз-таки нужен для того, чтобы сравнивать объекты логически (по полям), а не по адресу
         *
         * Важно: при переопределении equals() и hashCode() правильно будет использовать одни и те же поля
         */
        System.out.println(ferrariGTO == ferrariSpider);
        System.out.println("equals: " + ferrariGTO.equals(ferrariSpider));

        System.out.println("ferrariGTO hash: " + ferrariGTO.hashCode());
        System.out.println("ferrariSpider hash: " + ferrariSpider.hashCode());
    }
}
