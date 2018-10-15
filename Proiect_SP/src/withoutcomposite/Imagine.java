package withoutcomposite;

public class Imagine extends Element {
  private String numeImagine;

  public Imagine(String numeImagine) {
    this.numeImagine = numeImagine;
  }

  /* @Override
  public String toString() {
    return numeImagine;
  }
  */
  public String getNumeImagine() {
    return numeImagine;
  }

  public void setNumeImagine(String numeImagine) {
    this.numeImagine = numeImagine;
  }

  @Override
  public void print() {
    System.out.println(numeImagine);
  }
}
