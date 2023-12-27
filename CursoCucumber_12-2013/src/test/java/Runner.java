//import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//import io.cucumber.junit.Cucumber;

//@ExtendWith(Cucumber.class)
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features")
public class Runner {	

}
