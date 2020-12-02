package ro.uvt.models;

import ro.uvt.services.Command;
import ro.uvt.services.DocumentManager;

public class OpenCommand implements Command {
    @Override
    public void execute() {
        Section cap1 = new Section("Capitolul 1");
        Section cap2 = new Section("Capitolul 2");
        cap1.add(cap2);
        Paragraph p1 = new Paragraph("models.Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("models.Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("models.Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("models.Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("image1.jpg"));
        cap1.add(new Image("image2.jpg"));
        cap1.add(new Paragraph("models.Paragraph 1"));
        cap1.add(new Table("models.Table 1"));
        DocumentManager.getInstance().setBook(new Book("Book1"));
    }
}
