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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Navigate  {
    DialogContent dc=new DialogContent();
    Actions actions=new Actions(GWD.getDriver());
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
        dc.findAndClick("monitor");
        WebElement mKesfedin=GWD.getDriver().findElement(By.cssSelector("[an-la=\"screens:monitors:discover monitors\"] span"));
        Action action=actions.moveToElement(mKesfedin).click().build();
        action.perform();
    }

    @Then("Click on the monitor Ultra Genis")
    public void clickOnTheMonitorUltraGenis() {
        GWD.Bekle(5);
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("window.scrollBy (0,600)","");
        dc.findAndClick("ultraGenis");
    }

    @And("Click on the second monitor")
    public void clickOnTheSecondMonitor() {
        WebElement monitor2=GWD.getDriver().findElement(By.xpath("(//*[@class='product-card-v2__cta']/a)[2]"));
        Action action=actions.moveToElement(monitor2).click().build();
        action.perform();
    }

    @And("Get successfully message")
    public void getSuccessfullyMessage() {
        dc.findAndContainsText("message34","34");
    }
}
