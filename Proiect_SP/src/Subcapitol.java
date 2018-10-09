import java.util.ArrayList;
import java.util.List;

public class Subcapitol {

  private String numeSubcap;

  /* private List<Text> listaText = new ArrayList<Text>();
  private List<Imagine> listaImagini = new ArrayList<Imagine>();
  private List<Tabel> listaTabele = new ArrayList<Tabel>();*/

  List<Element> elements = new ArrayList<Element>();

  public Subcapitol(String numeSubcap) {
    this.numeSubcap = numeSubcap;
    /* this.listaText = listaText;
    this.listaImagini = listaImagini;
    this.listaTabele = listaTabele;*/
  }

  /* public String toString() {
    return numeSubcap + ". Text: " + listaText + ". Imagini: " + listaImagini + ". Tabele: " + listaTabele;
  }
  */
  public String getNumeSubcap() {
    return numeSubcap;
  }

  public void setNumeSubcap(String numeSubcap) {
    this.numeSubcap = numeSubcap;
  }

  /*public List<Text> getListaText() {
    return listaText;
  }
  
  public void setListaText(List<Text> listaText) {
    this.listaText = listaText;
  }
  
  public List<Imagine> getListaImagini() {
    return listaImagini;
  }
  
  public void setListaImagini(List<Imagine> listaImagini) {
    this.listaImagini = listaImagini;
  }
  
  public List<Tabel> getListaTabele() {
    return listaTabele;
  }
  
  public void setListaTabele(List<Tabel> listaTabele) {
    this.listaTabele = listaTabele;
  }
  */

  public void createText(String someText) {
    elements.add(new Text(someText));
  }

  public void createImage(String numeImagine) {
    elements.add(new Imagine(numeImagine));
  }

  public void createTable(String numeTabel) {
    elements.add(new Tabel(numeTabel));
  }

  public void print() {
    System.out.println("Subcapitol: " + numeSubcap);
    for (Element element : elements) {
      element.print();
    }
  }

}
