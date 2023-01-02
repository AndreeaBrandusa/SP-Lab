package org.sp.services;

import org.sp.models.*;

public class RenderContentVisitor implements Visitor {

    @Override
    public void visitBook(Book b) {
        b.print();
    }

    @Override
    public void visitSection(Section s) {
        s.print();
    }

    @Override
    public void visitTableOfContents(TableOfContents toc) {
        toc.print();
    }

    @Override
    public void visitParagraph(Paragraph p) {
        p.print();
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
        ip.print();
    }

    @Override
    public void visitImage(Image i) {
        i.print();
    }

    @Override
    public void visitTable(Table t) {
        t.print();
    }
}
