public class ImageProxy extends Element{
    private String url;
    private Integer dim;
    private Image realImage;

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

}
