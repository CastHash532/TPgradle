import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", plugin = {"pretty", "html:build/reports/cucumber/report.html"})
public class ExampleTest {

}