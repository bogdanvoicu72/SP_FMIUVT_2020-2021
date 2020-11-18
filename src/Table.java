public class Table implements Element {
    private String title;

    public void print()
    {
        System.out.println("\t\tTable: " + this.title);
    }

    public Table(String title) {
        this.title = title;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
