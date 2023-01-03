package org.sp.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.Dimension;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor(force = true)
public class Image extends AbstractElement implements Picture, Visitee {
    @Id
    @GeneratedValue
    private int id;

    private Dimension dimensions = new Dimension(23, 23);
    private final String url;

    @OneToOne
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
        return dimensions;
    }

    @Override
    public PictureContent content() {
        return content;
    }

    public String getUrl() {
        return url();
    }

    public Dimension getDimensions() {
        return dim();
    }

    public ImageContent getContent(){
        return (ImageContent) content();
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
