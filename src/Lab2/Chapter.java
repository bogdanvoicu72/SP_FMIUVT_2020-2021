package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private String name;
    private List<SubChapter> subChapters = new ArrayList<SubChapter>();

    public Chapter(String name , List<SubChapter> subChapters){

        this.name = name;
        this.subChapters = subChapters;
    }


    public int createSubChapter(String sCh){
        SubChapter subcH = new SubChapter(sCh);
        subChapters.add(sCh);
        return subChapters.indexOf(subcH);

    }
    public SubChapter getSubChapter(int indexOfSubchapter) {
        return subChapters.get(indexOfSubchapter);
    }
    public void print(){
        System.out.println("The chapter is "+ this.name);
    }
}
