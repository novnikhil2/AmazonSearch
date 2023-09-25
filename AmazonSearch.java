package demo;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch  {
     // ChromeDriver driver;
     WebDriver driver =null;
    public AmazonSearch()
    {
      
         System.out.println("Constructor: TestCases");
         WebDriverManager.chromedriver().timeout(30).setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("amazon");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        boolean status=driver.findElement(By.xpath("//a[contains(@href,'amazon.in')or contains(@href,'amazon.com')]")).isDisplayed();
        if(status)
        {
        System.out.println(status);
        }
    }
  
}
