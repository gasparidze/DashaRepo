package org.example.collections;

import java.util.Comparator;
import java.util.Map;

public class ComparatorEx implements Comparator<String> {
    private Map<String, Integer> category;

    public ComparatorEx(Map<String, Integer> category) {
        this.category = category;
    }

    @Override
    public int compare(String category1 , String category2) {
        return category.get(category2).compareTo(category.get(category1));
    }
}
