package ro.uvt.models;

import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Element> elements = new ArrayList<>();

    public void print() {
        System.out.println("\t\tSubchapter: " + name);

        for( Element element: elements ) {
            element.print();
        }
    }

    public SubChapter(String name) {
        this.name = name;
    }


}
