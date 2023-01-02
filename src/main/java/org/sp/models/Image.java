package org.sp.models;

import java.awt.Dimension;

public class Image extends AbstractElement implements Picture, Visitee {
    private final String url;
    private final ImageContent content;

    public Image(String name) {
        this.url = name;
        this.content = new ImageContent();
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return new Dimension(23, 23);
    }

    public ImageContent content(){
        return content;
    }

    @Override
    public void print(){
        System.out.println("Image with name: " + url);
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
        v.visitImage(this);
    }
}
