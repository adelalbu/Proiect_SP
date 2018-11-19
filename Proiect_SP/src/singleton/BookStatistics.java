
package singleton;

public class BookStatistics implements Visitor {

  private int nrImg = 0;
  private int nrParagrafe = 0;
  private int nrTabele = 0;
  private int nrImgProxy = 0;

  @Override
  public void visit(Imagine imagine) {
    nrImg++;
  }

  @Override
  public void visit(ImagineProxy imagineProxy) {
    nrImgProxy++;
  }

  @Override
  public void visit(Text text) {
    nrParagrafe++;
  }

  @Override
  public void visit(Tabel table) {
    nrTabele++;
  }

  public void printStatistics() {
    System.out.println("Numarul imaginilor: " + nrImg);
    System.out.println("Numarul paragrafelor: " + nrParagrafe);
    System.out.println("Numarul tabelelor: " + nrTabele);
    System.out.println("Numarul imaginilor proxy: " + nrImgProxy);

  }

}
