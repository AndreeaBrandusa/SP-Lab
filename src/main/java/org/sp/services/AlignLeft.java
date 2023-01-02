package org.sp.services;

import org.sp.models.Context;
import org.sp.models.Paragraph;

public class AlignLeft implements AlignStrategy {

    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("Paragraph: " + p.getText());
    }
}
