package org.sp.models;

import javax.persistence.*;
import java.awt.Dimension;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ImageProxy extends AbstractElement implements Picture, Visitee {
    @Id
    @GeneratedValue
    private int id;

    private final String url;
    private Dimension dimensions;
    private ImageContent imageContent;

    @Transient
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

    public String getUrl() {
        return url();
    }

    public Dimension getDimensions() {
        return dim();
    }

    public ImageContent getContent() {
        return (ImageContent) content();
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
        return loadImage().getContent();
    }

    @Override
    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }
}
