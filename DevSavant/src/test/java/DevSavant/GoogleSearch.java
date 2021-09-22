package DevSavant;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearch {

    @Test
    public void google_Search()
    {
        //WebDriver driver;
        //driver = new FirefoxDriver();
        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // 1. Navigate to '{{ApplicationURL}}'
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        // 2. Type 'Devsavant' in 'q'
        WebElement inputGoogleSearch = driver.findElement(By.name("q"));
        inputGoogleSearch.sendKeys("Devsavant");

        // 3. Click 'btnI'
        WebElement btnFeelingLucky = driver.findElement(By.name("btnI"));
        btnFeelingLucky.click();

        // 4. Is 'VIDEO' visible?
        WebElement video = driver.findElement(By.name("//video"));
       video.isDisplayed();


        // 5. Click 'VIDEO'
        video.click();




        //Wait until the google page shows the result
        //WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

        //List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));

    }



}


