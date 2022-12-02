package org.sp;

import java.util.ArrayList;
import java.util.List;


public class Book extends Section {{
    private String book;
    private Author author;
    private TableOfContents tableOfContents = new TableOfContents();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String book) {
        this.book = book;
    }

    public void print(){
        System.out.println(title);
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
    
    public int createChapter(String name) {
        Chapter ch = new Chapter(name);
        chapters.add(ch);
        return chapters.size();
    }

    public Chapter getChapter(int chIndex) {
        return chapters.get(chIndex - 1);
    }
}
