package org.sp;

public class AlignLeft implements AlignStrategy {

    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("Paragraph: " + p.getText());
    }
}
