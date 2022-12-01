package day24_constructors;

public class orneknotlar {
    //şimdi class level da instance variable ları oluştrusuk
    String isim = "John Doe";
    int yas = 40;

    //şimdi ise notlar class ından bir parametreli constractor oluştruuacgz

    public orneknotlar(String isim, int yas)//bunun constructor mı yoksa method mu oldugunu, kendisinde return type ı olmadıgı
    //için yani sonucu bana int mi string mi donduraecek veya void mi donecek dememdgiiçin constructor dır bu.
    {
        this.isim = isim; //ifade dogru mu bilmiorum ama yukarıdaki intance variable olan "isim"'i methoda yerleştirdigim
        //parametre ile override ettim. yani artık ben ne yazdı isem string olarak, instance variable'a onu ata.
        this.yas = 30; //ifade dogru mu bilmiorum ama yukarıdaki intance variable olan "yas"'a methoda yerleştirdigim
        //parametre ile override ettim. ama this.yas=yas degil de this.yas=30 yani yukarıda "yas" olarak verdigim
        //variable'i 30 olarak belirledim. parametreye ne yazarsam yazayım ilgilendirmez cunku boşa dustu

    }

    public static void main(String[] args) {

        orneknotlar obj = new orneknotlar("Mesut", 33);//burda da notlar class ından bir obje oluşturduk. ve eşitligin sa
        //gında da bir constructor kullandık.


        System.out.println("isim :" + obj.isim + "yas :" + obj.yas);
    }

        /*
        java da kodlar once main den başlar.
        sonra obje ye gecer. obje de ki degerleri alır constructor a göturur. constructorun parantezine geçer ordaki
        degerleri alır
        daha sonra suslu parantezin içine gider, suslunun içindeki degerleerin alır ve en son sout ta bitiri
        sonra da obje nın refer ettgii constructor a yonelir.

         */


}
