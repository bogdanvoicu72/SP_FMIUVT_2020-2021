public class Table extends Element {
    private String title;

    public void print()
    {
        System.out.println("\t\tTable: " + this.title);
    }

    public Table(String title) {
        this.title = title;
    }
}
