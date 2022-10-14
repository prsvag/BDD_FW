package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.StepDefinition;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Lenovo\\Desktop\\automtion\\UI_Framwork_template\\SimpleBDDFramwork\\src\\test\\resources\\Features\\Register.feature",

        glue = {"StepDefinition"},
        dryRun = false
)
public class TestRunner {
}
