package structural.proxy;

public class Main {
  public static void main(String[] args) {
    Image image = new ImageProxy("img.jpg");
    image.display();  // first call will load the image from the disk
    image.display();  // second will load the image from the cache
  }
}
