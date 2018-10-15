package withoutcomposite;
public class MainClass {

  public static void main(String[] args) {
    Carte c1 = new Carte("Povestea lui Harap-Alb");
    Autor autor = new Autor("Ion Creanga");

    c1.addAuthor(autor);

    //capitolul 1

    int indexOfChapterOne = c1.createChapter("Capitolul 1");
    Capitol chapter1 = c1.getChapter(indexOfChapterOne);
    int indexOfSubChapterOneOne = chapter1.createSubCap("Partea I");
    Subcapitol scOneOne = chapter1.getSubcapitol(indexOfSubChapterOneOne);
    scOneOne.createText("Text: A fost odata ca niciodata...");
    scOneOne.createText("Text: Harap-Alb a mers sa isi aleaga un cal...");
    scOneOne.createImage("Imagine: Harap-Alb si Imparatul");
    scOneOne.createText("Text: Dintr-o data ii iese in cale Spanul.");
    scOneOne.createTable("Tabel simplu");

    int indexOfSubChapterOneTwo = chapter1.createSubCap("Partea II");
    Subcapitol scOneTwo = chapter1.getSubcapitol(indexOfSubChapterOneTwo);
    scOneTwo.createText("Text: Spanul il pacaleste pe Harap-Alb...");
    scOneTwo.createText("Text: ... ii fura identitatea si il lasa inchis in fantana.");
    scOneTwo.createImage("Imagine: Spanul");
    scOneTwo.createText("Text: Harap-Alb se intalneste cu...");
    scOneTwo.createTable("Tabel 2");
    scOneTwo.createText("Text: Si asa au reusit sa scape.");

    //capitolul 2

    int indexOfChapterTwo = c1.createChapter("Capitolul 2");
    Capitol chapter2 = c1.getChapter(indexOfChapterTwo);
    int indexOfSubChapterTwoOne = chapter2.createSubCap("Partea I");
    Subcapitol scTwoOne = chapter2.getSubcapitol(indexOfSubChapterTwoOne);
    scTwoOne.createText("Text: Setila atunci se ia dupa Harap-Alb si pornesc tuspatru inainte.");

    c1.print();

  }

}
