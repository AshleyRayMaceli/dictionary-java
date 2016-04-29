import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @After
  public void tearDown() {
    Word.clear();
  }

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
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("Luminescent");
    Word secondWord = new Word("Microbiology");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void clear_emptiesAllWordsFromList_0() {
    Word firstWord = new Word("Dichotomous");
    Word.clear();
    assertEquals(0, Word.all().size());
  }

  @Test
  public void getId_wordsInstantiatesWithAnId_1() {
    Word testWord = new Word("Hemoglobin");
    assertEquals(1, testWord.getId());
  }

  @Test
  public void find_returnsWordWithSameId_secondWord() {
    Word firstWord = new Word("Bacteria");
    Word secondWord = new Word("Antibody");
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }

  @Test
  public void getWords_returnsNullWhenNoWordFound_null() {
    assertTrue(Word.find(999) == null);
  }

  @Test
  public void addDefinitions_addsDefinitionsToList_true() {
    Word testWord = new Word("Genome");
    Definition testDef = new Definition("The complete set of genes or genetic material present in a cell or organism");
    testWord.addDefinition(testDef);
    assertTrue(testWord.getDefinitions().contains(testDef));
  }
}
