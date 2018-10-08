import java.util.ArrayList;
import java.util.List;

public class Subcapitol {

  public String numeSubcap;
  public List<Text> listaText = new ArrayList<Text>();
  public List<Imagine> listaImagini = new ArrayList<Imagine>();
  public List<Tabel> listaTabele = new ArrayList<Tabel>();

  public Subcapitol(String numeSubcap, List listaText, List listaImagini, List listaTabele) {
    this.numeSubcap = numeSubcap;
    this.listaText = listaText;
    this.listaImagini = listaImagini;
    this.listaTabele = listaTabele;
  }

  @Override
  public String toString() {
    return numeSubcap + ". Text: " + listaText + ". Imagini: " + listaImagini + ". Tabele: " + listaTabele;
  }

  public String getNumeSubcap() {
    return numeSubcap;
  }

  public void setNumeSubcap(String numeSubcap) {
    this.numeSubcap = numeSubcap;
  }

  public List<Text> getListaText() {
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

}
