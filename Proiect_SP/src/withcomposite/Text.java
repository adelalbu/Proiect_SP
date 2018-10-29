
package withcomposite;

import strategy.AlignStrategy;

public class Text implements Element {

  private String someText;
  private AlignStrategy align;

  public Text(String someText) {
    this.someText = someText;
  }

  public void setAlignStrategy(AlignStrategy align) {
    this.align = align;
  }

  public String getSomeText() {
    return someText;
  }

  public void setSomeText(String someText) {
    this.someText = someText;
  }

  @Override
  public void print() {
    if (align != null) {
      align.print(someText);
    } else {
      System.out.println(someText);
    }
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

}
