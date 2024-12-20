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
public class SipclubTest {
    private WebDriver driver;
    private String baseUrl;
    
    public SipclubTest() {
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
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        
    }
    @Test
    public void testSipclubTestCase() throws Exception {
    driver.get("https://www.panerabread.com/en-us/home.html");
   driver.manage().window().maximize();
    Thread.sleep(5000);
    driver.findElement(By.id("iw-main-content")).click();
    driver.findElement(By.id("top")).click();
    //driver.get("https://www.panerabread.com/en-us/mypanera/subscription.html");
    Thread.sleep(3000);
    driver.close();
  }
}
