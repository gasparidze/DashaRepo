package org.example.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map - это ассоциативный массив, который хранит значения в формате: ключ=значение
 * В map все ключи должны быть уникальными, иначе если 2 ключа будут совпадать, то однозначно элемент найти не сможем
 * Ex:
 * MSK -> UTC+3
 * SAM -> UTC+4
 * VLD -> UTC+12
 */
public class MapExample {
    public static void main(String[] args) {
        /**
         * Оновные методы:
         * 1) put(key, value) - по ключу кладем значение
         * 2) get(key) - по ключу находим соответствующее значение
         * 3) keySet() - возвращает множество (Set) ключей
         * 4) values() - возвращает коллекцию значений
         * 5) entrySet() - вовзращает множество пар ключ=значение
         * 6) containsKey(key) - проверяет есть ли переданный ключ в мапе, возрвщает true/false
         *
         * Основные методы из Collection: isEmpty(), size()
         */

        Map<String, Integer> map = new HashMap<>();
        map.put("MSK", 3);
        map.put("SAM", 4);
        map.put("VLD", 12);
        System.out.println(map);

        System.out.println(map.isEmpty()); // false
        System.out.println(map.size()); // 3

        System.out.println("значение по ключу VLD: " + map.get("VLD"));

        Set<String> keySet = map.keySet();
        System.out.println("все ключи: " + keySet);

        Collection<Integer> values = map.values();
        System.out.println("все значения: " + values);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("множество пар: " + entries);

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("пара: " + entry);
            System.out.println("ключ данной пары: " + entry.getKey());
            System.out.println("значение данной пары: " + entry.getValue());
        }
    }
}
