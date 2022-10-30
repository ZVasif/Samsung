package Pages;

import Utilites.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Samsung']")
    private WebElement successMessage;
    @FindBy(xpath = "//*[@href='#delete-bold']")


    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {


        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick (String strElement){
        switch (strElement){


        }
        clickFunction(myElement);
    }

    public void findAndContainsText (String strElement,String text){
        switch (strElement){
            case "successMessage":myElement=successMessage;break;


        }
        verifyContainsText(myElement,text);
    }

    public void SearchAndDelete(String searchText){

    }
}
