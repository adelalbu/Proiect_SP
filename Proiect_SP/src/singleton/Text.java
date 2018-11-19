
package singleton;

public class Text implements Element {

  private String someText;

  public Text(String someText) {
    this.someText = someText;
  }

  public String getSomeText() {
    return someText;
  }

  public void setSomeText(String someText) {
    this.someText = someText;
  }

  @Override
  public void print() {
    System.out.println(someText);
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
