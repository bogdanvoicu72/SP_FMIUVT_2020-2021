public class BookStatistics implements Visitor{
    private int chapter = 0;
    private int paragraphs = 0;
    private int tables = 0;
    private int sections = 0;
    private int images = 0;

    void print() {
        System.out.println("BookStatistics{" +
                "chapter=" + chapter +
                ", paragraphs=" + paragraphs +
                ", tables=" + tables +
                ", sections=" + sections +
                ", images=" + images +
                '}');
    }

    @Override
    public void visit(Table table) {
        this.tables++;
    }

    @Override
    public void visit(Chapter chapter) {
        this.chapter++;
    }

    @Override
    public void visit(Image image) {
        this.images++;
    }

    @Override
    public void visit(Paragraph paragraph) {
        this.paragraphs++;
    }

    @Override
    public void visit(Section section) {
        this.sections++;
    }

    @Override
    public void visit(ImageProxy imageProxy) {

    }
}
