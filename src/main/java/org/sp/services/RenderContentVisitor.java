package org.sp.services;

import org.sp.models.*;

import java.util.List;

public class RenderContentVisitor implements Visitor {
    List<Element> contents;
    Element content;

    @Override
    public void visitBook(Book x) {
        this.contents = x.getChildren();
    }

    @Override
    public void visitSection(Section x) {
        this.contents = x.getChildren();
    }

    @Override
    public void visitTableOfContents(TableOfContents x) {
        this.content = x;
    }

    @Override
    public void visitParagraph(Paragraph x) {
        this.content = x;
    }

    @Override
    public void visitImageProxy(ImageProxy x) {
        this.content = x;
    }

    @Override
    public void visitImage(Image x) {
        this.content = x;
    }

    @Override
    public void visitTable(Table x) {
        this.content = x;
    }
}
