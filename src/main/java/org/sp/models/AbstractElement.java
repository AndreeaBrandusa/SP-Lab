package org.sp.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalIdCache;

import javax.persistence.*;

@Entity
public abstract class AbstractElement implements Element {
    @Id
    @GeneratedValue
    private int id;

    @Transient
    private Element parent;

    void setParent(Element el){
        parent = el;
    }

    @Override
    @JsonIgnore
    public Element getParent(){
        return parent;
    }
}
