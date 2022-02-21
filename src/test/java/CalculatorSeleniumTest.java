/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author fcastillo
 */
public class CalculatorSeleniumTest {

  private static WebDriver webDriver;

  @BeforeClass
  public static void setUpClass() {
    System.setProperty("webdriver.gecko.driver", "/home/fcastillo/geckodriver");
    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    capabilities.setCapability("marionette", true);
    capabilities.setAcceptInsecureCerts(false);
    webDriver = new FirefoxDriver();
    webDriver.get("http://localhost:8080/jsf-selenium-test");
  }



  @AfterAll
  public static void tearDownClass() {
    webDriver.quit();
  }

  @BeforeEach
  public void setUp() {

    setValue("form:param1", "6");
    setValue("form:param2", "1");
  }

  private void setValue(String id, String value) {
    System.out.println("Valor: " + value);
    WebElement element = webDriver.findElement(By.id(id));
    element.clear();
    element.sendKeys(value);
  }

  @Test
  public void testAdd() {
    webDriver.findElement(By.id("form:sumar")).click();
    String textResult = webDriver.findElement(By.id("form:resultado")).getText();
    System.out.println("Resultado: " + textResult);
    int result = Integer.parseInt(textResult);
    assertEquals(7.0, result, 0);
  }
}
