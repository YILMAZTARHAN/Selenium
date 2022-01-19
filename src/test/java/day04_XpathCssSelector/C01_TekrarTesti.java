package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//    amazon web sayfasına gidin. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

//    b. Search(ara) kutusuna git aramaya “city bike” yazın
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+Keys.ENTER);
        //aramaKutusu.submit();İstersek keys.Enter yerine bu satırıda yazabiliriz

//    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucYazisiElementi=driver.findElement(By.className("sg-col-inner"));
       // WebElement sonucYazisiElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYazisiElementi.getText());

//    d. “Shopping” e tıklayın.
//    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

       /* WebElement ilkUrunResmi=driver.findElement(By.className("s-image"));
        ilkUrunResmi.click();*/

        // sadece click yapmak gibi basit bir işlemde kullanacağımız webelementler için
        // variable oluşturmadan direk locate edip, istediğimiz işlemi yapabiliriz
        driver.findElement(By.className("s-image")).click();







    }

}


