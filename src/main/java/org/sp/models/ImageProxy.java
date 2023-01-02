package org.sp.models;

import java.awt.Dimension;

public class ImageProxy extends AbstractElement implements Picture, Visitee {
    private final String url;
    private Dimension dim;
    private Image realImg;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage(){
        if(realImg == null){
            this.realImg = new Image(url);
        }

        return realImg;
    }

    @Override
    public void print() {
        loadImage().print();
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
    public String url() {
        return loadImage().url();
    }

    @Override
    public Dimension dim() {
        return realImg.dim();
    }

    @Override
    public PictureContent content() {
        return loadImage().content();
    }

    @Override
    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }
}
