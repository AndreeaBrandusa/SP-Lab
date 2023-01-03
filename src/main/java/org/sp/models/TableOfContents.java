package org.sp.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor(force = true)
public class TableOfContents extends AbstractElement implements Visitee {
    @Id
    @GeneratedValue
    private int id;

    private String content;

    public TableOfContents(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void print(){
        System.out.println("Table Of Contents :)");
        System.out.println(content);
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
        v.visitTableOfContents(this);
    }
}
