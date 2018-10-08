
public class Text {

  private String someText;

  public Text(String someText) {
    this.someText = someText;
  }

  @Override
  public String toString() {
    return someText;
  }

  public String getSomeText() {
    return someText;
  }

  public void setSomeText(String someText) {
    this.someText = someText;
  }

}
