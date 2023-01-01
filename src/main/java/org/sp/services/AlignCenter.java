package org.sp.services;


import org.sp.models.Context;
import org.sp.models.Paragraph;

public class AlignCenter implements AlignStrategy {

    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("\tParagraph: " + p.getText());
    }
}
