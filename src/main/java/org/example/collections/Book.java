package org.example.collections;

public class Book implements Comparable<Book>{
    private String name;
    private String author;
    private int publishYear;

    public Book(String name, String author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    @Override
    public int compareTo(Book o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }
}
