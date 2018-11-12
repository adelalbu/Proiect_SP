package builder;


import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class MainClass {
  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
    Builder jsonBuilder = new Builder("book.json");
    jsonBuilder.build();

    Element myBook = jsonBuilder.getResult();
    myBook.print();
  }
}