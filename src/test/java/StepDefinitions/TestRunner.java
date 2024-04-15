package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\poojasharma03\\OneDrive - Nagarro\\Desktop\\CucumberJava\\src\\test\\resources\\Features", glue= {"StepDefinitions"},
monochrome=true,
plugin={"pretty","json:target/JSONReports/report.json"})
public class TestRunner {

}
