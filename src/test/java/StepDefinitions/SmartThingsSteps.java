package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.Set;

public class SmartThingsSteps {

    DialogContent dc=new DialogContent();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    @And("Click on the SmartThings")
    public void clickOnTheSmartThings() {
        dc.actionAndClick("smartThingsTitle");

    }

    @And("Click on the Apps & Products")
    public void clickOnTheAppsProducts() {
        dc.actionAndClick("appsAndProductsTitle");
    }
    String homePage;
    Set<String> windowsPages;
    String gPlayPage;
    @And("Click on the Google Play Store and switch to the page")
    public void clickOnTheGooglePlayStoreAndSwitchToThePage() {
        homePage= GWD.getDriver().getWindowHandle();

        dc.findAndClick("gPlayStore");

        gPlayPage= GWD.getDriver().getWindowHandle();

        windowsPages = GWD.getDriver().getWindowHandles();
        for (String winPage : windowsPages) {
            if (!homePage.equalsIgnoreCase(winPage)) {
                GWD.getDriver().switchTo().window(winPage);
                wait.withTimeout(Duration.ofSeconds(10));
            }
        }

    }

    @And("Verify that the app is on Google Play and return to the home page")
    public void verifyThatTheAppIsOnGooglePlayAndReturnToTheHomePage() {
        dc.findAndContainsText("verifyPlayStore","SmartThings");
        GWD.getDriver().switchTo().window(homePage);
        wait.withTimeout(Duration.ofSeconds(10));
    }

    @And("Click on the Apple App Store and switch to the page")
    public void clickOnTheAppleAppStoreAndSwitchToThePage() {
        dc.findAndClick("aAppStore");

        windowsPages = GWD.getDriver().getWindowHandles();
        for (String winPage : windowsPages) {
            System.out.println("winId="+winPage);
            if (!homePage.equalsIgnoreCase(winPage)&&!gPlayPage.equalsIgnoreCase(winPage)) {
                GWD.getDriver().switchTo().window(winPage);
            }
        }

    }

    @And("Verify that the app is on Apple Store and return to the home page")
    public void verifyThatTheAppIsOnAppleStoreAndReturnToTheHomePage() {
        dc.findAndContainsText("verifyAppStore","SmartThings");
        GWD.getDriver().switchTo().window(homePage);
    }

    @Then("Close open pages")
    public void closeOpenPages() {
    GWD.quitDriver();
    }
}
