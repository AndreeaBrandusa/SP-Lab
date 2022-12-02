package org.sp;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> main
public class Table implements Element {
    private String title;
    private List<Element> elemente = new ArrayList<>();

    public Table(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println("\t\t" + title);
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
