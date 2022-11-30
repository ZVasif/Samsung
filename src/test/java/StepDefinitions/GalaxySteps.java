package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class GalaxySteps {
    DialogContent dc = new DialogContent();

    Robot robot = new Robot();

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));


    public GalaxySteps() throws AWTException {

    }

    @And("Click on the element from main menua")
    public void clickOnTheElementFromMainMenua(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (String s : listElement) {
            dc.findAndClick(s);
        }
    }



    @Then("Click on GalaxZ")
    public void clickOnGalaxZ() {
        for (int i = 0; i <10 ; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

        }
        robot.keyPress(KeyEvent.VK_ENTER);

    }

    @And("Buy Galaxy Z Flip")
    public void BuyGalaxyZFlip() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.buyzfold));
        dc.buyzfold.click();
    }

    @And("Add Cart")
    public void addCart() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.addBasket));
        dc.addBasket.click();
    }

    @And("Select phone color")
    public void selectPhoneClor() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.color));
        dc.color.click();


    }

    @And("Click cart button")
    public void clickCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.cartbutton));
        dc.cartbutton.click();
    }

    @And("Go to cart")
    public void goToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.cartbutton2));
        dc.cartbutton2.click();
    }

    @And("Delete to cart")
    public void deleteToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.deletePhone));
        dc.deletePhone.click();
    }
}



