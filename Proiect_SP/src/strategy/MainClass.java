
package strategy;

public class MainClass {

  public static void main(String[] args) {
    Carte noapteBuna = new Carte("Noapte buna, copii!");
    Section cap1 = new Section("Capitolul 1");

    ImagineProxy img1 = new ImagineProxy("casa.jpg");
    cap1.add(img1);

    ImagineProxy img2 = new ImagineProxy("masina.jpg");
    cap1.add(img2);

    cap1.add(new Text("Text 1"));
    cap1.add(new Text("Text 2"));
    cap1.add(new Imagine("Imagine 1"));
    noapteBuna.add(cap1);
    noapteBuna.add(new Text("Multumesc"));
    noapteBuna.print();

  }

}