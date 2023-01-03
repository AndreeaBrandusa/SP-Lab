package org.sp.models;

import lombok.NoArgsConstructor;
import org.sp.services.AlignLeft;
import org.sp.services.AlignStrategy;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor(force = true)
public class Paragraph extends AbstractElement implements Visitee {
    @Id
    @GeneratedValue
    private int id;

    private final String text;

    @Transient
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
