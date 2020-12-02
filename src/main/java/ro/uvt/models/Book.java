package ro.uvt.models;

import java.util.ArrayList;

public class Book{
    private String title;
    private ArrayList<Author> authors = new ArrayList<Author>();
    private TableOfContents tableOfContents;
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    private ArrayList<Element> elements = new ArrayList<Element>();

    public void print(){
        //System.out.println("models.Book name: " + title);
        //this.printElements();
    }

    public Book(String title) {
        this.title = title;
    }

    public void addContent(Element element) {
        elements.add(element);
    }

    public void addAuthor(Author author)
    {
        this.authors.add(author);
    }

    public int createChapter(String chapterName)
    {
        Chapter createdChapter = new Chapter(chapterName);
        this.chapters.add(createdChapter);
        return this.chapters.indexOf(createdChapter);
    }

    public Chapter getChapter(int index)
    {
        return this.chapters.get(index);
    }
}
