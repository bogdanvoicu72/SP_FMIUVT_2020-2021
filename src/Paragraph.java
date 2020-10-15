public class Paragraph extends Element {
    private String text;

    public void print()
    {
        System.out.println("\t\t\tParagraph: " + this.text);
    }

    public Paragraph(String text) {
        this.text = text;
    }
}
