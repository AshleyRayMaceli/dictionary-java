import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("Education");
  }

  @Test
  public void getName_wordInstantiatesWithName_Education() {
    Word testWord = new Word("Education");
    assertEquals("Education", testWord.getName());
  }
}
