package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // features will use to provide the path of all the features file
        features = "@target/failed.txt",
        // glue keyword used to provide the path of the package where step definitions are available
        glue = "steps",
        // dryRun=true - it stops actual execution, it quickly scans all the steps
        // and will provide the missing step definition
        // dryRun = false it will execute the  steps code
        // dryRun = false,
        // tags = "@login",
        // monochrome = true -> it removes all irreverent info from the console and give you simple output
        // monochrome = true,
        // it used to print all the steps definition and scenario in console
        //
        plugin = {"pretty"}
)
public class FailedRunner {

}
