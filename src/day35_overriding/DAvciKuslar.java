package day35_overriding;

public class DAvciKuslar extends BKuslar {

    String tur="Avci Kusu";
    String isim="Avci kusu Isim belirtilmedi";
    String yasamYeri="Avci kuslar yabanda yasar";
    String enSevdikleriYiyecek="Yaban tavsani";

    void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }

    void beslenme(){
        System.out.println("Avci kuslar et yerler");
    }

    void pence(){
        System.out.println("Avci kuslarin penceleri vardir");
    }

    void gaga(){
        System.out.println("Avci kuslar sivri gagalidir");
    }


    /*
    cok onemli; variable lar statik lerdir;
    method lar ise dinamiklerdir. yani en güncel olanı alıp bana getirir. fakat variable yani degişkenler ise statiktir
    yani hangisine ulaşırsa onu alıp getirir.

    Variable da data turune yani eşitilin soluna bakıyorduk ve o class dan ozellikleri alıp getiriryor ve oluşturacgımız objenin
    özelliklerine atıyordum. o class da yani parnet olan data classs ında o variable varsa onaylıyoruz yoksa CTE veriyoruz.
    Ama bu duurm methodlarda biraz daha farklıdır.
    Methodlarda overriding vardır.
    şu demek: child class da bir özellik varsa overriding bu ozelligi alıır ve parent class daki özelligi guncelleştirip
    etkisiz hale getirir.yani childclass lar parent class lardaki ozellikleri kendilerine uyarlayabilirler.
    overriding yaparaken parentclass da oluşturulan method child class a geçirilir fakat body si degiştirileerk guncel
    ne ise o kayda alınmalıdır.

    overriding demek geçersiz kılmak demektir.

     */
    public static void main(String[] args) {

        DAvciKuslar avk1=new DAvciKuslar();//data ile constructor turumuz aynı.
        System.out.println(avk1.tur);//d avci kusu
        System.out.println(avk1.isim);//d "Avci kusu Isim belirtilmedi"
        System.out.println(avk1.yasamYeri);///d "Avci kuslar yabanda yasar";
        System.out.println(avk1.enSevdikleriYiyecek);//d "Yaban tavsani";
        System.out.println(avk1.ayak);//b "Kuslarin ayagi vardir";
        avk1.hareket();//D "Avci kuslar ucarlar"
        avk1.beslenme();// d "Avci kuslar et yerler"
        avk1.pence();//d "Avci kuslarin penceleri vardir"
        avk1.gaga();//d  "Avci kuslar sivri gagalidir"
        avk1.kanat();//b "Kuslar kanatlidir"
        avk1.solunum();//b "Kuslar akcigerle nefes alirlar"
        avk1.cogalma();//b "Kuslar yumurtayla cogalir"
        avk1.omur();//a Hayvanlar yasar ve olur

        BKuslar avk2=new DAvciKuslar();
        System.out.println(avk2.tur);//b "Kus"
        System.out.println(avk2.isim);//b "Kus Isim belirtilmedi";
        //System.out.println(avk2.yasamYeri);//bu variable b de yok
        System.out.println(avk2.ayak);//b "Kuslarin ayagi vardir"
        avk2.hareket();//D "Avci kuslar ucarlar"
        avk2.beslenme();// D "Avci kuslar et yerler"
        //avk2.pence();//ne b de ne de a da yok.
        avk2.gaga();//d "Avci kuslar sivri gagalidir"
        avk2.kanat();//b "Kuslar kanatlidir"
        avk2.solunum();//b "Kuslar akcigerle nefes alirlar"
        avk2.cogalma();//b "Kuslar yumurtayla cogalir"
        avk2.omur();//a "Hayvanlar yasar ve olur"

        AHayvanlar avk3=new DAvciKuslar();
        System.out.println(avk3.tur);//a Hayvan
        System.out.println(avk3.isim);//Hayvan iism belirtilmedi
        //System.out.println(avk3.yasamYeri);//kenisinde ve parentinde yok
        //System.out.println(avk3.enSevdikleriYiyecek);//kenisinde ve parentinde yok
        //System.out.println(avk3.ayak);//kenisinde ve parentinde yok

        avk3.hareket();//d "Avci kuslar ucarlar"
        avk3.beslenme();// d "Avci kuslar et yerler"
        //avk3.pence();//a da pence method u yok.
        //avk3.gaga();//a da gaga method u yok.
        //avk3.kanat();//a da kanat method u yok.
        avk3.solunum();//b ("Kuslar akcigerle nefes alirlar"
        avk3.cogalma();// b "Kuslar yumurtayla cogalir"
        avk3.omur();//a Hayvanlar yasar ve olur"






    }





}
