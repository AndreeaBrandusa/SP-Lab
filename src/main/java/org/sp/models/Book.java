package org.sp.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor(force = true)
public class Book extends Section {
    @ManyToMany
    private final List<Author> authors = new ArrayList<>();

    public Book(String bookTitle) {
        super(bookTitle);
    }

    public void print(){
        System.out.println(title);
        System.out.println("Book: " + title + "\n");
        System.out.println(title);
        authors.forEach(Author::print);
        super.print();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        add(element);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);
    }
}
