package ro.uvt.models;

public class Author {
    private String name;

    public void print(){
        System.out.println("models.Author " + name);
    }

    public Author(String name) {
        this.name = name;
    }
}
