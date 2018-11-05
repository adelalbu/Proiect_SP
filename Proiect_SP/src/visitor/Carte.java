
package visitor;

import java.util.ArrayList;
import java.util.List;

public class Carte implements Element {

  private String title;
  private Autor autor;

  private List<Element> elemente = new ArrayList<Element>();

  public Carte(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void print() {
    for (Element elemente : elemente) {
      elemente.print();
    }
  }

  @Override
  public void add(Element element) {
    this.elemente.add(element);
  }

  @Override
  public void remove(Element element) {
    this.elemente.remove(element);
  }

  @Override
  public Element getElement(int index) {
    return this.elemente.get(index);
  }

  @Override
  public void accept(Visitor visitor) {
    for (Element element : elemente) {
      element.accept(visitor);
    }
  }

}
