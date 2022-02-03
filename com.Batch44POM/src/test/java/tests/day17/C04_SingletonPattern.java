package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_SingletonPattern {

    @Test
    public void test01(){


        //Singleton pattern:Bir class'dan birden fazla obje üretilmesine
        //izin vermeyen bir pattern olarak kabul görmüştür

        //Biz driver class'ını driver üretmek üzere kullanıyoruz
        //ancak driver class'ında driver isminde bir instance veriable da ver
        //ve biz obje üreterek bu intence veriable'ye ulaşabilirz

      //  Driver driver1=new Driver();

       // Driver drive2=new Driver();

       // Driver drive3=new Driver();

        // Singleton pattern kabul gormus bir pattern'dir
        // amac bir class'dan obje uretilmemesini saglamaktir
        // bunun icin singleton patter'de koruyacagim,iz class'da
        // parametresiz bir constructor olusturur ve
        // bu constructor'i private yapariz

    }


}
