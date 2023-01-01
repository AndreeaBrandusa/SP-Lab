package org.sp.models;

import java.util.ArrayList;
import java.util.List;


public class Book extends Section {
    private final String book;
    private Author author;

    public Book(String book) {
        super(book);
        this.book = book;
    }

    public void print(){
        System.out.println(book);
        System.out.println("Book: " + book + "\n");
        System.out.println(book);
        author.print();
        super.print();
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public void addContent(Element element) {
        add(element);
    }

    @Override
    public void accept(Visitor v) {

    }
}
