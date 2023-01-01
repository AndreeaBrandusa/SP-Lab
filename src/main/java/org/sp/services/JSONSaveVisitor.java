package org.sp.services;

import org.example.models.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONSaveVisitor implements Visitor {
    JSONArray currentNode = new JSONArray();

    final JSONArray root = currentNode;

    @Override
    public void visitBook(Book x) {
        JSONObject o = new JSONObject();
        o.put("type", Book.class.toString());
        o.put("title", x.getTitle());

        currentNode.put(o);
    }

    @Override
    public void visitSection(Section x) {
        JSONObject o = new JSONObject();
        currentNode.put(o);

        o.put("type", Section.class.toString());
        o.put("title", x.getTitle());

        JSONArray children = new JSONArray();
        o.put("chidren", children);

        for(Element e : x.getChildren()) {
            this.currentNode = children;
            ((Visitee)e).accept(this);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents x) {
        JSONObject o = new JSONObject();
        o.put("type", TableOfContents.class.toString());
        o.put("content", x.getContent());

        currentNode.put(o);
    }

    @Override
    public void visitParagraph(Paragraph x) {
        JSONObject o = new JSONObject();
        o.put("type", Paragraph.class.toString());
        o.put("text", x.getText());

        currentNode.put(o);
    }

    @Override
    public void visitImageProxy(ImageProxy x) {
        JSONObject o = new JSONObject();
        o.put("type", ImageProxy.class.toString());
        o.put("url", x.url());
        o.put("dimensions", x.dim().toString());
        o.put("content", x.content().toString());

        currentNode.put(o);
    }

    @Override
    public void visitImage(Image x) {
        JSONObject o = new JSONObject();
        o.put("type", Image.class.toString());
        o.put("url", x.getUrl());
        o.put("extension", x.getExtension());
        o.put("content", x.content());

        currentNode.put(o);
    }

    @Override
    public void visitTable(Table x) {
        JSONObject o = new JSONObject();
        o.put("type", Table.class.toString());
        o.put("content", x.getContent());

        currentNode.put(o);
    }

    public JSONObject getResult() {
        return root.length() > 0 ? root.getJSONObject(0) : new JSONObject();
    }
}
