import java.util.ArrayList;

public class Word {
  private String mName;
  private static ArrayList<Word> allWords = new ArrayList<Word>();

  public Word (String name) {
    mName = name;
    allWords.add(this);
  }

  public String getName() {
    return mName;
  }

  public static ArrayList<Word> all() {
    return allWords;
  }
}
