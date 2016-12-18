package nl.devon.cucumber.sample_apps.banking;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:out" }, snippets = SnippetType.CAMELCASE)
public class RunCucumberTest {
}
