
package builder;

public class RightStrategy implements AlignStrategy {

  @Override
  public void print(String text) {
    System.out.println("----" + text);
  }

}
