package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // features will use to provide the path of all the features file
        features = "src/test/resources/features/",
        // glue keyword used to provide the path of the package where step defins are available
        glue = "steps"
)

public class RunnerClass {

}
