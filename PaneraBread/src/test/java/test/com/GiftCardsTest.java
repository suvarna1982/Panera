/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author priyalpatel
 */
public class GiftcardsTest {
    
    private WebDriver driver;
    private String baseUrl;
    public GiftcardsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    System.setProperty("webdriver.chrome.driver", "//Users/priyalpatel/Downloads/chromedriver-mac-arm64/chromedriver");
    driver = new ChromeDriver();
    
      System.out.println("Automation completed successfully!");
           
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    driver.quit();
    }
    
    @Test
  public void testGIFTCARD() throws Exception {
    driver.get("https://www.panerabread.com/en-us/home.html");
    driver.manage().window().maximize();

    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//*[@id=\"iw-main-content\"]/div[1]/header/div[2]/div[1]/div/a[2]")).click();
    driver.get("https://www.panerabread.com/en-us/gift-cards.html");
    
    driver.findElement(By.xpath("//*[@id=\"top\"]/section[3]/div/div/div[2]/p[3]/a/img")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"top\"]/div/div/div[1]/div[2]/button")).click();
     Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id=\"egift-card-drawer\"]/div/form/fieldset/div[1]/div/div[2]/div/button[5]")).click();
             Thread.sleep(1000);
             
            WebElement amount = driver.findElement(By.id("amount"));
            amount.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(1000); 
            amount.sendKeys("66.00");
            driver.findElement(By.xpath("//*[@id=\"egift-card-drawer\"]/div/form/fieldset/div[1]/div/div[2]/div[2]/button[2]")).click();
            
            
            
// 4. Scroll till Recipient First Name
            WebElement recipientFirstName = driver.findElement(By.id("recipientFirstName"));
            recipientFirstName.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(1000); // Wait for smooth scrolling

            // 5. Enter "Priyal" in Recipient First Name
            recipientFirstName.sendKeys("Priyal");

            // 6. Scroll till Recipient Last Name
            WebElement recipientLastName = driver.findElement(By.id("recipientLastName"));
            recipientLastName.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(1000);

            // 7. Enter "Patel" in Recipient Last Name
            recipientLastName.sendKeys("Patel");

            // 8. Scroll 1 time
            //recipientLastName.sendKeys(Keys.PAGE_DOWN);
            //Thread.sleep(1000);

            // 9. Enter "emailabc@gmail.com" in Recipient Email
            WebElement recipientEmail = driver.findElement(By.id("email"));
            recipientEmail.sendKeys("emailabc@gmail.com");
            Thread.sleep(1000);


            // 10. Click on Confirm Email
            WebElement confirmEmail = driver.findElement(By.id("confirmEmail"));
            confirmEmail.click();
            Thread.sleep(1000);

            // 11. Enter "emailabc@gmail.com" in Confirm Email
            confirmEmail.sendKeys("emailabc@gmail.com");

            // 12. Scroll till Sender First Name and click on it
            WebElement senderFirstName = driver.findElement(By.id("senderFirstName"));
            senderFirstName.sendKeys(Keys.PAGE_DOWN);
            senderFirstName.click();

            // 13. Enter "Adam" in Sender First Name
            senderFirstName.sendKeys("Adam");

            // 14. Click on Sender Last Name
            WebElement senderLastName = driver.findElement(By.id("senderLastName"));
            senderLastName.click();

            // 15. Enter "Eve" in Sender Last Name
            senderLastName.sendKeys("Eve");

            // 16. Enter "Happy Birthday" in Personal Message
            WebElement personalMessage = driver.findElement(By.id("personalMessage"));
            personalMessage.sendKeys("Happy Birthday");
             Thread.sleep(1000);
            WebElement send = driver.findElement(By.xpath("//*[@id=\"egift-card-drawer\"]/div/form/fieldset/div[3]/div/div[1]/button[1]"));
            send.sendKeys(Keys.PAGE_DOWN);
            // 17. Click on "Send Now"
            WebElement sendNow = driver.findElement(By.xpath("//*[@id=\"egift-card-drawer\"]/div/form/fieldset/div[3]/div/div[1]/button[1]")); // Replace with the actual ID or locator
            sendNow.click();
            Thread.sleep(1000);


            // 18. Click on "Add to Order"
            driver.findElement(By.xpath("//*[@id=\"egift-card-drawer\"]/div/form/fieldset/div[3]/div/div[2]/button")).click(); // Replace with the actual ID or locator
            
            
        }
    }


   

