package runnerTags;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "C:\\Users\\Administrador\\IdeaProjects\\Utest\\src\\test\\resources\\features\\Utest.feature",
        tags = "@stories",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
