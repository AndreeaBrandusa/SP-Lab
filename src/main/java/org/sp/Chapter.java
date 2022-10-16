package org.sp;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String chapter;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.chapter = name;
    }

    public void print(){
        System.out.println(chapter);

        for(SubChapter s: subChapters)
            s.print();
    }

    public int createSubChapter(String name) {
        SubChapter subCh = new SubChapter(name);
        subChapters.add(subCh);

        return subChapters.size();
    }

    public SubChapter getSubChapter(int subChIndex) {
        return subChapters.get(subChIndex - 1);
    }
}
