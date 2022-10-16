package org.sp;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents {
    private List<Chapter> chapters = new ArrayList<>();

    public void print(){
        for(Chapter c: chapters)
            c.print();
    }

    public int addChapter(String name) {
        Chapter ch = new Chapter(name);
        chapters.add(ch);
        return chapters.size();
    }

    public Chapter getChapter(int chIndex) {
        return chapters.get(chIndex - 1);
    }
}
