package org.sp.models;

public class Table extends AbstractElement implements Visitee {
    private final String title;
    private String content;

    public Table(String title) {
        this.title = title;
        this.content = "";
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void print(){
        System.out.println("\t\t" + title);
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
        v.visitTable(this);
    }
}
