package day11_stringManipulations_forLoop;

public class C06_Soru4 {
    public static void main(String[] args) {
        // asagidaki str'i String methodlari kullanarak temizleyin
        // output : Java ogrenmek ne guzel

        String str= "java1 ogRe2@nMek3 #ne +Gu=zel";


        str=str.replaceAll("\\d", "");//once dıgıtlerı yok ediyoruz,şimdi de spaceleri- boşlukları- 3
        //yapıyoruz
        System.out.println(str);
        str=str.replaceAll("\\s","3");//spaceleri 3 yapıyoruz
        System.out.println(str);
        str=str.replaceAll("\\W","");//non word olanları yok et, yazı olmayanları yok et.
        System.out.println(str);

        str=str.replace("3"," ");//boşlukları kurtarmakm için 3 yapmıştım, şimdi onları tekrardan boşluk
        //yapacagım
        System.out.println(str);

        //buyuk harfleri kucuk harf yapalım

        str=str.toLowerCase();//tamamnını kucuk harf yaptık
        System.out.println(str);

        //şimdi de ilk harfi buyuk yapacagız
        str=str.substring(0,1).toUpperCase()+str.substring(1)+".";//şimdi ise ilk harfi aldık, sonra ise yanına
        //birinci indeksten sonrakilerin tamamınıı yapşıtrdık
        System.out.println(str);

        //şimdi de ilk harfi buyuk yapalım



    }
}