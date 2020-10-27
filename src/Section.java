import java.util.ArrayList;
import java.util.List;

public class Section extends Element{
    private String sectionTitle;
    private List<Element> content = new ArrayList<>();

    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public int add(Element element) {
        this.content.add(element);

        return this.content.indexOf(element);
    }

    private Element getElement(int index) {
        return this.content.get(index);
    }

    public void print() {
        for (Element e : this.content) {
            System.out.println(e);
        }
    }

}
