public class Image extends Element{
    private String imageName;

    public void print()
    {
        System.out.println("\t\tImage: " + imageName);
    }

    public Image(String imageName) {
        this.imageName = imageName;
    }
}
