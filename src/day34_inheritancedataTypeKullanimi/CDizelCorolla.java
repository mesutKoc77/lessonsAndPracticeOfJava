package day34_inheritancedataTypeKullanimi;

import java.util.ArrayList;
import java.util.List;

public class  CDizelCorolla extends BCorolla{


    String yakit="Dizel";
    String motor="1.4 Dizel Motor";
    String renk="Tanimlanmadi";

    public static void main(String[] args) {

        CDizelCorolla arb1=new CDizelCorolla();

        System.out.println(arb1.motor);//c classından
        System.out.println(arb1.renk);//c tanımlanmadı
        System.out.println(arb1.yakit);//c dizel
        System.out.println(arb1.uretimYeri);//b turkiye
        System.out.println(arb1.marka);//a toyota

        /*
        biz mesela dizel corolla uretimi yapamkk
        istiyoruz fakat ozellik olarak da bcorolla sını
        fındaki özellikleri almal istiyorm.
        bizim ueittmiizi yapan constructor dır ve dolayısıyla
        eşitliğin sagı bizim uretim yapış şeklimizi etkilerken,
        bu uretimi hangi özellikler cervesinde yapacagımzı da
        eşitiliğin solu yanı oluşturlan objenin solundaki yer
        karar veriyr. şöyle ki
         */

        BCorolla corolla=new BCorolla();
        BCorolla arb2=new CDizelCorolla();//yani cdizelcorolla
        //ile uretimi yapıp Bcorolla ile de özelliklerimi belirtiyrm
        //1.55
        System.out.println(arb2.yakit);//B Tanimlanmadı once dataturunun oldugu class a gidecegız ve ordan ozelligimizi cagıracagz.
        System.out.println(arb2.renk);//B Belirtilmedi
        //System.out.println(arb2.motor);data turu olarak seciln BCorolla sınıfında motor variable ı olmaadıgından CTE verir.
        System.out.println(arb2.uretimYeri);//data turumuz BCorolla, dolayısıyla oraya gidecegim ve ozelligimi ordan alacagım
        //B Turkiye

        System.out.println(arb2.marka);//Atoyota dan Toyota yı getirecek.


        /*
        31 ile 32 satıra arasındaki fark
        31. satırdaki obje inheritance ile ilgili degildir.
        klasik bir obje oluşturlmuş olduk.data turu ve constructor
        aynı oldugundan standart bir obje oluşturulmuştur
        bu objenın tum ozellikleri BCorolla class ından alınır.
        obje oluştruulurken eşitliğin solu hem class ın adı
        hem de data turu olarak adlandırırlıyor.
        ornegın;
        String isim=new String();
        32. satırda ise biz dizel bir corolla uretiyoruz ama
        bu dizel corollanın; Corolla olarak ozelliklerini
        görmek istiyoruz.
         */


        AToyota arb3=new CDizelCorolla();//AToyota data turunde, CDizelCorolla
        //uretiyorum.
        //arb3.motor AToyota da motor olmadıgından CTE verdi
        //arb3.renk AToyota da da renk olmadıgından CTE verdi.
        //arb3.yakit AToyota da yakit da yok
        System.out.println(arb3.uretimYeri);//AToyota data turumuzda
        //uretim yerimiz oldugundan onu yazdırdı.
        System.out.println(arb3.marka);//AToyotA

        /*
        bir child class da obje oluşturulurken başka bir child class data turu olarak yani özelligini
        alacgımız class olarak belirleyebilriz.
        bu durumda obje child class ın objesi olmaklar beraber, bu obje nın ozellikleri ise data turu olarak
        seçilen parent class a ait olacaktır.

        bir obje oluşturulurken constructor, datat turunden farklı ise; ilgili objenın ozelligi data turu olarak
        seçilen parent class ın özelliği olacaktır.bu durumda bu obje nın variable larının ne oldugunu bilmek isti
        yorsak once data turu olarak secilen parent class ın özelliklerine bakacagız.
        egerr data turu olarak atanan parent class da ilgili variable bulıunmazsa bu durumda onun da parent ına
        bakarız.

        eger aranan variable data turu olarak secilen parent veya onun da parent ında yoksa Java CTE verir.

        boyle bir obje oluşturmanın temel amacı;
        constructor oalrajk kullanılan class ın degil data turu olarak secilen class ın özelliklerini kullanmaktır.
        varabel dan bahsediyorsak esas olan data turunun class ıdır.

         List<String> list=new ArrayList<>(); //bu şu demek biz arraylist istiyoruz ama özellikleri List data turunun
        //özelliklerini barındırsın istiyorum.yani burada List, ArrayList'in parenti olmuş oluyor.



         */




    }




}
