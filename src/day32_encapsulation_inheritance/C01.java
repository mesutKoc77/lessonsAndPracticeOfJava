package day32_encapsulation_inheritance;

public class C01 {

    int yas;
    String isim;

    private static String hastaneAdi="Yildiz Hastanesi";//private yazdım ki static i onune gelen degişitirmesin
    //ve bunu korumak ve basşkası ısmını degiştirmesin diye de sadece get methodunu atadım set methjopdunu atamadım.


    public static String getHastaneAdi() {
        return hastaneAdi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>=0){
            this.yas = yas;
        } else {
            System.out.println("negatif giremezsiniz");
        }

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
