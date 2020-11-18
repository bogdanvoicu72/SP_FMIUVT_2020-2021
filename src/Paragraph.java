public class Paragraph implements Element {
    private String text;

    public void print()
    {
        System.out.println("\tParagraph: " + this.text);
    }

    public Paragraph(String text) {
        this.text = text;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
