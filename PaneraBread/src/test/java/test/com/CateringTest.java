/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author adity
 */
public class CateringTest {
  
    private WebDriver driver;
    private String baseUrl;
   
 public CateringTest() {
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
        
        System.setProperty("webdriver.chrome.driver", "C:\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
    @Test
  public void testPaneraCateringTestCase() throws Exception {
    
    driver.get("https://www.panerabread.com/en-us/home.html");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Catering")).click();
    Thread.sleep(3000);
    driver.get("https://catering.panerabread.com/");
    driver.findElement(By.xpath("//nav[@id='bottom-navbar-desktop']/div/div/a/span[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Boxed Lunches")).click();
    driver.findElement(By.cssSelector("div.selector > #quantity-selector > svg.bi-plus-circle-fill.b-icon.bi.cursor-pointer.text-primary > g > path")).click();
    driver.findElement(By.cssSelector("div.selector > #quantity-selector > svg.bi-plus-circle-fill.b-icon.bi.cursor-pointer.text-primary > g > path")).click();
    driver.findElement(By.cssSelector("div.selector > #quantity-selector > svg.bi-plus-circle-fill.b-icon.bi.cursor-pointer.text-primary > g > path")).click();
    driver.findElement(By.cssSelector("div.selector > #quantity-selector > svg.bi-plus-circle-fill.b-icon.bi.cursor-pointer.text-primary > g > path")).click();
    driver.findElement(By.xpath("//div[@id='menu-layout']/div/div[2]/div/div[3]/div/div/div[2]/div/div[2]/div/div[2]/div[3]/button[2]/span[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='national-menu-placard-modal___BV_modal_body_']/div/div/button")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.id("guestLoginDesktop")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("orderTypesWrapper")).click();
    Thread.sleep(3000);
    //driver.findElement(By.name("address")).click();
    //driver.findElement(By.name("address")).clear();
    
    //driver.findElement(By.id("orderProcess")).sendKeys("94533");
    
    //Thread.sleep(3000);
   //driver.findElement(By.id("typeahead-149-8430-option-1")).click();
   //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Fairfield, CA 94533'])[2]/following::span[3]")).click();
     //Thread.sleep(3000);
    
    //driver.get("https://mail.yahoo.com/d/folders/1?reason=invalid_cred");
    //driver.close();
    
  }


}
