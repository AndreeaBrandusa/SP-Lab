package org.sp;

import org.sp.models.*;
import org.sp.services.BookStatistics;
import org.sp.services.JSONSaveVisitor;

public class Lab6_7 {
    public static void main(String[] args) {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));

        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();

        JSONSaveVisitor jsonSave = new JSONSaveVisitor();
        cap1.accept(jsonSave);
        System.out.println(jsonSave.getResult());
    }
}
