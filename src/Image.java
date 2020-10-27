public class Image implements Element{
    private String imageName;

    public void print()
    {
        System.out.println("\t\t\t\tImage: " + imageName);
    }

    public Image(String imageName) {
        this.imageName = imageName;
    }
}
