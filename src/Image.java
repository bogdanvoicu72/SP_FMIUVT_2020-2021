import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private String imageName;

    public void print()
    {
        System.out.println("\t\tImage name: " + this.imageName);
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

}
