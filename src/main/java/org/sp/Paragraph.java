package org.sp;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> main
public class Paragraph implements Element {
    private String text;
    private List<Element> elemente = new ArrayList<>();

    public Paragraph(String text) {
        this.text = text;
    }

    public void print(){
        System.out.println("Paragraph: " + text);
    }

    public void add(Element element){
        elemente.add(element);
    }

    public void remove(Element element){
        elemente.remove(element);
    }

    public Element get(int elIndex){
        return elemente.get(elIndex - 1);
    }
}
