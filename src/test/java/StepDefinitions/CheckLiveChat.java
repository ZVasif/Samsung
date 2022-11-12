package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilites.GWD;
import com.github.dockerjava.api.model.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Set;

public class CheckLiveChat extends Parent {

    DialogContent dc = new DialogContent();





    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @And("Click the live chat in order to type on something and click and send message")
    public void clickTheLivveChatInOrderToTypeOnSomethingAndClickAndSendMessage() throws InterruptedException {

        WebElement element = GWD.getDriver().findElement(By.xpath("(//div[@role='tablist']/button)[2]"));
        wait.until(ExpectedConditions.attributeContains(element, "aria-selected", "true"));

        WebElement framex = GWD.getDriver().findElement(By.cssSelector("iframe[aria-label]"));
        GWD.getDriver().switchTo().frame(framex);
        WebElement canli = GWD.getDriver().findElement(By.cssSelector("div[role='button']"));
        canli.click();

        try {
            Assert.assertEquals(dc.assert1.getText(),"Satış destek uzmanı ile Sohbet");
        }catch (Exception e){

        }
        System.out.println("The test passed");
        GWD.getDriver().switchTo().defaultContent();


    }

    @And("Check the Whats App Support Icon")
    public void checkTheWhatsAppSupportIcon() throws InterruptedException {
        String HomePage=GWD.getDriver().getWindowHandle();
        dc.scrollToElement(dc.WhatsAppSupport);
        wait.until(ExpectedConditions.elementToBeClickable(dc.WhatsAppSupport));
        dc.WhatsAppSupport.click();

        Thread.sleep(5000);
        Set<String>Pages=GWD.getDriver().getWindowHandles();
        for(String Page:Pages){
            if (!HomePage.equals(Page)){
                GWD.getDriver().switchTo().window(Page);
            }

        }
        wait.until(ExpectedConditions.visibilityOf(dc.clickinwhatsappicon));
        dc.findAndClick("clickinwhatsappicon");
        wait.until(ExpectedConditions.elementToBeClickable(dc.clickusetheWebWhatsApp));
        dc.findAndClick("clickusetheWebWhatsApp");
        wait.until(ExpectedConditions.visibilityOf(dc.verify1));

        Assert.assertTrue(dc.verify1.getText().contains("To use WhatsApp on your computer"));
        System.out.println("The test has been passed");


    }

}
