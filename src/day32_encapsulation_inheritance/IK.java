package day32_encapsulation_inheritance;

public class IK {
    /*
    tum personel için ortak olan variable ve method lar bu class da tutulur.
    boylece alt class ların her birinde yeniden yeniden oluşturmak zorunda klamyız.

     */

    protected String isim="deger atanmamis";
    protected String soyisim="deger atanmamis";

    protected void maas(){
        System.out.println("Personel Maas Alir");
    }
    protected void izin(){
        System.out.println("Personelin İzin Hakki vardir");
    }
    protected void ozelSigorta(){
        System.out.println("Personele ozel Sİgorta destegi yapılır");
    }








}
