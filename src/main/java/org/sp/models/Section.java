package org.sp.models;

import java.util.ArrayList;
import java.util.List;

public class Section extends AbstractElement implements Visitee {
    protected final String title;
    private final List<Element> elemente = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Element> getElements() {
        return elemente;
    }

    @Override
    public void print(){
        System.out.println(title);
        for(Element el: elemente)
            el.print();
    }

    @Override
    public void add(Element element) {
        AbstractElement abstractElement = (AbstractElement) element;
        if (abstractElement.getParent() != null || abstractElement == this
        ) {
            throw new UnsupportedOperationException();
        }

        elemente.add(element);
        abstractElement.setParent(this);
    }

    @Override
    public void remove(Element element){
        elemente.remove(element);
    }

    @Override
    public Element get(int elIndex){
        return elemente.get(elIndex);
    }

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
    }
}
