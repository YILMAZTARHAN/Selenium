package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {

    // ...Exercise3...

//fill the firstname
//fill the firstname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button
    public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
   driver.get("https://www.techlistic.com/p/selenium-practice-form.html");



  driver.findElement(By.name("firstname")).sendKeys("seyfullah");
  driver.findElement(By.name("lastname")).sendKeys("M");
  driver.findElement(By.id("sex-0")).click();
  driver.findElement(By.id("exp-1")).click();
  driver.findElement(By.id("datepicker")).sendKeys("10/04/2019");
  driver.findElement(By.id("profession-1")).click();
  WebElement prf=driver.findElement(By.id("tool-2"));
  prf.click();
  prf.sendKeys(Keys.PAGE_DOWN);
  driver.findElement(By.className("btn btn-info")).click();






    }










}
