package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Kavisli_MonitorStep {
    DialogContent dc=new DialogContent();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @And("Action to the IT from main menu and click on the Kavisli Monitör")
    public void actionToTheITFromMainMenuAndClickOnTheKavisliMonitör() {
        dc.actionAndClick("IT");
        dc.actionAndClick("kavisli");

    }


    @Then("Choose Ekran Boyutu")
    public void chooseEkranBoyutu() {
        dc.findAndClick("scroll");
        dc.findAndClick("inc");
    }

    @And("Select Odessey monitor")
    public void selectOdesseyMonitor() {
        dc.actionAndClick("odessey");
        dc.findAndContainsText("message27","27");
    }

    @Then("Click on the Destek")
    public void clickOnTheDestek() {
        dc.findAndClick("destek");

    }

    @And("Go to Desteye Git")
    public void goToDesteyeGit() {
        String firstW=GWD.getDriver().getWindowHandle();
        dc.actionAndClick("desteyeGit");

        Set<String >allW=GWD.getDriver().getWindowHandles();
        for (String window:allW){
            GWD.getDriver().switchTo().window(window);
        }
    }

    @And("Get successfully message Odessey")
    public void getSuccessfullyMessageOdessey() {
        dc.findAndContainsText("messageOdessey","Odyssey G3");
    }


}
