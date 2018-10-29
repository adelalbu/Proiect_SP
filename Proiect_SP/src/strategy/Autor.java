package strategy;

public class Autor {

  private String name;

  public Autor(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public void print() {
    System.out.println("Autor: " + name);
  }
}
