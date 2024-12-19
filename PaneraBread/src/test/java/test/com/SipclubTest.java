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
        driver.close();
    }
    @Test
    public void testSipclubTestCase() throws Exception {
    driver.get("https://www.panerabread.com/en-us/home.html?utm_medium=cpc&utm_source=google&utm_campaign=Gold-US-BR&utm_content=Gold&utm_term=panera%20bread&ef_id=CjwKCAiAgoq7BhBxEiwAVcW0LN1yBiP0Mat9Xja6QQ8CseNV1aZU2xfLjnr0YmnT_k-NOb5CwgbL9BoCScAQAvD_BwE%3AG%3As&s_kwcid=AL%2115596%213%21695621322865%21e%21%21g%21%21panera%20bread%2119966289160%21148056040077&gad_source=1&gclid=CjwKCAiAgoq7BhBxEiwAVcW0LN1yBiP0Mat9Xja6QQ8CseNV1aZU2xfLjnr0YmnT_k-NOb5CwgbL9BoCScAQAvD_BwE");
    driver.findElement(By.xpath("//div[@id='iw-main-content']/div/header/div[2]/div/div/div/button/span/span")).click();
    driver.findElement(By.linkText("Sip Club")).click();
    driver.get("https://www.panerabread.com/en-us/mypanera/subscription.html");
  }
}
