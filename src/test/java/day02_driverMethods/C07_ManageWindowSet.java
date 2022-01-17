package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C07_ManageWindowSet {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfayi simge durumuna getirin
        driver.manage().window().setPosition(new Point(10,10));
        driver.manage().window().setSize(new Dimension(300,500));

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        int xKoordinati=driver.manage().window().getPosition().getX();
        int yKoordinati=driver.manage().window().getPosition().getY();
        int genislik=driver.manage().window().getSize().getWidth();
        int yukseklik=driver.manage().window().getSize().getHeight();

        Thread.sleep(3000);

        if (xKoordinati==0 && yKoordinati==0 && genislik==300 && yukseklik==500){
            System.out.println("Olceklendirme testi PASS");
        }else
        {
            System.out.println("Olceklendirme testi FAILED");
        }

        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        //7. Sayfayi fullscreen yapin
        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        //8. Sayfayi kapatin

        driver.close();
    }




}
