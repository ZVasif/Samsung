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
    //************************** Common locators **************************//
    @FindBy(xpath = "//span[text()='Samsung']")
    private WebElement messageSamsung;
    @FindBy(xpath = "//*[@href='#delete-bold']")
    private WebElement cookie;

    //**************************  Navigate  **************************//
    @FindBy(xpath = "//*[@data-index=\"4\"]")
            private WebElement IT;
    @FindBy(xpath = "//*[@an-la=\"it:monitors:discover monitors\"]")
    private WebElement ekranlar;
    @FindBy(xpath = "(//div[contains(@class,'product-name-text-inner')]/span)[9]")
    private WebElement ultraGenis;
    @FindBy(xpath = "//*[contains(@aria-label,'Odyssey G5 34')]")
            private WebElement monitor;
    @FindBy(className = "pd-option-selector__main-text")
            private WebElement message34;

    //**************************  Smart Things  **************************//
    @FindBy(xpath = "(//*[contains(text(),'SmartThings')])[2]")
            private WebElement smartThingsTitle;
    @FindBy(xpath = "//*[text()='Uygulama']")
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
    @FindBy(xpath = "(//*[contains(text(),'Aksesuarlar')])[4]")
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

    @FindBy(xpath = "//*[contains(text(),'Kavisli Monitör')]")
    private WebElement zbeklev;
    @FindBy(xpath = "(//*[contains(text(),'Kavisli Monitör')])[2]")
    private WebElement kavisli;
    @FindBy(xpath = "//*[text()='Ekran Boyutu']")
    private  WebElement screenSize;
    @FindBy(xpath = "//*[@for=\"checkbox-series04o04\"]")
    private WebElement inc;
    @FindBy(xpath = "//*[text()='Görüntü Çözünürlüğü']")
    private WebElement resolution;
    @FindBy(css = "[for=\"checkbox-series02z02\"]")
    private WebElement HD;
    @FindBy(xpath = "//*[contains(text(),'Odyssey G5 34')]")
    private WebElement odessey;
    @FindBy(xpath = "//*[@class='pd-option-selector__main-text']")
    private WebElement messageInc;
    @FindBy(css = "[aria-label=\"Destek\"]")
    private WebElement destek;
    @FindBy(xpath = "//*[contains(text(),'Daha Fazla ')]")
    private WebElement desteyeGit;
    @FindBy(css = "[class='support-product-hero__product-name']")
    private WebElement messageOdessey;
    //************************** The Live Chat  **************************//

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

    //***************  Warranty Period  *****************//
    @FindBy(css = "[an-la=\"support\"]")
    private WebElement destekBtn;
    @FindBy(xpath = "(//*[contains(text(),'Garanti Bilgileri')])[2]")
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

    //**************************  Hafıza Depolama  **************************//
    @FindBy(xpath="//*[contains(@an-la,'see all')]")
    private WebElement TumunuGor;
    @FindBy(xpath="(//*[text()='SSD'])[3]")
    private WebElement SSD;
    @FindBy(xpath = "//*[text()='2 TB ~']")
            private WebElement TB2;
    @FindBy(xpath = "(//*[@data-modelname=\"MZ-77Q4T0\"])[6]")
            private WebElement product;
    @FindBy(linkText = "NEREDEN ALINIR")
            private WebElement nereden;
    @FindBy(xpath = "(//button[@class='layer-popup__close'])[13]")
            private WebElement close1;
    @FindBy(xpath = "(//button[@class='layer-popup__close'])[14]")
    private WebElement close2;
    //***********************************************************************//

    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            //**************************  Aksesuarlar  **************************//
            case "sendProduct":myElement=sendProduct;break;

        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick (String strElement){
        switch (strElement){
            //**************************  Common  **************************//
            case "cookie":myElement=cookie;break;
            //**************************  Navigate  **************************//
            case "ekranlar":myElement=ekranlar;break;
            case "ultraGenis":myElement=ultraGenis;break;
            //**************************  Aksesuarlar  **************************//
            case "aksesuarlar":myElement=aksesuarlar;break;
            case "searchBox":myElement=searchBox;break;
            case "tab8":myElement=tab8;break;
            case "buy":myElement=buy;break;
            case "addTo":myElement=addTo;break;
            case "goTo":myElement=goTo;break;
            case "delete":myElement=delete;break;
            //**************************  Kavisli Monitor  **************************//
            case "screenSize":myElement=screenSize;break;
            case "inc":myElement=inc;break;
            case "resolution":myElement=resolution;break;
            case "HD":myElement=HD;break;
            case "odessey":myElement=odessey;break;
            case "destek":myElement=destek;break;
            //**************************  Smart Things  **************************//
            case "gPlayStore":myElement=gPlayStore;break;
            case "aAppStore":myElement=aAppStore;break;

            case "close":myElement=close;break;
            //case "destekBtn":myElement=destekBtn;break;
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

            //------------HafizaDepolama-----------------
            case "TumunuGor":myElement=TumunuGor;break;
            case "SSD":myElement=SSD;break;
            case "TB2":myElement=TB2;break;
            case "product":myElement=product;break;
            case "nereden":myElement=nereden;break;
            case "close1":myElement=close1;break;
            case "close2":myElement=close2;break;


        }
        clickFunction(myElement);
    }

    public void findAndContainsText (String strElement,String text){
        switch (strElement){
            case "messageSamsung":myElement=messageSamsung;break;
            //**************************  Navigate  **************************//
            case "message34":myElement=message34;break;
            //**************************  Aksesuarlar  **************************//
            case "messageEmpty":myElement=messageEmpty;break;
            //**************************  Kavisli  **************************//
            case "messageInc":myElement=messageInc;break;
            case "messageOdessey":myElement=messageOdessey;break;
            //**************************  Smart Things  **************************//
            case "verifyPlayStore":myElement=verifyPlayStore;break;
            case "verifyAppStore":myElement=verifyAppStore;break;

            case "assert1":myElement=assert1;break;
            case "verify1":myElement=verify1;break;



        }
        verifyContainsText(myElement,text);
    }

    public void actionAndClick (String strElement){
        switch (strElement){
            //**************************  Common  **************************//
            case "IT":myElement=IT;break;
            //**************************  Navigate  **************************//
            case "monitor":myElement = monitor;break;
            //**************************  Kavisli  **************************//
            case "kavisli":myElement=kavisli;break;
            case "desteyeGit":myElement=desteyeGit;break;
            //************************** Smart Things **************************//
            case "smartThingsTitle":myElement = smartThingsTitle;break;
            case "appsAndProductsTitle":myElement = appsAndProductsTitle;break;
            //************************** Warranty Period **************************//
            case "destekBtn":myElement=destekBtn;break;


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

