package org.sp.services;

import org.sp.models.*;

public class BookStatistics implements Visitor {
    private int images = 0;
    private int paragraphs = 0;
    private int tables = 0;

    @Override
    public void visitBook(Book b) {
        visitSection(b);
    }

    @Override
    public void visitSection(Section s) {
        for(Element e : s.getElements()) {
            ((Visitee)e).accept(this);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents toc) {
        tables++;
    }

    @Override
    public void visitParagraph(Paragraph p) {
        paragraphs++;
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
        images++;
    }

    @Override
    public void visitImage(Image i) {
        images++;
    }

    @Override
    public void visitTable(Table t) {
        tables++;
    }

    public void printStatistics() {
        System.out.println("Book statistics:");
        System.out.println("*** Number of images: " + images);
        System.out.println("*** Number of tables: " + tables);
        System.out.println("*** Number of paragraphs: " + paragraphs);
    }
}
