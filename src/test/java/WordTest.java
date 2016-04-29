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

  @Test
  public void all_returnsAllInstancesOfCategory_true() {
    Word firstWord = new Word("Luminescent");
    Word secondWord = new Word("Microbiology");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }
}
