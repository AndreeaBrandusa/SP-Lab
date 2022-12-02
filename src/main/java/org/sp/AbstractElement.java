package org.sp;

public abstract class AbstractElement implements Element{
    Element parent;

    void setParent(Element el){
        parent = el;
    }

    @Override
    public Element getParent(){
        return parent;
    }
}
