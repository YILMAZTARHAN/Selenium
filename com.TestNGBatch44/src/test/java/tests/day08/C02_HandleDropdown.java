package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class C02_HandleDropdown {
    WebDriver driver;


    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test
    public void dropdownTesti() throws InterruptedException {
        //Dropdown'da var olan seçeneklerden birini seçmek için
        //1.adım Dropdown webelementi locate edip bir değişkene atıyoruz
        driver.get("https://www.amazon.com");
        WebElement dropdownElementi=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        //2.adım:Select class'ından bir obje oluşturalım
        Select select=new Select(dropdownElementi);

        //3.adım select objesini kullanarak,Select class'ından var olan 3 seçim method'undan
        //istediğimizi kullanarak dropdown'da var olan option'lardan birini seçebiliriz
        // seçim yapmamıza yardım eden bu 3 method void'dir dolayısıyla bize bir şey döndürmezler

        select.selectByIndex(3);

        //eğer seçtiğimiz option değerini yazdırmak istersek
        System.out.println(select.getFirstSelectedOption().getText());//Baby
        Thread.sleep(3000);
        select.selectByVisibleText("Deals");
        Thread.sleep(3000);

        select.selectByValue("search-alias=arts-crafts-intl-ship");

        List<WebElement>optionList=select.getOptions();
        for (WebElement each:optionList)

              {
                  System.out.println(each.getText());
        }

    }

@AfterMethod
    public void teardown(){
        driver.close();
}
}
