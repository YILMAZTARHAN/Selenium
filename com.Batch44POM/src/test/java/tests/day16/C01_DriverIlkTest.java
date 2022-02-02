package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

    //Driver Class sayasinde bizim eski driver öldü
    //artık driver'a ihtiyaç varsa Driver.getDriver() yazacağız.

    @Test
    public void test01(){
        //amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //amazona gittiğimizi test edelim

        String actualTitle=Driver.getDriver().getTitle();
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualTitle.contains("Amazon"));

        // Driver.getDriver() method'u her calistiginda
        // driver = new ChromeDriver(); komutundan oturu yeni bir driver olusturuyor
        // Biz Driver class'dan getDriver()'i ilk calistirdigimizda new atamasi olsun
        // sonraki calismalarda atama olmasin istiyoruz
        // bunun icin driver = new ChromeDriver(); satirni bir if blogu icine aliriz
        Driver.closeDriver();

    }
    @Test
    public void test02(){

        //bestby anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");

        //bestbuy'a gittiğimizi tes edelim
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();
    }





}
