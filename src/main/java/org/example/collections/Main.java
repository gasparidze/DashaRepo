package org.example.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Map<String, Set<Book>> books = new LinkedHashMap<>();

        Book book1 = new Book("A", "author1", 2009);
        Book book2 = new Book("B", "author2", 2024);
        Book book3 = new Book("C", "author3", 1999);
        Book book4 = new Book("D", "author1", 2009);
        Book book5 = new Book("E", "author2", 2024);
        Book book6 = new Book("F", "author3", 1999);
        Book book7 = new Book("G", "author1", 2019);
        Book book8 = new Book("K", "author2", 2024);
        Book book9 = new Book("L", "author3", 1939);

        Set<Book> set = new HashSet<>();
        set.add(book3);
        set.add(book1);
        set.add(book2);


        Set<Book> set2 = new HashSet<>();
        set2.add(book5);


        Set<Book> set3 = new HashSet<>();
        set3.add(book7);
        set3.add(book8);

        books.put("horror",set);
        books.put("action", set2);
        books.put("adv", set3);

        Map<String, Integer> rate = new TreeMap<>();
        rate.put("horror", set.size());


        for(String s: books.keySet()){
            System.out.println(s + " " + books.get(s));
        }

//        set.addAll(set2);

        Set<Book> bookSet = new TreeSet<>(set);

        System.out.println(bookSet);

        System.out.println("=========================");
        Map<String, Integer> categoryStatistics = new HashMap<>();
        for (String category : books.keySet()){
            categoryStatistics.put(category, books.get(category).size());
        }

        Map<String, Integer> categoryRating = new TreeMap<>(new ComparatorEx(categoryStatistics));
        categoryRating.putAll(categoryStatistics);
        System.out.println("categoryRating: \n" + categoryRating);
    }
}