package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C05_YoutubeTesti {
    //1) Bir class oluşturun: YoutubeAssertions
    //2) https://www.youtube.com adresine gidin
    //3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void titleTest(){
        //    ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
        String titleElement=driver.getTitle();
        String actuelTitle="YouTube";
        Assert.assertTrue(actuelTitle.contains(titleElement));
    }
    @Test
    public void imageTest(){
        //    ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        WebElement imageElement=driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-logo'])[1]"));
        Assert.assertTrue("Youtube logosu gozukmedi",imageElement.isDisplayed());
    }
    @Test
    public void searchBoxTest(){
        //     ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement searchBoxElement=driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue("Search Box goruntulenmedi",searchBoxElement.isEnabled());
    }
    @Test
    public void wrongTitleTest(){
        //    ○ wrongTitleTest  => Sayfa basliginin “youtube” olmadigini dogrulayin
        String actualYoutubeTitle=driver.getTitle();
        String expectedYoutubeTitle="youtube";
        Assert.assertFalse("Sayfa basligi youtube'dir",actualYoutubeTitle.contains(expectedYoutubeTitle));
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }
}
