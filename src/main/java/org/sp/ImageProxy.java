package org.sp;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ImageProxy extends AbstractElement implements Picture {
    private final String url;
    private Dimension dim;
    private Image realImg;
    private final List<Element> elemente = new ArrayList<>();

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
        if(realImg == null) {
            loadImage();
        }

        realImg.print();
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

    @Override
    public String url() {
        if(realImg == null) {
            loadImage();
        }

        return realImg.url();
    }

    @Override
    public Dimension dim() {
        if(realImg == null) {
            loadImage();
        }

        return realImg.dim();
    }

    @Override
    public PictureContent content() {
        if(realImg == null) {
            loadImage();
        }

        return realImg.content();
    }
}
