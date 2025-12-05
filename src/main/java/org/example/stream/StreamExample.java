package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream API - это некий набор методов для работы с коллекциями
 * Суть stream api заключается в том, что мы исходную коллекцию преобразуем в поток,
 * совершаем над этим потоком данных какие-либо операции, а затем этот поток можем перевести в какую-н другую коллекцию
 * или просто в значение
 *
 * Существует 2 вида методов stream api:
 * 1) intermediate - промежуточные методы, возвращающие поток
 * 2) terminal - звершающие методы, возвращающие отличные от потока значения
 *
 * Правила:
 * 1) если нет terminal метода, то ни один intermediate метод не будет вызван
 * 2) методы stream api не модифицируют саму коллекцию, на которой они были вызваны, изменения производятся непосредственно над потоком
 */
public class StreamExample {
    /**
     * Основные методы stream api:
     * 1) filter - фильтрует данные
     * 2) map - преобрзаует данные
     * 3) collect - преобразует в какую-либо коллекцию
     * 4) forEach - пробегается в цикле
     * 5) peek - проводит какие-то промежуточные действия, не изменяя сам поток
     * 6) flatMap - разворачивает вложенный лист
     *
     * Неосновные, небольшие методы:
     * 1) max/min
     * 2) sorted
     * 3) findFirst/findAny
     * 4) distinct/count/limit
     */
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("World");
//        list.add("From Russia");
//
//        List<String> newList = list.stream().map(el -> el.toUpperCase()).collect(Collectors.toList());
//
//        System.out.println(list);
//        System.out.println(newList);
//
//        System.out.println("peek");
//        List<String> collect = newList.stream().peek(System.out::println).map(el -> el.toUpperCase()).collect(Collectors.toList());
//
//        Optional<String> first = newList.stream().map(el -> el.toUpperCase()).findFirst();
//        Optional<String> any = newList.stream().map(el -> el.toUpperCase()).findAny();
//        long count = newList.stream().count();
//
//        /**
//         * method chaining
//         */
//        Set<String> set = list.stream()
//                .filter(el -> el.contains("World"))
//                .map(el -> el.toUpperCase())
//                .collect(Collectors.toSet());
//        System.out.println(set);
//
//        Student student1 = new Student("Alice", 4);
//        Student student2 = new Student("Bob", 2);
//        Student student3 = new Student("Marvin", 5);
//        Student student4 = new Student("Kate", 5);
//        Student student5 = new Student("Masha", 3);
//        Student student6 = new Student("Dasha", 4);
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//        studentList.add(student5);
//        studentList.add(student6);
//
//        Faculty math = new Faculty("math", List.of(student1, student2));
//        Faculty literature = new Faculty("literature", List.of(student3, student4));
//        Faculty sport = new Faculty("sport", List.of(student5, student6));
//        List<Faculty> faculties = new ArrayList<>();
//        faculties.add(math);
//        faculties.add(literature);
//        faculties.add(sport);
//
//        faculties.stream().forEach(System.out::println);
//
//        /**
//         * Вывести всех студентов всех факультетов, вот здесь приходит на помощь метод flatMap
//         *
//         */
//        faculties.stream()
//                .map(el -> el.getStudents())
//                .forEach(System.out::println);
//
//        faculties.stream()
//                .flatMap(el -> el.getStudents().stream())
//                .map(el -> el.getName().toUpperCase())
//                .forEach(System.out::println);
//
//        faculties.stream().forEach(el -> el.getStudents().stream()
//                .forEach(student -> System.out.println(student)));
//
//        List<Student> allStudents = faculties.stream()
//                .flatMap(t -> t.getStudents().stream())
//                .collect(Collectors.toList());
//
//        List<List<Student>> allStudents1 = faculties.stream()
//                .map(Faculty::getStudents)
//                .collect(Collectors.toList());
//
//        int[] numbers = {1, 2, 3};
//        /**
//         * Arrays.stream(numbers) - это IntStream, а не Stream<Integer>,
//         * для преобразования в Stream<Integer> используем boxed()
//         */
//        Stream<Integer> stream = Arrays.stream(numbers).boxed();

        Student student1 = new Student("Alice", 4);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Marvin", 5);
        Student student4 = new Student("Kate", 5);
        Student student5 = new Student("Masha", 3);
        Student student6 = new Student("Dasha", 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        Faculty math = new Faculty("math", List.of(student1, student2));
        Faculty literature = new Faculty("literature", List.of(student3, student4));
        Faculty sport = new Faculty("sport", List.of(student5, student6));
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(math);
        faculties.add(literature);
        faculties.add(sport);

        System.out.println(studentList);
        List<Student> test = studentList.stream().peek(student -> student.setName("test")).collect(Collectors.toList());
        System.out.println(test);
        System.out.println(studentList);
        Optional<Student> any = studentList.stream().findAny();
        System.out.println(any);

        String collect = studentList.stream()
                .map(el -> el.getName())
                .collect(Collectors.joining(", ", "(", ")"));
        System.out.println(collect);

        Long count = studentList.stream().collect(Collectors.counting());
        System.out.println(count);

        Map<Integer, List<Student>> studentsByAverageScore = studentList.stream()
                .collect(Collectors.groupingBy(Student::getAverageScore));
        System.out.println(studentsByAverageScore);

        Map<Integer, Long> grouping = studentList.stream()
                .collect(Collectors.groupingBy(Student::getAverageScore , Collectors.counting()));
        System.out.println(grouping);

        Map<String, Double> average = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName , Collectors.averagingInt(Student::getAverageScore)));
        System.out.println(average);

        Map<Integer, String> groupByName = studentList.stream()
                .collect(
                        Collectors.groupingBy(Student::getAverageScore ,
                        Collectors.mapping(Student::getName , Collectors.joining(", ")))
                );
        System.out.println(groupByName);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean result = numbers.stream().noneMatch(el -> el == 2);
        System.out.println(result);
    }
}
