import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("This is a definition for a word");
    assertEquals(true, testDefinition instanceof Definition);
  }
}
