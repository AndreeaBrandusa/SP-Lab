package org.sp.models;

import org.sp.services.AlignLeft;
import org.sp.services.AlignStrategy;

public class Paragraph extends AbstractElement implements Visitee {
    private final String text;
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
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int elIndex){
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }
}
