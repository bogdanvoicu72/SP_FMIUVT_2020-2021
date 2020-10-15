package Lab2;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text){

        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(this.text);
    }
}
