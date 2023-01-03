package org.sp.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor(force = true)
public class Section extends AbstractElement implements Visitee {
    @Id
    @GeneratedValue
    private int id;

    protected String title;

    @OneToMany(targetEntity = AbstractElement.class)
    private List<AbstractElement> elemente = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<AbstractElement> getElements() {
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
        if (abstractElement.getParent() != null || abstractElement == this) {
            throw new UnsupportedOperationException();
        }

        elemente.add(abstractElement);
        abstractElement.setParent(this);
    }

    @Override
    public void remove(Element element){
        elemente.remove((AbstractElement)element);
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
