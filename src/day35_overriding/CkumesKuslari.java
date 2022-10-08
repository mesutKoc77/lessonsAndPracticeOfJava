package day35_overriding;

public class CkumesKuslari extends BKuslar{
    String tur="Kumes Kusu";
    String isim="Kumes kusu Isim belirtilmedi";
    String yasamYeri="Kumes kuslari kumeste yasar";

    void hareket(){
        System.out.println("Kumes hayvanlari yurur");
    }

    void beslenme(){

        System.out.println("Kumes hayvanlari et veya ot yerler");
    }

    public static void main(String[] args) {
        CkumesKuslari kk1=new CkumesKuslari();
        System.out.println(kk1.tur);//C "Kumes Kusu"
        System.out.println(kk1.isim);//C Kumes kusu Isim belirtilmedi
        System.out.println(kk1.yasamYeri);//C Kumes kuslari kumeste yasar
        System.out.println(kk1.ayak);//B Kuslarin ayagi vardir
        kk1.hareket();//C Kumes hayvanlari yurur
        kk1.beslenme();//C
        kk1.kanat();//B
        kk1.solunum();//B
        kk1.gaga();//B
        kk1.cogalma();//B
        kk1.omur();//A


        BKuslar kk2=new CkumesKuslari();

        System.out.println(kk2.tur);//B
        System.out.println(kk2.isim);//B
        //System.out.println(kk2.yasamYeri);//cunku b class ında ve parentinda yok
        System.out.println(kk2.ayak);//B

        kk2.hareket();//c "Kumes hayvanlari yurur" eger variable olsaydı evet AHayvanlar hareket eder" degerini alacaktı ama
        //gittim bunu buldum ama bu method oldugu için şu soruyu sordum:
        //acaba bu methodu geçersiz kılan başka bşir hareket methodu var mı? ve bunu constructor ın oldugu class a kadar
        //giderek takip edecegım. Bir tane bu method dan bulursam bunun  override edildigine karar verecegm.
        //yani önce data turunun class ına bakacgız yoksa onun parent ina
        //bulduysak override edilmiş mi diyecegz edilmişse o degeri
        //alacagız.
        kk2.beslenme();// c "Kumes hayvanlari et veya ot yerler
        kk2.kanat();//b "Kuslar kanatlidir"
        kk2.solunum();//b "Kuslar akcigerle nefes alirlar"
        kk2.gaga();//b "Kuslarin gagalari vardir"
        kk2.cogalma();//b "Kuslar yumurtayla cogalir"
        kk2.omur();//a "Hayvanlar yasar ve olulrer.

        AHayvanlar kk3=new CkumesKuslari();
        System.out.println(kk3.tur);//a hayvan
        System.out.println(kk3.isim);// a hayvan isim belirtilmedi
        //System.out.println(kk3.yasamYeri);//yasamyeri a da yok
        //System.out.println(kk3.ayak);//ayak a da yok

        kk3.hareket();//C Kumes hayvanlari yurur
        kk3.beslenme();//C Kumes hayvanlari et veya ot yerler
        //kk3.kanat();//a da kanat methodu yok
        kk3.solunum();//B "Kuslar akcigerle nefes alirlar
        //kk3.gaga();//a da gaga yok; data class da bu  method olmadıgı için kesinlikle gunceline de bakamazsın
        kk3.cogalma();//B "Kuslar yumurtayla cogalir"
        kk3.omur();//A "Hayvanlar yasar ve olur"


    }



}
