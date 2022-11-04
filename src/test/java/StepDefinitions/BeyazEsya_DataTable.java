package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class BeyazEsya_DataTable {
    DialogContent dc = new DialogContent();

    @When("Click on the Elements on HomePage")
    public void clickOnTheElementsOnHomePage(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
    @And("Move to and Click on the Machine")
    public void moveToAndClickOnTheMachine(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.actAndClick(listElement.get(i));
        }
    }
    @Then("Mail Info Page Appears")
    public void mailInfoPageAppears() {
        dc.findAndContainsText("continueAsGuest","Üye Olmdan Devam Et");
    }
}

