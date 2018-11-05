
package visitor;

public class Tabel implements Element {

  private String numeTabel;

  public Tabel(String numeTabel) {
    this.numeTabel = numeTabel;
  }

  public String getNumeTabel() {
    return numeTabel;
  }

  public void setNumeTabel(String numeTabel) {
    this.numeTabel = numeTabel;
  }

  @Override
  public void print() {
    System.out.println(numeTabel);
  }

  @Override
  public void add(Element element) {
    // TODO Auto-generated method stub

  }

  @Override
  public void remove(Element element) {
    // TODO Auto-generated method stub

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
