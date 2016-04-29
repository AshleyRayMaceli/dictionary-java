import java.util.ArrayList;

public class Definition {
  private String mWordDefinition;
  private static ArrayList<Definition> allDefinitions = new ArrayList<Definition>();
  private int mId;

  public Definition(String wordDefinition) {
    mWordDefinition = wordDefinition;
    allDefinitions.add(this);
    mId = allDefinitions.size();
  }

  public String getDefinition() {
    return mWordDefinition;
  }

  public static ArrayList<Definition> all() {
    return allDefinitions;
  }

  public static void clear() {
    allDefinitions.clear();
  }

  public int getId() {
    return mId;
  }

  public static Definition find(int id) {
    try {
      return allDefinitions.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }
}
