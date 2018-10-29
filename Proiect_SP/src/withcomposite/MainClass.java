
package withcomposite;

import strategy.CenterStrategy;
import strategy.LeftStrategy;
import strategy.RightStrategy;

public class MainClass {

  public static void main(String[] args) {
    Carte noapteBuna = new Carte("Noapte buna, copii!");
    Section cap1 = new Section("Capitolul 1");

    ImagineProxy img1 = new ImagineProxy("casa.jpg");
    cap1.add(img1);

    ImagineProxy img2 = new ImagineProxy("masina.jpg");
    cap1.add(img2);

    Text aliniat = new Text("Noapte");
    aliniat.setAlignStrategy(new CenterStrategy());
    Text aliniat2 = new Text("Familie");
    aliniat2.setAlignStrategy(new LeftStrategy());
    Text aliniat3 = new Text("Noapte");
    aliniat3.setAlignStrategy(new RightStrategy());

    cap1.add(new Text("Text 1"));
    cap1.add(new Text("Text 2"));
    cap1.add(new Imagine("Imagine 1"));
    cap1.add(aliniat);
    cap1.add(aliniat2);
    cap1.add(aliniat3);
    noapteBuna.add(cap1);
    noapteBuna.add(new Text("Multumesc"));
    noapteBuna.print();

  }

}