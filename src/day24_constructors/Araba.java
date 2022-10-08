package day24_constructors;

public class Araba
//default constructor burada yani
    //çağırılan class dadır.
    //araba objesi oluştrumak istediginde
    //işte buradaki constructor default olarak
    //çağırılır...

{
    int ilanNo;
    String marka="deger atanmadi";
    String model="deger atanmadi";
    int yil;
    int fiyat;

    //özellikleri baştan atayabilmek için parametreli
    //constructor oluşturulaım.parametre isimilerinin instance variable isimileriyel aynı olması onemli.
    /*
    önce parametre isimlerini farklı yaparak bir parametreli constructor oluşturulaım

     */
    //şimdi parametreli constructor ı manuel yapıyrm ve parametre isimlerifarklı olsun
    public Araba(int ilnNo, String mrk, String mdl, int yl,int fyt){
        ilanNo=ilnNo;
        marka=mrk;
        model=mdl;
        yil=yl;
        fiyat=fyt;
    }
    /*
    burda once ilanNo ya baktı ilgili scope da yok idi ve class level a gitti
    ordaki ilanNo yu aldı ve ilnNo ile eşitledi.
    Zaten renkler den de belli hangisi nerdeki class level a ait.
    bunu göstermiş oldu.

     */
    /*
    parametre isimleri ile instance isimleeri aynı olursa, içinde bulunulan scope da istenen
    isimde variable varsa Java onu kullanacaktırç
    bu durumda ilgili parametrenin class level daki instance variable a refer ettgini
    belirtmek için this. keyword u kullanılmalıdır.
     */

    public Araba(int ilanNo, String marka, String model, int yil) {
        this.ilanNo = ilanNo;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }
    //yukaırda da constructor olusturduk ve dort variable lı. yine code generator ve constructor dedik

    public Araba(String marka, int ilanNo, String model, int yil, int fiyat)
    // burada normalde altını çizdi ama signature ı degiştridigimizde
    //bu duzelecektir. yani basa String getirdim devamını da aynı
    //sırada duzenledım.
    {
        this.ilanNo=ilanNo;
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
    }
    //burda ise yine scope a bakti, ilanNo yu yine gidip ilanNo ya atamışssın dedi.
    //cunku aynı scope içerisinde ilanNo var ve yukarı çıkmadı.
    //bunların basına yanş ilanNo nun başına "this" getiriirsek hiç scope a bakmaz
    //ve hemen gider bunun class level daki instance variable oldugunu anlar.




    //manuel constructor ekleidigm için diger class larda manuel leri çağırdıklarım hemen kırmızı ya döndü.
    //vunku java, manuel eklenen oldugundan default constructor ı sıldı. bunu silmememsi için de manuel olarak
    //parametresiz constructor ı eklemem gerekiyor.

    //paramaetresiz constructor
    public Araba(){

    }









    @Override//to String yani hepsini yazıdırmak için
    public String toString() {
        return "Araba özellikleri:" +
                "ilanNo=" + ilanNo +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat;
    }



}
