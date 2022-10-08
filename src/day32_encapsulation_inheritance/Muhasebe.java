package day32_encapsulation_inheritance;

public class Muhasebe extends IK{
    /*
    muhsaseb de de çalışanın kişisel bilgilerine ihitiyac vardır.
    Bu bilgilere ulaşmak için iki ihtimal vardır
    1- ik class ından obje oluşturabilriz
    2- daha kolayı ve saglamı muhasebe class ından Ik class ını inherit ediniriz yani paretn ediniriz.

     */
    protected String sgkNo="Deger atanmadi";
    protected  boolean raporluMu;
    protected int minSaatUcreti=12;

    protected int fazlaMesai(int fazlaMesaiSuresi){
        return fazlaMesaiSuresi*minSaatUcreti;
    }

    protected int standartMaas(){
        return 30*8*minSaatUcreti;
    }



}
