package Lab2;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elements = new ArrayList<>();

    public SubChapter(String name, List<Element> elements){
        this.name = name;
        this.elements = elements;
    }

    public void createNewParagraph(String namePara){
        Paragraph p = new Paragraph(namePara);
        elements.add(p);

    }
    public void createNewTable(String nameTable){
        Table t = new Table(nameTable);
        elements.add(t);
    }
    public void createNewImage(String nameImg){
        Image i = new Image(nameImg);
        elements.add(i);
    }

    public void print(){
        System.out.println(this.name);
        for(Element element: elements){
            element.print();
        }
    }
}
