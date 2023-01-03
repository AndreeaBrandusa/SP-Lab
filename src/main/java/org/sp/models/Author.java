package org.sp.models;


import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(force = true)
public class Author {
    @Id
    @GeneratedValue
    private int id;
    private final String name;
    private final String surname;

    public Author(String name) {
        String[] name_list = name.split(" ");
        this.name = name_list[0];
        this.surname = name_list[1] + " " + name_list[2];
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // get first name
    // get last name

    public void print(){
        System.out.println("Authors:");
        System.out.println("Author: " + name + " " + surname);
    }
}
