package org.sp;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private final String book;
    private Author author;

    public Book(String book) {
        super("");
        this.book = book;
    }

    public void print(){
        System.out.println("Book: " + book + "\n");
        author.print();
        super.print();
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public void addContent(Element element) {
        add(element);
    }
}
