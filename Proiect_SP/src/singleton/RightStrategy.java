
package singleton;

public class RightStrategy implements AlignStrategy {

  @Override
  public void print(String text) {
    System.out.println("----" + text);
  }

}
