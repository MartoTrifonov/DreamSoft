package DreamSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DreamSoft {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

//    @Test
//    public void testCaseOne() {
//        driver.get("https://mind-wend-913065.framer.app/pricing");
//        WebElement currencySymbolElement = driver.findElement(By.id("$"));
//        String currency = currencySymbolElement.getText();
//        Assert.assertEquals(currency, "$");
//
//        driver.close();
//    }


    @Test
    public void testCaseOne() {
        driver.get("https://mind-wend-913065.framer.app/pricing");
        List<WebElement> faqSectionElement = driver.findElements(By.cssSelector(".framer-eabl6y"));
        int faqElementCount = faqSectionElement.size();
        if (faqElementCount == 4) {
            System.out.println("The FAQ section contains exactly 4 elements.");
        } else {
            System.out.println("The FAQ section does not contain exactly 4 elements.");
        }

        driver.close();
    }

    @Test
    public void testCaseTwo() {
        driver.get("https://mind-wend-913065.framer.app/components");
        WebElement visitButtonElement = driver.findElement(By.cssSelector(".framer-1xad8og"));
        if (visitButtonElement.isDisplayed()) {
            System.out.println("The 'Visit' button is visible.");
        } else {
            System.out.println("The 'Visit' button is not visible.");
        }

        driver.close();
    }

    @Test
    public void testCaseThree() {
        driver.get("https://mind-wend-913065.framer.app/");
        WebElement updatesLink = driver.findElement(By.cssSelector(".framer-7hrpx3-container"));
        updatesLink.click();
        String expectedUrl = "https://mind-wend-913065.framer.app/updates";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Test passed: Clicking on Updates link navigated to the Updates page.");
        } else {
            System.out.println("Test failed: Clicking on Updates link did not navigate to the Updates page.");
        }

        driver.quit();
    }

//    @Test
//    public void testCaseFour() {
//        driver.get("https://mind-wend-913065.framer.app/");
//        WebElement clickToViewIn3DButton = driver.findElement(By.cssSelector(".framer-8nn08p"));
//        clickToViewIn3DButton.click();
//        WebElement threeDView = driver.findElement(By.xpath("//canvas[@class='canvas']"));
//        if (threeDView.isDisplayed()) {
//            System.out.println("Test passed: 3D view loaded successfully.");
//        } else {
//            System.out.println("Test failed: 3D view did not load.");
//        }
//
//        // Close the browser window
//        driver.quit();
//    }




}
