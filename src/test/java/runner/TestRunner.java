package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",
        glue={"stepdefinations"},
        plugin={"pretty","json:target/cucumber-reports/report.json"},
        monochrome = true
        )

public class TestRunner extends AbstractTestNGCucumberTests {
}
