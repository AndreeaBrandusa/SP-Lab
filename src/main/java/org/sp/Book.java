package org.sp;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD

public class Book extends Section {
    private final String book;
    private Author author;

    public Book(String book) {
        super("");
=======

public class Book {
    private String book;
    private Author author;
    private TableOfContents tableOfContents = new TableOfContents();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String book) {
>>>>>>> main
        this.book = book;
    }

    public void print(){
        System.out.println(title);
        author.print();
        super.print();
    }

    public void addAuthor(Author author) {
        this.author = author;
    }
<<<<<<< HEAD

    public void addContent(Element element) {
        add(element);
=======
    
    public int createChapter(String name) {
        Chapter ch = new Chapter(name);
        chapters.add(ch);
        return chapters.size();
    }

    public Chapter getChapter(int chIndex) {
        return chapters.get(chIndex - 1);
>>>>>>> main
    }
}
