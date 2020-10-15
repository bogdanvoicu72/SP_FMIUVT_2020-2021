package Lab2;

public class Image implements Element {
    private String imageName;

    public Image(String imageName){
        this.imageName = imageName;
    }

    @Override
    public void print() {
        System.out.println(this.imageName);
    }
}
