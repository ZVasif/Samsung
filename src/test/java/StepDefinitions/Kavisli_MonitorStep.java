package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Kavisli_MonitorStep {
    DialogContent dc=new DialogContent();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @And("Click on the Monitör and Kavisli Monitör")
    public void clickOnTheMonitörAndKavisliMonitör() {
        dc.actionAndClick("monitor");
        dc.actionAndClick("kavisli");

    }

    @Then("Choose Ekran Boyutu")
    public void chooseEkranBoyutu() {
        //WebElement element=GWD.driver.findElement(By.xpath("//*[@for=\"checkbox-series04o04\"]"));
        //wait.until(ExpectedConditions.elementToBeClickable(element));
        GWD.Bekle(5);
        dc.actionAndClick("inc");
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
