


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class PurchasingProduct 
{
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;

@Before
public void setUp() 
{
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}

@After
public void tearDown() {
 driver.quit();
}

@Test
public void BuyingProduct() 
{
 driver.get("http://automationpractice.com/index.php");
 
 
 driver.manage().window().setSize(new Dimension(1180, 776));
 
 driver.findElement(By.linkText("Sign in")).click();
 
 driver.findElement(By.id("email")).click();
 
 driver.findElement(By.id("email")).sendKeys("test@testingemail.com");   // Logging in
 
 driver.findElement(By.id("passwd")).click();
 
 driver.findElement(By.id("passwd")).sendKeys("abcd123");
 
 driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
 
 driver.findElement(By.cssSelector("#columns > .row:nth-child(3)")).click();
 
 driver.findElement(By.cssSelector(".logo")).click();
 
 driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(1) .button:nth-child(1) > span")).click();
 
 driver.findElement(By.cssSelector(".layer_cart_overlay")).click();
 
 driver.findElement(By.cssSelector(".shopping_cart > a")).click();
 
 driver.findElement(By.cssSelector(".standard-checkout > span")).click();
 
 driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
 
 driver.findElement(By.id("cgv")).click();
 
 driver.findElement(By.cssSelector(".standard-checkout > span")).click();
 
 driver.findElement(By.linkText("Pay by bank wire (order processing will be longer)")).click();   // Pay by bank wire 
 
 driver.findElement(By.cssSelector("#cart_navigation span")).click();

}


}
