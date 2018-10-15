package withoutcomposite;
import java.util.ArrayList;
import java.util.List;

public class Capitol {
  private String numeCapitol;
  private List<Subcapitol> listaSubcapitole = new ArrayList<Subcapitol>();

  public Capitol(String numeCapitol) {
    this.numeCapitol = numeCapitol;
    //   this.listaSubcapitole = listaSubcapitole;
  }

  /* @Override
  public String toString() {
    return "\n" + numeCapitol + "\nSubcapitole: " + listaSubcapitole;
  }*/

  public String getNumeCapitol() {
    return numeCapitol;
  }

  public void setNumeCapitol(String numeCapitol) {
    this.numeCapitol = numeCapitol;
  }

  /* public List<Subcapitol> getListaSubcapitole() {
    return listaSubcapitole;
  }
  
  public void setListaSubcapitole(List<Subcapitol> listaSubcapitole) {
    this.listaSubcapitole = listaSubcapitole;
  }*/

  public int createSubCap(String numeSubcap) {
    listaSubcapitole.add(new Subcapitol(numeSubcap));
    return listaSubcapitole.size() - 1;
  }

  public Subcapitol getSubcapitol(int indexOfSubCap) {
    return listaSubcapitole.get(indexOfSubCap);
  }

  public void print() {
    System.out.println("Capitol: " + numeCapitol);
    for (Subcapitol listaSubcapitole : listaSubcapitole) {
      listaSubcapitole.print();
    }
  }

}
