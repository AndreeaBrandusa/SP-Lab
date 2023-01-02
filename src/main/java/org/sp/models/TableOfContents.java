package org.sp.models;

public class TableOfContents extends AbstractElement implements Visitee {
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
