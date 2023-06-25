package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class HafizaDepolamaSteps {

    DialogContent dc = new DialogContent();

    @And("Action to the IT from main menu and click on the Tumunu Gor")
    public void actionToTheITFromMainMenuAndClickOnTheTumunuGor() {
        dc.actionAndClick("IT");
        dc.findAndClick("hafizaDepolamaTumunuGor");
        dc.findAndClick("filterMemoryCard");
    }

    @And("Select SSD from Tip and {int}TB from Kapasite")
    public void selectSSDFromTipAndTBFromKapasite(int arg0) {
        GWD.Bekle(5);
        dc.actionAndClick("SSD");
        //dc.findAndClick("TB2");
    }
}
