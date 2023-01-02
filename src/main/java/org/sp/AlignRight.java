package org.sp;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("\t\tParagraph: " + p.getText());
    }
}
