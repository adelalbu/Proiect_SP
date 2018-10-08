import java.util.ArrayList;
import java.util.List;

public class Carte {

  public String title;
  public Autor autor;
  public Cuprins cuprins;
  public List<Capitol> listaCapitole = new ArrayList<Capitol>();

  public Carte(String title) {
    this.title = title;
    //   this.autor = autor;
    //   this.cuprins = cuprins;
    //   this.listaCapitole = listaCapitole;
  }

  public String getTitle() {
    return title;
  }

  public Autor getAutor() {
    return autor;
  }

  public void setAutor(Autor autor) {
    this.autor = autor;
  }

  public List<Capitol> getListaCapitole() {
    return listaCapitole;
  }

  public void setListaCapitole(List<Capitol> listaCapitole) {
    this.listaCapitole = listaCapitole;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Nume carte: " + this.title + "\nAutor: " + this.autor + "\nCuprins: " + this.cuprins + "\nCapitole:\n" + this.listaCapitole;

  }

  /**
   * @param cuprins
   */
  public void setCuprins(Cuprins cuprins) {
    this.cuprins = cuprins;
  }
}
