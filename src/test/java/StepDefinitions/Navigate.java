package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Navigate {
    DialogContent dc=new DialogContent();
    @Given("Navigate to Samsung")
    public void navigateToSamsung() {
        GWD.getDriver().get("https://www.samsung.com/tr/");
        GWD.getDriver().manage().window().maximize();
    }

    @Then("Get message {string}")
    public void getMessage(String arg0) {
        dc.findAndContainsText("successMessage","Samsung");
    }
}
