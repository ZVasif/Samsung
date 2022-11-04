package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Navigate  {
    DialogContent dc=new DialogContent();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    @Given("Navigate to Samsung")
    public void navigateToSamsung() {
        GWD.getDriver().get("https://www.samsung.com/tr/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Get successfully message Samsung")
    public void getSuccessfullyMessageSamsung() {
        dc.findAndContainsText("messageSamsung","Samsung");
    }

    @Then("Close cookie window")
    public void closeCookieWindow() {
        dc.findAndClick("cookie");
    }

    @And("Click on the Ekranlar from main menu")
    public void clickOnTheEkranlarFromMainMenu() {
        dc.findAndClick("ekranlar");
    }

    @And("Click on the Monitör and Monitörleri Keşfedin")
    public void clickOnTheMonitörAndMonitörleriKeşfedin() {
        dc.actionAndClick("monitor");
        dc.actionAndClick("mKesfedin");
    }

    @Then("Click on the monitor Ultra Genis")
    public void clickOnTheMonitorUltraGenis() {
        WebElement element=GWD.getDriver().findElement(By.xpath("(//div[@role=\"tablist\"]/button)[2]"));

        wait.until(ExpectedConditions.attributeContains(element,"aria-selected","true"));

        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollBy (0,600)","");
        dc.findAndClick("ultraGenis");
    }

    @And("Click on the second monitor")
    public void clickOnTheSecondMonitor() {
        WebElement element=GWD.getDriver().findElement(By.xpath("(//div[@role=\"tablist\"]/button)[2]"));

        wait.until(ExpectedConditions.attributeContains(element,"aria-selected","true"));
        dc.actionAndClick("monitor2");
    }

    @And("Get successfully message")
    public void getSuccessfullyMessage() {
        dc.findAndContainsText("message34","34");
    }
}
