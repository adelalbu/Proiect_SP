
package singleton;

public interface Visitor {

  public void visit(Imagine imagine);

  public void visit(ImagineProxy imagineProxy);

  public void visit(Text text);

  public void visit(Tabel table);

}
