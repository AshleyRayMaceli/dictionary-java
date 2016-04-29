import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DefinitionTest {

  @After
  public void tearDown() {
    Definition.clear();
  }

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("This is a definition for a word");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void Definition_instantiatesWithWordDescription_String() {
    Definition testDefinition = new Definition("Definition goes here");
    assertEquals("Definition goes here", testDefinition.getDefinition());
  }

  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDef = new Definition("First definition");
    Definition secondDef = new Definition("Second definition");
    assertTrue(Definition.all().contains(firstDef));
    assertTrue(Definition.all().contains(secondDef));
  }

  @Test
  public void clear_emptiesAllDefinitionsFromArrayList_0() {
    Definition testDefinition = new Definition("Definition goes here");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
}
