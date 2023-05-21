package cleaningCarpet;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "use-cases",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		glue = "cleaningCarpet"
		)

public class generateTest {

}
