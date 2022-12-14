package Pages;

import Utilites.GWD;
import org.openqa.selenium.JavascriptExecutor;
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

    //**************************  Smart Things  **************************//
    @FindBy(xpath = "(//span[text()='SmartThings'])[1]")
            private WebElement smartThingsTitle;
    @FindBy(xpath = "(//div[2]/ul/li[3]/a/span)[7]")
            private WebElement appsAndProductsTitle;

    @FindBy(xpath = "//div[2]/div[@class='st-feature-benefit__cta-wrap']/a[1]")
            private WebElement gPlayStore;

    @FindBy(xpath = "//span[text()='SmartThings']")
            private WebElement verifyPlayStore;

    @FindBy(xpath = "//div[2]/div[@class='st-feature-benefit__cta-wrap']/a[2]")
            private WebElement aAppStore;

    @FindBy(xpath = " //h1[text()='SmartThings']")
            private WebElement verifyAppStore;

    //**************************  Aksesuarlar  **************************//

    @FindBy(xpath = "//*[text()='Aksesuarlar']")
    private WebElement aksesuarlar;
    @FindBy(xpath = "//div[@class='sr03-acc-pcd-search__inner']/button")
    private WebElement searchBox;
    @FindBy(xpath = "//div[@class='sr03-acc-pcd-search__input-field']/input")
    private WebElement sendProduct;
    @FindBy(xpath = "//*[@data-modelname=\"ef-bx900\"]")
    private WebElement tab8;
    @FindBy(xpath = "//*[text()='SATIN AL']")
    private WebElement buy;
    @FindBy(xpath = "(//*[contains(text(),' SEPETE EKLE')])[2]")
    private WebElement addTo;
    @FindBy(xpath = "(//*[contains(text(),'Git')])[2]")
    private WebElement goTo;
    @FindBy(xpath = "(//*[@class='icon-bin'])[2]")
    private WebElement delete;
    @FindBy(xpath = "//*[contains(@class,'line-height-1')]")
    private WebElement messageEmpty;
    @FindBy(xpath = "(//div[contains(@class,'h-100')]/button)[1]")
    private WebElement close;

    //**************************  Kavisli Monitor  **************************//

    @FindBy(xpath = "//*[contains(text(),'Kavisli Monit??r')]")
    private WebElement zbeklev;
    @FindBy(xpath = "//*[contains(text(),'Kavisli Monit??r')]")
    private WebElement kavisli;
    @FindBy(xpath = "//*[@for=\"checkbox-series04o04\"]")
    private WebElement inc;
    @FindBy(xpath = "//*[contains(text(),'Odyssey G3 27??? 1')]")
    private WebElement odessey;
    @FindBy(xpath = "(//*[@class='pd-option-selector__main-text'])[2]")
    private WebElement message27;
    @FindBy(css = "[aria-label=\"Destek\"]")
    private WebElement destek;
    @FindBy(xpath = "//*[@class='cta-wrap']/a")
    private WebElement desteyeGit;
    @FindBy(css = "[class='support-product-hero__product-name']")
    private WebElement messageOdessey;

    //************************** The Live Chat  ************************//

    @FindBy(css = "iframe[name='spr-chat__proactive-frame']")
    public WebElement frame;
    @FindBy(css = "div>p[style^='margin']")
    public WebElement helpcentervisibil;
    @FindBy(xpath = "//div[text()='Destek']")
    public WebElement clickDestek;
    @FindBy(css = "div>h2[class$='ehk9cno8']")
    public WebElement assert1;
    @FindBy(xpath = "(//*[@class='footer-category__item'])[19]")
    public WebElement WhatsAppSupport;
    @FindBy(css = "[class='_9vcv _advm _9scb']")
    public WebElement clickinwhatsappicon;
    @FindBy(xpath = "//span[text()='use WhatsApp Web']")
    public WebElement clickusetheWebWhatsApp;
    @FindBy(xpath = "//div[text()='To use WhatsApp on your computer:']")
    public WebElement verify1;

    //***************  Warranty Period   *****************//

    @FindBy(xpath = "(//a[text()='Destek'])[2]")
    private WebElement destekBtn;
    @FindBy(xpath = "(//a[@aria-label='DAHA FAZLA B??LG?? ED??N'])[1]")
    private WebElement garantiDahaFazlaBtn;
    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[1]")
    private WebElement mobilCihazBtn;
    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[2]")
    private WebElement tvVeAydinlatmaBtn;
    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[3]")
    private WebElement beyazEsyaBtn;
    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[4]")
    private WebElement bilgisayarVeOfisBtn;
    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[5]")
    private WebElement kameraVeVideoKameraBtn;
    @FindBy(xpath = "(//ul[@class='warranty-card-info__tab-list']/li)[6]")
    private WebElement depolamaBtn;

    //**************************  Haf??za Depolama  **************************//
    @FindBy(xpath="//*[text()='Haf??za / Depolama']")
    private WebElement hafizaDepolama;

    @FindBy(xpath="//a[@an-la='memory storage:see all']")
    private WebElement hafizaDepolamaTumunuGor;

    @FindBy(xpath="//input[@an-la='filter:type:memory-card']")
    private WebElement filterMemoryCard;
    //***********************************************************************//

    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "sendProduct":myElement=sendProduct;break;


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
            case "gPlayStore":myElement=gPlayStore;break;
            case "aAppStore":myElement=aAppStore;break;
            case "aksesuarlar":myElement=aksesuarlar;break;
            case "searchBox":myElement=searchBox;break;
            case "tab8":myElement=tab8;break;
            case "buy":myElement=buy;break;
            case "addTo":myElement=addTo;break;
            case "goTo":myElement=goTo;break;
            case "delete":myElement=delete;break;
            case "close":myElement=close;break;
            case "destekBtn":myElement=destekBtn;break;
            case "garantiDahaFazlaBtn":myElement=garantiDahaFazlaBtn;break;
            case "mobilCihazBtn":myElement=mobilCihazBtn;break;
            case "tvVeAydinlatmaBtn":myElement=tvVeAydinlatmaBtn;break;
            case "beyazEsyaBtn":myElement=beyazEsyaBtn;break;
            case "bilgisayarVeOfisBtn":myElement=bilgisayarVeOfisBtn;break;
            case "kameraVeVideoKameraBtn":myElement=kameraVeVideoKameraBtn;break;
            case "depolamaBtn":myElement=depolamaBtn;break;
            //------------orcun112-----------------
            case "helpcentervisibil":myElement=helpcentervisibil;break;
            case "clickDestek":myElement=clickDestek;break;
            case "WhatsAppSupport":myElement=WhatsAppSupport;break;
            case "clickinwhatsappicon":myElement=clickinwhatsappicon;break;
            case "clickusetheWebWhatsApp":myElement=clickusetheWebWhatsApp;break;

            //------------Erkan-----------------
            case "hafizaDepolama":myElement=hafizaDepolama;break;
            case "hafizaDepolamaTumunuGor":myElement=hafizaDepolamaTumunuGor;break;
            case "filterMemoryCard":myElement=filterMemoryCard;break;





        }
        clickFunction(myElement);
    }

    public void findAndContainsText (String strElement,String text){
        switch (strElement){
            case "messageSamsung":myElement=messageSamsung;break;
            case "message34":myElement=message34;break;
            case "verifyPlayStore":myElement=verifyPlayStore;break;
            case "verifyAppStore":myElement=verifyAppStore;break;
            case "messageEmpty":myElement=messageEmpty;break;
            case "message27":myElement=message27;break;
            case "messageOdessey":myElement=messageOdessey;break;
            case "assert1":myElement=assert1;break;
            case "verify1":myElement=verify1;break;



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
            case "smartThingsTitle":myElement = smartThingsTitle;break;
            case "appsAndProductsTitle":myElement = appsAndProductsTitle;break;
            case "kavisli":myElement=kavisli;break;
            case "inc":myElement=inc;break;
            case "odessey":myElement=odessey;break;
            case "desteyeGit":myElement=desteyeGit;break;
        }
        actionFunction(myElement);
    }

    public WebElement getMyElement(String strElement) {
        switch (strElement){
            case "garantiDahaFazlaBtn":myElement=garantiDahaFazlaBtn;break;

        }
        return myElement;
    }
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

        js.executeScript(scrollElementIntoMiddle, element);
    }
}

