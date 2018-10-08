import java.util.ArrayList;
import java.util.List;

public class MainClass {

  public static void main(String[] args) {
    Carte c1 = new Carte("Povestea lui Harap-Alb");

    // System.out.println(c1);

    List<Text> texte = new ArrayList<Text>();
    texte.add(new Text("A fost odata ca niciodata..."));
    texte.add(new Text("Harap-Alb mergea prin padure cand deodata...."));

    List<Text> texte2 = new ArrayList<Text>();
    texte2.add(new Text("Si au trait fericiti..."));

    List<Imagine> imagini = new ArrayList<Imagine>();
    imagini.add(new Imagine("Harap-Alb"));
    List<Imagine> imagini2 = new ArrayList<Imagine>();
    imagini2.add(new Imagine("Printesa"));

    List<Tabel> tabele = new ArrayList<Tabel>();
    tabele.add(new Tabel("TabelSimplu"));

    List<Subcapitol> subcapitole = new ArrayList<Subcapitol>();
    subcapitole.add(new Subcapitol("Partea I", texte, imagini, tabele));

    List<Subcapitol> subcapitole2 = new ArrayList<Subcapitol>();
    subcapitole2.add(new Subcapitol("Partea II", texte2, imagini2, tabele));

    /*  List<Subcapitol> subcapitole2 = new ArrayList<Subcapitol>();
    subcapitole2.add(new Subcapitol("Partea III", texte, imagini, tabele)); */

    List<Capitol> capitole = new ArrayList<Capitol>();
    capitole.add(new Capitol("Capitolul 1", subcapitole));
    capitole.add(new Capitol("Capitolul 2", subcapitole2));
    //  capitole.add(new Capitol("Capitolul 3", subcapitole));

    Cuprins cuprins = new Cuprins(capitole);

    c1.setAutor(new Autor("Ion Creanga"));
    c1.setCuprins(cuprins);
    c1.setListaCapitole(capitole);

    System.out.println(c1);

  }

}
