package ro.uvt.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.concurrent.TimeUnit;

@Entity
public class Image implements Element{
    @Column
    private String imageName;
    @Id @GeneratedValue
    private String id;

    public Image() {

    }

    public void print()
    {
        System.out.println("\t\tmodels.Image name: " + this.imageName);
    }

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
