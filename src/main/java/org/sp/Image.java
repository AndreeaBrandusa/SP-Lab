package org.sp;

<<<<<<< HEAD
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
=======
public class Image implements Element {
    private String imageName;
>>>>>>> main

public class Image extends AbstractElement implements Picture {
    private final String url;
    private final ImageContent content;
    private final List<Element> elemente = new ArrayList<>();

    Image(String name) {
        this.url = name;
        this.content = new ImageContent();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    public ImageContent content(){
        return content;
    }

    @Override
    public void print(){
        System.out.println("Image with name: " + url);
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
}
