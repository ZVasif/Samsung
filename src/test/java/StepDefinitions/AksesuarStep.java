package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class AksesuarStep {
    DialogContent dc=new DialogContent();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    @And("Click on the element from main menu")
    public void clickOnTheElementFromMainMenu(DataTable elements) {
        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @Then("Send product name")
    public void sendProductName(DataTable elements) {
        List<List<String >>listElement=elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));

        }
    }

    @And("Click Enter")
    public void clickEnter() throws AWTException {
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    @And("Seleck TAB ULTRA")
    public void seleckTABULTRA(DataTable elements) {
        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
        //GWD.Bekle(5);
    }

    @And("Close window")
    public void closeWindow() {
        //GWD.Bekle(5);
       //dc.actionAndClick("close");
    }
}


//(//*[contains(@class,'js-empty-basket')])[2]