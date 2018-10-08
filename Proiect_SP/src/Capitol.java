import java.util.ArrayList;
import java.util.List;

public class Capitol {
  private String numeCapitol;
  private List<Subcapitol> listaSubcapitole = new ArrayList<Subcapitol>();

  public Capitol(String numeCapitol, List listaSubcapitole) {
    this.numeCapitol = numeCapitol;
    this.listaSubcapitole = listaSubcapitole;
  }

  @Override
  public String toString() {
    return "\n" + numeCapitol + "\nSubcapitole: " + listaSubcapitole;
  }

  public String getNumeCapitol() {
    return numeCapitol;
  }

  public void setNumeCapitol(String numeCapitol) {
    this.numeCapitol = numeCapitol;
  }

  public List<Subcapitol> getListaSubcapitole() {
    return listaSubcapitole;
  }

  public void setListaSubcapitole(List<Subcapitol> listaSubcapitole) {
    this.listaSubcapitole = listaSubcapitole;
  }

}
