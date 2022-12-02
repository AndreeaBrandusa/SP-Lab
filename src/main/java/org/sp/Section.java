package org.sp;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> elemente = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println(title);
        for(Element el: elemente)
            el.print();
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
