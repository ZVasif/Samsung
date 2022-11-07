package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class AksesuarStep {
    DialogContent dc = new DialogContent();
    Robot robot = new Robot();

    public AksesuarStep() throws AWTException {
    }

    @And("Click on the element from main menu")
    public void clickOnTheElementFromMainMenu(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @Then("Send product name")
    public void sendProductName(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

        }
    }

    @And("Click Enter")
    public void clickEnter() {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    @And("Select TAB ULTRA")
    public void selectTABULTRA(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }


    @And("Close window")
    public void closeWindow(){
        robot.mouseMove(20,0);
    }

    @Then("Get successfully Empty message")
    public void getSuccessfullyEmptyMessage() {
        dc.findAndContainsText("messageEmpty","Boş");

    }
}


