package org.sp;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public class TableOfContents extends AbstractElement {
    private Book book;
    private final List<Element> elemente = new ArrayList<>();
=======
public class TableOfContents {
    private Book book;
>>>>>>> main

    @Override
    public void print(){
        System.out.println("Table Of Contents :)");
<<<<<<< HEAD
    }

    @Override
    public void add(Element element){
        elemente.add(element);
    }

    @Override
    public void remove(Element element){
        elemente.remove(element);
    }

    @Override
    public Element get(int elIndex){
        return elemente.get(elIndex - 1);
    }
}
