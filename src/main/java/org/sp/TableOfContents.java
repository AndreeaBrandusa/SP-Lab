package org.sp;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents extends AbstractElement {
    private Book book;
    private final List<Element> elemente = new ArrayList<>();

    @Override
    public void print(){
        System.out.println("Table Of Contents :)");
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
