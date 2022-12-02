package org.sp;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class Paragraph extends AbstractElement {
    private final String text;
    private final List<Element> elemente = new ArrayList<>();
=======
public class Paragraph implements Element {
    private String text;
>>>>>>> main

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print(){
        System.out.println("Paragraph: " + text);
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
