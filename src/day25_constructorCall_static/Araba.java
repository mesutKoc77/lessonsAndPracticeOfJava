package day25_constructorCall_static;

public class Araba {
    //şimid bir constructor oluşturulaım, daha sonra bu constructor ın da instance variable larını yapalım.

    int yil;
    String marka;

    Araba() {
        yil = 2015;

    }

    //şimdi de parmatreli constructor oluşturulaım. code generate bolumundan

    public Araba(int yil, String marka) //buraya yazılanlar sadece bir deger göstergesiidir yani hemen atama yapamazsın
    //atmaları suslu parantezlerin içine gire gire yaparsın. başlangıcta senin hala instance variable ların
    //geçerli yani int=0 String ise null dır. sen en aşağğıdaki objelerden degerleri alırsın ama suslu parantez
    //in içine gire gire atamaları yaparsın.
    {
        this();             //parametresiz de yil'a atama yapmış 2015 olarak
        this.yil = yil;     // ama burada demiş ki ben artık bunu da override ettim ve signature da vermiş oldugum int para
        //metreyi kullan diyerek yukarıdaki atamayi boşa çıkardım.
        this.marka = marka;

    }

    public Araba(int yil) {
        this(yil, "Toyota");
        this.yil = yil;
    }


    public static void main(String[] args) {
        //Objeleri sout edebilmek için code generate den toString'i oluşturmalıyım
        Araba arb3 = new Araba(2018, "Volvo");//yukarıda 2018, volvo argumentleri ni yazdı sadece, ama once
        // default
        //olarak atanmış olan instance variable ları yazman gerekiyor yani arb3 ün yil=0 marka sı ise null dır.
        //Dersin ve aşağıdaki atamaları yapa yapa gidersin.
        System.out.println(arb3);//Araba :yil=2018, marka=Volvo

        Araba arb2 = new Araba(2020);
        System.out.println(arb2);//Araba :yil=2020, marka='Toyota

        Araba arb1 = new Araba();
        System.out.println(arb1);//tum ozelliklerini görebilmemm için code generate den toString ile oluşturmalıyım
        //Araba :yil=2015, marka='null

    }


    @Override
    public String toString() {
        return "Araba :" +
                "yil=" + yil +
                ", marka=" + marka;
    }


}
