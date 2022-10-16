package org.sp;

public class Book {
    private String title;
    private Author author;
    private TableOfContents tableOfContents = new TableOfContents();

    public Book(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println(title);
        author.print();
        tableOfContents.print();
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String name) {
        return tableOfContents.addChapter(name);
    }

    public Chapter getChapter(int chIndex) {
        return tableOfContents.getChapter(chIndex);
    }
}
