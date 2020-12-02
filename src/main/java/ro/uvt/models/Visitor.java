package ro.uvt.models;

public interface Visitor {
    void visit(Table table);
    void visit(Chapter chapter);
    void visit(Image image);
    void visit(Paragraph paragraph);
    void visit(Section section);
    void visit(ImageProxy imageProxy);
}
