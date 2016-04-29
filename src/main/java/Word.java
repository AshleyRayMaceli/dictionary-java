import java.util.ArrayList;

public class Word {
  private String mName;
  private static ArrayList<Word> allWords = new ArrayList<Word>();
  private int mId;

  public Word (String name) {
    mName = name;
    allWords.add(this);
    mId = allWords.size();
  }

  public String getName() {
    return mName;
  }

  public static ArrayList<Word> all() {
    return allWords;
  }

  public static void clear() {
    allWords.clear();
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    try {
      return allWords.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }
}
