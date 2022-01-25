package tests.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class C04_DropDown {

    //● Bir class oluşturun: C3_DropDownAmazon
    //● https://www.amazon.com/ adresine gidin.
    //- Test 1
    //    Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin

    WebDriver driver;
    WebElement dropdownElementi;
    WebElement aramaKutusu;
    Select select;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
    }

@Test
    public void test1(){
    //● https://www.amazon.com/ adresine gidin.

    //- Test 1
    //    Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin
    dropdownElementi=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    Select select=new Select(dropdownElementi);
    List<WebElement>optionListesi=select.getOptions();
    int actualOptionSayisi=optionListesi.size();
    int expectedOptiyonSayisi=45;
    Assert.assertEquals(actualOptionSayisi,expectedOptiyonSayisi);
}
    @Test
    public void test2(){
        //-Test 2
        //	1. Kategori menusunden Books secenegini  secin

        select.selectByVisibleText("Books");
        //	2. Arama kutusuna Java yazin ve aratin
         aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        aramaKutusu.sendKeys("Java" + Keys.ENTER);
        //	3. Bulunan sonuc sayisini yazdirin
        WebElement sonucSayisiElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        //	4. Sonucun Java kelimesini icerdigini test edin

        String actualSonucSayisiYazisi=sonucSayisiElementi.getText();
        String arananKelime="Java";

        Assert.assertTrue(actualSonucSayisiYazisi.contains(arananKelime),"Arama sonucu Java icermiyor");

    }

}


