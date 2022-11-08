package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;

public class WarrantyPeriodCheckSteps {

    DialogContent dc=new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @Given("Go to Samsung support page")
    public void goToSamsungSupportPage() {
        dc.findAndClick("destekBtn");
    }

    @And("Click on LEARN MORE to see warranty terms")
    public void clickOnLEARNMOREToSeeWarrantyTerms() {
//        dc.findAndClick("garantiDahaFazlaBtn");
        wait.until(ExpectedConditions.visibilityOf(dc.getMyElement("garantiDahaFazlaBtn"))).click();
    }

    List<WebElement> urunisim;
    List<WebElement> urunGarantiSuresi;

    @And("Compare the warranty period of mobile devices with data")
    public void compareTheWarrantyPeriodOfMobileDevicesWithData() {
        dc.findAndClick("mobilCihazBtn");
        urunisim = GWD.getDriver().findElements(By.cssSelector("div[class='warranty-card-info__inner'] strong[class='warranty-card-info__name']"));
        urunGarantiSuresi = GWD.getDriver().findElements(By.cssSelector("div[class='warranty-card-info__inner'] span span"));

        Assert.assertEquals(urunisim.get(0).getText(),"Cep Telefonu");
        Assert.assertEquals(urunisim.get(1).getText(),"Tablet");
        Assert.assertEquals(urunisim.get(2).getText(),"Giyilebilir Ürünler");
        Assert.assertEquals(urunGarantiSuresi.get(0).getText(),"24");
        Assert.assertEquals(urunGarantiSuresi.get(1).getText(),"24");
        Assert.assertEquals(urunGarantiSuresi.get(2).getText(),"24");

    }

    @And("Compare the warranty period of TV and Lighting devices with the data")
    public void compareTheWarrantyPeriodOfTVAndLightingDevicesWithTheData() {
        dc.findAndClick("tvVeAydinlatmaBtn");

        Assert.assertEquals(urunisim.get(3).getText(),"Televizyon");
        Assert.assertEquals(urunGarantiSuresi.get(3).getText(),"24");
        Assert.assertEquals(urunisim.get(4).getText(),"Blue Ray Oynatıcı");
        Assert.assertEquals(urunGarantiSuresi.get(4).getText(),"24");
        Assert.assertEquals(urunisim.get(5).getText(),"Ev Sinema Sistemi");
        Assert.assertEquals(urunGarantiSuresi.get(5).getText(),"24");

    }

    @And("Compare the warranty period of WHITE GOODS with the data")
    public void compareTheWarrantyPeriodOfWHITEGOODSWithTheData() {
        dc.findAndClick("beyazEsyaBtn");

        Assert.assertEquals(urunisim.get(6).getText(),"Buzdolabı");
        Assert.assertEquals(urunGarantiSuresi.get(6).getText(),"36");
        Assert.assertEquals(urunisim.get(7).getText(),"Bulaşık Makinesi");
        Assert.assertEquals(urunGarantiSuresi.get(7).getText(),"36");
        Assert.assertEquals(urunisim.get(8).getText(),"Çamaşır Makinesi");
        Assert.assertEquals(urunGarantiSuresi.get(8).getText(),"36");
        Assert.assertEquals(urunisim.get(9).getText(),"Kurutma Makinesi");
        Assert.assertEquals(urunGarantiSuresi.get(9).getText(),"36");
        Assert.assertEquals(urunisim.get(10).getText(),"Mikrodalga Fırın");
        Assert.assertEquals(urunGarantiSuresi.get(10).getText(),"24");
        Assert.assertEquals(urunisim.get(11).getText(),"Ankastre Mikrodalga Fırın");
        Assert.assertEquals(urunGarantiSuresi.get(11).getText(),"24");
        Assert.assertEquals(urunisim.get(12).getText(),"Firin");
        Assert.assertEquals(urunGarantiSuresi.get(12).getText(),"24");
        Assert.assertEquals(urunisim.get(13).getText(),"Elektrik Süpürgesi");
        Assert.assertEquals(urunGarantiSuresi.get(13).getText(),"24");
        Assert.assertEquals(urunisim.get(14).getText(),"Set Üstü Ocak");
        Assert.assertEquals(urunGarantiSuresi.get(14).getText(),"24");
        Assert.assertEquals(urunisim.get(15).getText(),"Davlumbaz");
        Assert.assertEquals(urunGarantiSuresi.get(15).getText(),"24");
        Assert.assertEquals(urunisim.get(16).getText(),"Bireysel Tip Klimalar (RAC)");
        Assert.assertEquals(urunGarantiSuresi.get(16).getText(),"36");
        Assert.assertEquals(urunisim.get(17).getText(),"Sistem Klimaları (Ticari Tip Klimalar)");
        Assert.assertEquals(urunGarantiSuresi.get(17).getText(),"24");

    }

    @And("Compare the warranty period of COMPUTER AND OFFICE devices with the data")
    public void compareTheWarrantyPeriodOfCOMPUTERANDOFFICEDevicesWithTheData() {
        dc.findAndClick("bilgisayarVeOfisBtn");

        Assert.assertEquals(urunisim.get(18).getText(),"Monitör");
        Assert.assertEquals(urunGarantiSuresi.get(18).getText(),"24");

    }

    @And("Compare the warranty period of CAMERA AND VIDEO CAMERA devices with data")
    public void compareTheWarrantyPeriodOfCAMERAANDVIDEOCAMERADevicesWithData() {
        dc.findAndClick("kameraVeVideoKameraBtn");

        Assert.assertEquals(urunisim.get(19).getText(),"Fotoğraf Makinesi");
        Assert.assertEquals(urunGarantiSuresi.get(19).getText(),"24");
        Assert.assertEquals(urunisim.get(20).getText(),"Kamera");
        Assert.assertEquals(urunGarantiSuresi.get(20).getText(),"24");

    }

    @And("Compare the warranty period of the STORAGE devices with the data")
    public void compareTheWarrantyPeriodOfTheSTORAGEDevicesWithTheData() {
        dc.findAndClick("depolamaBtn");

        Assert.assertEquals(urunisim.get(21).getText(),"Hafıza Kartları");
        Assert.assertEquals(urunGarantiSuresi.get(21).getText(),"120");
        Assert.assertEquals(urunisim.get(22).getText(),"USB Bellek");
        Assert.assertEquals(urunGarantiSuresi.get(22).getText(),"60");
        Assert.assertEquals(urunisim.get(23).getText(),"Taşınabilir SSD");
        Assert.assertEquals(urunGarantiSuresi.get(23).getText(),"36");
        Assert.assertEquals(urunisim.get(24).getText(),"Katı Hal Sürücüleri (SSD)");
        Assert.assertEquals(urunGarantiSuresi.get(24).getText(),"60");

    }
}
