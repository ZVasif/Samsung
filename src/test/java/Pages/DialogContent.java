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
    @FindBy(xpath = "(//*[@class='product-card-v2__cta']/a)[2]")
            private WebElement monitor2;
    @FindBy(className = "pd-option-selector__main-text")
            private WebElement message34;


    @FindBy(xpath = "(//span[@class='px-3 py-2 rounded-pill'])[3]")
    private WebElement BeyazEsyaKlimalar;
    @FindBy(css = "[title='Çamaşır / Kurutma Makineleri']")
    private WebElement CamasirKurutmaMakineleri;
    @FindBy(css = "[data-product='3531']")
    private WebElement WD90SatinAl;
    @FindBy (xpath = "(//button[@class='btn btn-block pz-button__add-to-cart js-add-to-cart data-omni-addtocart btn-add-to-cart active pz-button__action'])[2]")
    private WebElement SepeteEkle;
    @FindBy(className = "btn pz-btn btn-block btn-primary data-omni-cartview")
    private WebElement SepeteGit;
    @FindBy (css="[data-omni='cart:proceed to checkout']")
    private WebElement SepetiOnayla;
    @FindBy(xpath = "(//button[@data-an-la='guest'])[2]")
    private WebElement continueAsGuest;


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

            case "BeyazEsyaKlimalar":myElement=BeyazEsyaKlimalar;break;
            case "CamasirKurutmaMakineleri":myElement=CamasirKurutmaMakineleri;break;
            case "SepeteEkle":myElement=SepeteEkle;break;
            case "SepeteGit":myElement=SepeteGit;break;
            case "SepetiOnayla":myElement=SepetiOnayla;break;



        }
        clickFunction(myElement);
    }

    public void findAndContainsText (String strElement,String text){
        switch (strElement){
            case "messageSamsung":myElement=messageSamsung;break;
            case "message34":myElement=message34;break;
            case "continueAsGuest":myElement=continueAsGuest;break;


        }
        verifyContainsText(myElement,text);
    }

    public void SearchAndDelete(String searchText){

    }

    public void actAndClick (String strElement){
        switch (strElement){
            case "monitor":myElement=monitor;break;
            case "mKesfedin":myElement = mKesfedin;break;
            case "monitor2":myElement = monitor2;break;
            case "W90SatinAl":myElement=WD90SatinAl;break;
        }
        actionFunction(myElement);
    }
}
