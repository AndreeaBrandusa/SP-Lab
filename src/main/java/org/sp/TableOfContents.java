package org.sp;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public class TableOfContents implements Element {
    private Book book;
    private List<Element> elemente = new ArrayList<>();

    public void print(){
        System.out.println("Table Of Contents :)");
    }

    public int addChapter(String name) {
        Chapter ch = new Chapter(name);
        chapters.add(ch);
        return chapters.size();
    }

    public Chapter getChapter(int chIndex) {
        return chapters.get(chIndex - 1);
    }
}
