package day27_passByValue_immutableClass;

import java.util.ArrayList;
import java.util.List;

public class C04_mutableImmutableClasses {

        public static void main(String[] args) {
            /*
            mutable; susturalabilir yani degişitrilebilir ama
            immutable; susturulamaz yani değiştirilemez.
            yani immutable ler degişitrilemez ve yeni deger atanamz.

             */

            //string ler ımmutable dır yani, degiştiirlemzler. ama list ve array gibi obje ler mutable dır yani degişit
            //bilirler.yani string de method çalıştırmak orjınal strıng ı degişitrimezken, list de ise method çalıştrımak
            //orjinal list i degişitriyr.

            //String isim="Ali";//jaava gitti stack memory de isim variable ı oluşturdu ve sonra heap memory de de "Ali"
            //objesini oluşturarak onu point ederek işaret etti. Sonradan isim ariable ına biz Veli objesini atar isek
            //o pointer artık Ali yi gostermeyecek Veli yi gösterercektir.artık ali yi işaret eden hiçnbir pointer yok.
            //boşta kalır.
            //sonradan iism variable ına hasan objesini atarsak bu sefer veli den gider bu pointer onun yerine artık
            //hasan işaret edilir. ve artık boşta gezen iki obje miz oldu cve bunlar belli aralıklarla çöpçüler tara
            //fınan temizlenirler.

            String isim="Ali Can";

            isim.toUpperCase();//String degişmedi
            isim.substring(3,5);//strşng değişmedi
            System.out.println(isim);//kontrol ettik ve değişmedini gorduk. "Ali Can"

            //ama list de durum bole degil
            List<Integer> sayilar=new ArrayList<>();
            sayilar.add(10);
            sayilar.add(20);
            sayilar.add(30);//methodları çalıştırdım ve List i degiştridim.

            System.out.println(sayilar);//[10, 20, 30]

        }

}
