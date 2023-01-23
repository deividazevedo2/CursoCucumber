package br.com.deivid.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/aprender_cucumber.feature", 
		glue = "br.com.deivid.steps",
		//tags = {"@esse",  "@aquele"},
		plugin = "pretty", 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false, 
		strict = false)
public class Runner {

}
