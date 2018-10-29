
package strategy;

public class ImagineProxy implements Element {
  private Imagine imagine;
  private String fileName;

  public ImagineProxy(String numeImagine) {
    this.fileName = numeImagine;
  }

  public void print() {
    if (imagine == null) {
      imagine = new Imagine(fileName);
    }
    imagine.print();
  }

  public void add(Element element) {
    if (imagine == null) {
      imagine = new Imagine(fileName);
    }
    imagine.add(element);
  }

  public void remove(Element element) {
    if (imagine == null) {
      imagine = new Imagine(fileName);
    }
    imagine.remove(element);
  }

  public Element getElement(int index) {
    if (imagine == null) {
      imagine = new Imagine(fileName);
    }
    return imagine.getElement(index);
  }

}