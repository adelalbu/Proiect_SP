package withoutcomposite;
import java.util.ArrayList;
import java.util.List;

public class Carte {

  private String title;
  private Autor autor;
  // private Cuprins cuprins;
  private List<Capitol> listaCapitole = new ArrayList<Capitol>();

  public Carte(String title) {
    this.title = title;
    //   this.autor = autor;
    //   this.cuprins = cuprins;
    //   this.listaCapitole = listaCapitole;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /*public Autor getAutor() {
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
  }*/

  /* @Override
  public String toString() {
    return "Nume carte: " + this.title + "\nAutor: " + this.autor + "\nCuprins: " + this.cuprins + "\nCapitole:\n" + this.listaCapitole;
  
  }
  
  *//**
      * @param cuprins
      *//*
          public void setCuprins(Cuprins cuprins) {
          this.cuprins = cuprins;
          }*/

  @SuppressWarnings("hiding")
  public void addAuthor(Autor autor) {
    this.autor = autor;
  }

  public int createChapter(String numeCapitol) {
    listaCapitole.add(new Capitol(numeCapitol));
    return listaCapitole.size() - 1;
  }

  public Capitol getChapter(int indexOfChapter) {
    return listaCapitole.get(indexOfChapter);
  }

  public void print() {
    System.out.println("Carte: " + title);
    autor.print();
    for (Capitol chapter : listaCapitole) {
      chapter.print();
    }
  }

}
