package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/MenuLateralMantis.feature", glue = { "" }, tags = "@Test")
public class MenuLateralMantisTest {
}
