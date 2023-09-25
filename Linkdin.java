package demo;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Linkdin {
  

    WebDriver driver =null;
    public Linkdin()
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

    
    public  void testCase02() throws InterruptedException{
        System.out.println("Start Test case: LinkdinTestcase");
        
// Enter URL  https://in.linkedin.com/
       driver.get("https://in.linkedin.com/");
// Locate username textbox Using Locator "ID" session_key
// Enter username using send keys  sendKeys("novnikhil");
       driver.findElement(By.xpath("(//input[@id='session_key'])[1]")).sendKeys("novnikhil");
// Locate password textbox Using Locator "ID" session_password
// Enter password using send keys  sendKeys("12345");
       driver.findElement(By.xpath("(//div[@class='text-input flex'])[2]")).sendKeys("12345");
// Click on Sign In button Using Locator "XPath" //button[@data-id='sign-in-form__submit-btn']
       driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();
// Locate the text 'Who's viewed your profile' and store its count in webelement Using Locator "XPath" //a[contains(@href,'profile-views')]/div/div[2]/span
     int c= driver.findElements(By.xpath("//a[contains(@href,'profile-views')]/div/div[2]/span")).size();
// Store the count in an integer variable count  element.size()

// Locate the text Impressions of your post' and store its count in webelement Using Locator "XPath" //a[contains(@href,'shares')]/div/div[2]/span
// Store the count in an integer variable count  
// Click on image button Using Locator "XPath" //span[text()='Media']
driver.findElement(By.xpath("//span[text()='Media']")).click();
// Click on upload from computer button Using Locator "XPath" //div[@class='media-editor-file-selector__upload-media-button']
driver.findElement(By.xpath("//div[@class='media-editor-file-selector__upload-media-button']")).sendKeys("C:\\Users\\asus\\OneDrive\\Pictures");
// Click on Next button Using Locator "XPath" //span[text()='Next']
driver.findElement(By.xpath("//span[text()='Next']")).click();
// Click on sharing with options Using Locator "XPath" //*[@id="share-to-linkedin-modal__header"]/button
driver.findElement(By.xpath("//*[@id=\"share-to-linkedin-modal__header\"]/button")).click();
// Select Connections only option Using Locator "XPath" //button[@id='CONNECTIONS_ONLY']
driver.findElement(By.xpath("//button[@id='CONNECTIONS_ONLY']")).click();
// Click on Done button Using Locator "XPath" //span[text()='Done']
driver.findElement(By.xpath("//span[text()='Done']")).click();
;// Click on Post button Using Locator "XPath" //span[text()='Post']
driver.findElement(By.xpath("//span[text()='Post']")).click();
;// Click on profile name on left side panel Using Locator "XPath" //a[@class='ember-view block']
driver.findElement(By.xpath("//a[@class='ember-view block']")).click();
// Click on show all posts Using Locator "XPath" //span[text()='Show all posts']
driver.findElement(By.xpath("//span[text()='Show all posts']")).click();
// Check if post is displayed Using Locator "XPath" //div[@class='pv0 ph5'].isDisplayed()
WebElement display= driver.findElement(By.xpath("//div[@class='pv0 ph5']"));
if(display.isDisplayed()){
  System.out.println("posted successfully");
}
        
        
        }
      }