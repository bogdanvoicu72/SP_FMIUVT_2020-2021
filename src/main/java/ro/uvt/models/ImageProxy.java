package ro.uvt.models;

import javax.persistence.*;

@Entity
public class ImageProxy implements Element{
    @Column
    private String url;
    @Column
    private Integer dim;
    @Transient
    private Image realImage;
    @Id @GeneratedValue
    private String id;

    public ImageProxy() {

    }

    public Image loadImage() {
        if (realImage == null)
            this.realImage = new Image(url);
        return realImage;
    }

    public ImageProxy(String url) { this.url = url; }

    public void print() {
        loadImage();
        realImage.print();
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}
