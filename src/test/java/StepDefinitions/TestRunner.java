package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Features",
    glue = {"StepDefinitions"},
    monochrome = true,
    plugin = {
        "pretty", 
        "html:target/HtmlReports/report.html",
        "json:target/JsonReports/jsonreports.json",
        "junit:target/JunitReports/junitreports.xml"
    },
    tags = "@Smoke"  // Update tags as needed
)
public class TestRunner extends AbstractTestNGCucumberTests {
}



// To run in cmd  mvn test -Dcucumber.filter.tags="@Smoke"