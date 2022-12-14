package org.sp.models;

public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int elIndex);
    Element getParent();
}
