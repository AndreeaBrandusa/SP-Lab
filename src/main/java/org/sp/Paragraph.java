package org.sp;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends AbstractElement {
    private final String text;
    private final List<Element> elemente = new ArrayList<>();
    private AlignStrategy alignStrategy = new AlignLeft();

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy a) {
        this.alignStrategy = a;
    }

    @Override
    public void print(){
        alignStrategy.render(this, new Context());
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
