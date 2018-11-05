
package visitor;

public class Imagine implements Element {
  private String numeImagine;

  public Imagine(String numeImagine) {
    this.numeImagine = numeImagine;
  }

  public String getNumeImagine() {
    return numeImagine;
  }

  public void setNumeImagine(String numeImagine) {
    this.numeImagine = numeImagine;
  }

  public void print() {
    System.out.println(numeImagine);
  }

  @Override
  public void add(Element element) {

  }

  @Override
  public void remove(Element element) {

  }

  @Override
  public Element getElement(int index) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);

  }
}
