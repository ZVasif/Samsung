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

    @Then("Choose inch from Ekran Boyutu and resolution from Görüntü Çözünürlüğü")
    public void chooseInchFromEkranBoyutuAndResolutionFromGörüntüÇözünürlüğü() {
        dc.findAndClick("screenSize");
        dc.findAndClick("inc");
        dc.findAndClick("resolution");
        dc.findAndClick("HD");
    }

    @And("Select Odessey monitor")
    public void selectOdesseyMonitor() {
        dc.findAndClick("odessey");
        dc.findAndContainsText("messageInc","34");
    }

    @Then("Click on the Destek")
    public void clickOnTheDestek() {
        dc.findAndClick("destek");

    }

    @And("Go to Desteye Git")
    public void goToDesteyeGit() {
        dc.actionAndClick("desteyeGit");

        Set<String >allW=GWD.getDriver().getWindowHandles();
        for (String window:allW){
            GWD.getDriver().switchTo().window(window);
        }
    }

    @And("Get successfully message Odessey")
    public void getSuccessfullyMessageOdessey() {
        dc.findAndContainsText("messageOdessey","Odyssey G");
    }



}
