package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
 // Normalde slenium'un kendi IDE'si var fakat biz daha kullanışlı olduğu için intellij kullanıyıruz
  // intelij'de yeni bir proje açtığımızda öncelikle selenium kütüphanelerini projeye eklememiz gerekir
  // biz en ilkel haliyle projemize kütüphaneleri jar dosyalrı olarak yükledik
  // bu eklediğimiz dosyalarla artık driver'in ayarlarını yapabiliriz

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        // setProperty method'u 2 parametre ister
        // ilki kullanacağımız browser'a ait driver
        // ikinci parametre ise selenium sitesinden indirip projemize eklediğimiz chromedriver'in path'i

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);
        // java'dan gelir, içine yazılan milisaniye kadar kodların çalışmasını durdurur

        driver.close();







    }

}
