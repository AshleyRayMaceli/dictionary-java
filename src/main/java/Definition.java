import java.util.ArrayList;

public class Definition {
  private String mWordDefinition;
  private static ArrayList<Definition> allDefinitions = new ArrayList<Definition>();

  public Definition(String wordDefinition) {
    mWordDefinition = wordDefinition;
    allDefinitions.add(this);
  }

  public String getDefinition() {
    return mWordDefinition;
  }

  public static ArrayList<Definition> all() {
    return allDefinitions;
  }
}
