package org.sp.services;

import org.sp.models.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONSaveVisitor implements Visitor {
    JSONArray currentNode = new JSONArray();
    final JSONArray root = currentNode;

    @Override
    public void visitBook(Book b) {
        JSONObject o = new JSONObject();
        o.put("type", Book.class.toString());
        o.put("title", b.getTitle());

        currentNode.put(o);
    }

    @Override
    public void visitSection(Section s) {
        JSONObject o = new JSONObject();
        currentNode.put(o);

        o.put("type", Section.class.toString());
        o.put("title", s.getTitle());

        JSONArray children = new JSONArray();
        o.put("children", children);

        for(Element e : s.getElements()) {
            this.currentNode = children;
            ((Visitee)e).accept(this);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents toc) {
        JSONObject o = new JSONObject();
        o.put("type", TableOfContents.class.toString());
        o.put("content", toc.getContent());

        currentNode.put(o);
    }

    @Override
    public void visitParagraph(Paragraph p) {
        JSONObject o = new JSONObject();
        o.put("type", Paragraph.class.toString());
        o.put("text", p.getText());

        currentNode.put(o);
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
        JSONObject o = new JSONObject();
        o.put("type", ImageProxy.class.toString());
        o.put("url", ip.url());
        o.put("dimensions", ip.dim().toString());
        o.put("content", ip.content().toString());

        currentNode.put(o);
    }

    @Override
    public void visitImage(Image i) {
        JSONObject o = new JSONObject();
        o.put("type", Image.class.toString());
        o.put("url", i.url());
        o.put("content", i.content().toString());

        currentNode.put(o);
    }

    @Override
    public void visitTable(Table t) {
        JSONObject o = new JSONObject();
        o.put("type", Table.class.toString());
        o.put("title", t.getTitle());
        o.put("content", t.getContent());

        currentNode.put(o);
    }

    public JSONObject getResult() {
        return root.length() > 0 ? root.getJSONObject(0) : new JSONObject();
    }
}
