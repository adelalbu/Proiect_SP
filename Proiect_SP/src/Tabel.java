
public class Tabel {

 private String numeTabel;

  public Tabel(String numeTabel) {
    this.numeTabel = numeTabel;
  }

  @Override
  public String toString() {
    return numeTabel;
  }

  public String getNumeTabel() {
    return numeTabel;
  }

  public void setNumeTabel(String numeTabel) {
    this.numeTabel = numeTabel;
  }
}
