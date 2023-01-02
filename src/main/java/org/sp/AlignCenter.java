package org.sp;

public class AlignCenter implements AlignStrategy {

    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("\tParagraph: " + p.getText());
    }
}
