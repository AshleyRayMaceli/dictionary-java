import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567");
    assertThat(pageSource()).contains("Make Your Very Own Study Guide!");
  }

  @Test
  public void wordIsCreatedTest() {
    goTo("http://localhost:4567");
    click("a", withText("Add a New Word"));
    fill("#word").with("Genome");
    submit(".btn");
    assertThat(pageSource()).contains("Your word has been saved.");
  }

  @Test
  public void wordIsDisplayedTest() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("Genome");
    submit(".btn");
    click("a", withText("View Words"));
    assertThat(pageSource()).contains("Genome");
  }

  @Test
  public void wordShowPageDisplaysName() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("Genome");
    submit(".btn");
    click("a", withText("View Words"));
    goTo("http://localhost:4567/words/1");
    assertThat(pageSource()).contains("Genome");
  }

  @Test
  public void wordDefinitionsFormisDisplayedCorrectly() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("Genome");
    submit(".btn");
    click("a", withText("View Words"));
    goTo("http://localhost:4567/words/1");
    click("a", withText("Add a New Definition"));
    assertThat(pageSource()).contains("Add a definition to Genome");
  }
}
