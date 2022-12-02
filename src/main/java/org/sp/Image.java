package org.sp;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
public class Image implements Element {
    private String imageName;
>>>>>>> main

public class Image implements Element {
    private String url;
    private List<Element> elemente = new ArrayList<>();

    public Image(String url) {
        this.url = url;
    }

    public void print(){
        System.out.println("Image with name: " + url);
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
