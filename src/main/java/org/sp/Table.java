package org.sp;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class Table extends AbstractElement {
    private final String title;
    private final List<Element> elemente = new ArrayList<>();
=======
public class Table implements Element {
    private String title;
>>>>>>> main

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println("\t\t" + title);
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
