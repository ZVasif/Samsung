package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import com.google.common.annotations.GwtCompatible;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HafizaDepolamaSteps {

    DialogContent dc = new DialogContent();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @And("Action to the IT from main menu and click on the Tumunu Gor")
    public void actionToTheITFromMainMenuAndClickOnTheTumunuGor() {
        dc.actionAndClick("IT");
        dc.findAndClick("TumunuGor");
    }


    @And("Select SSD from Tip and TB from Kapasite")
    public void selectSSDFromTipAndTBFromKapasite() {

        dc.findAndClick("SSD");
        dc.findAndClick("TB2");


    }

    @Then("Select one of the products and click the Nerden Alinir")
    public void selectOneOfTheProductsAndClickTheNerdenAlinir() {
        dc.findAndClick("product");
        dc.findAndClick("nereden");
    }

    @And("Close both windows")
    public void closeBothWindows() {
        dc.findAndClick("close1");
        dc.findAndClick("close2");
    }
}
