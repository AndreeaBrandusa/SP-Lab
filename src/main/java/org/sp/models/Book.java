package org.sp.models;


public class Book extends Section {
    private Author author;

    public Book(String bookTitle) {
        super(bookTitle);
    }

    public void print(){
        System.out.println(title);
        System.out.println("Book: " + title + "\n");
        System.out.println(title);
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
        v.visitBook(this);
    }
}
