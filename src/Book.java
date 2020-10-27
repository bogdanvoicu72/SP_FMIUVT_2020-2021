import java.util.ArrayList;

public class Book implements Element{
    private String title;
    private ArrayList<Author> authors = new ArrayList<Author>();
    private TableOfContents tableOfContents;
    private ArrayList<Element> elements = new ArrayList<Element>();

    public void print(){
        System.out.println("Book name: " + title);
        this.printElements();
    }

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author)
    {
        this.authors.add(author);
    }

    public void addContent(Element element) {
        elements.add(element);
    }

    public void printElements() {
        for (Element e : elements) {
            e.print();
        }
    }
}
