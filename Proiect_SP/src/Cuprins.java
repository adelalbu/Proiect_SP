import java.util.ArrayList;
import java.util.List;

public class Cuprins {

  private List<Capitol> capitole = new ArrayList<Capitol>();

  public List<Capitol> getCapitole() {
    return capitole;
  }

  public void setCapitole(List<Capitol> capitole) {
    this.capitole = capitole;
  }

  @Override
  public String toString() {
    String result = "";
    for (Capitol capitol : capitole) {
      result += capitol.getNumeCapitol() + "; ";
    }
    return result;
  }

  public Cuprins(List<Capitol> capitole) {
    setCapitole(capitole);
  }

}
