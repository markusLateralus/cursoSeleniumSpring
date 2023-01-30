package general.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true, //salida de consola más legible
		plugin = {"pretty", "html:target/cucumber-reports/miReporte.html"},
		features="src/test/resources/features",
				  //src\test\resources\features\singup.feature
		glue="general.steps"
		)
public class Runner {

}
