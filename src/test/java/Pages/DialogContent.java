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
    private WebElement messageSamsung;
    @FindBy(xpath = "//*[@href='#delete-bold']")
            private WebElement cookie;
    @FindBy(xpath = "//span[text()='Ekranlar']")
            private WebElement ekranlar;
    @FindBy(xpath = "//a[@data-engname='screens:monitors']")
            private WebElement monitor;
    @FindBy(css = "[an-la=\"screens:monitors:discover monitors\"] span")
            private WebElement mKesfedin;
    @FindBy(xpath = "(//div[contains(@class,'image--main-loaded')]/img)[10]")
    private WebElement ultraGenis;
    @FindBy(xpath = "//*[@data-modelname=\"C34G55TWWR\"]")
            private WebElement monitor2;
    @FindBy(className = "pd-option-selector__main-text")
            private WebElement message34;





    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {


        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick (String strElement){
        switch (strElement){
            case "cookie":myElement=cookie;break;
            case "ekranlar":myElement=ekranlar;break;
            case "monitor":myElement=monitor;break;
            case "mKesfedin":myElement=mKesfedin;break;
            case "ultraGenis":myElement=ultraGenis;break;





        }
        clickFunction(myElement);
    }

    public void findAndContainsText (String strElement,String text){
        switch (strElement){
            case "messageSamsung":myElement=messageSamsung;break;
            case "message34":myElement=message34;break;



        }
        verifyContainsText(myElement,text);
    }

    public void SearchAndDelete(String searchText){

    }

    public void actionAndClick (String strElement){
        switch (strElement){
            case "monitor":myElement=monitor;break;
            case "mKesfedin":myElement = mKesfedin;break;
            case "monitor2":myElement = monitor2;break;

        }
        actionFunction(myElement);
    }
}
