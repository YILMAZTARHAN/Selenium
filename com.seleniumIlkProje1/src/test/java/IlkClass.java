ines (9 sloc)  354 Bytes

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.get("http://www.amazon.com");

    }



}