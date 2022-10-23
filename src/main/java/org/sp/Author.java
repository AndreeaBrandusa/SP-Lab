package org.sp;

public class Author {
    private String name;
    private String surname;

    public Author(String name) {
        String[] name_list = name.split(" ");
        this.name = name_list[0];
        this.surname = name_list[1] + " " + name_list[2];
    }

    public void print(){
        System.out.println("Authors:");
        System.out.println("Author: " + name + " " + surname);
    }
}
