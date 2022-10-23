package org.sp;

import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String subChapterName;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Image> images = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();
    private List<Element> elements = new ArrayList<>();

    public SubChapter(String name) {
        this.subChapterName = name;
    }

    public void print(){
        System.out.println("\t" + subChapterName);

        for(Paragraph p: paragraphs)
            p.print();

        for(Image i: images)
            i.print();

        for(Table t: tables)
            t.print();
    }

    public void createElement(String name, String type){
        if(type == "paragraphs")
            createNewParagraph(name);
        if(type == "images")
            createNewImage(name);
        if(type == "tables")
            createNewTable(name);
    }

    public void createNewParagraph(String name){
        Paragraph p = new Paragraph(name);
        paragraphs.add(p);
    }

    public void createNewImage(String name){
        Image img = new Image(name);
        images.add(img);
    }

    public void createNewTable(String name){
        Table t = new Table(name);
        tables.add(t);
    }
}
