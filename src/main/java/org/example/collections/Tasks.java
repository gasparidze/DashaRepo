package org.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tasks {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);

        Set<Integer> set = uniqueValues(list);
        System.out.println(set);
    }

    private static Set<Integer> uniqueValues(List<Integer> list){
        Set<Integer> result = new HashSet<>();
        /**
         * 1 -> 2
         * 2 -> 2
         * 4 -> 1
         * 5 -> 1
         */
        Map<Integer, Integer> digitToQuantity = new HashMap<>();
        for (Integer element : list){
            if(digitToQuantity.containsKey(element)){
                Integer quantity = digitToQuantity.get(element);
                digitToQuantity.put(element, ++quantity);
            } else {
                digitToQuantity.put(element, 1);
            }
        }

        for (Integer element : list) {
            if(digitToQuantity.get(element) > 1){
                result.add(element);
            }
        }

        return result;
    }
}
