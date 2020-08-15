package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/features"},
        glue = "stepsDefinition",
        plugin = "message:target/cucumber-report-feature-composite.ndjson")
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}