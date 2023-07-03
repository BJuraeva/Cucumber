package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public  void start(){
        openBrowserAndNavigateToURL();
    }
    @After
    public  void end(Scenario scenario){
        // need this variable because my ss array return array of the byte
        byte[] pic;

        // capturing the screenshot for report
        if(scenario.isFailed()) {
            pic = takeScreenshot("failed/" + scenario.getName());
        }else {
            pic = takeScreenshot("passed/" + scenario.getName());
        }

        // attaching screenshot in the report
        scenario.attach(pic,"image/png",scenario.getName());

        closeBrowser();
    }
}
