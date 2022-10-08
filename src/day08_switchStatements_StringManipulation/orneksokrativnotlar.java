package day08_switchStatements_StringManipulation;

public class orneksokrativnotlar {
    public static void main(String[] args) {

        /*
        int y=2;
        int z=0;

        int a=z>=0 ? ++y :z--;//a=++y pre increment de önce arttırma sonra ise deger atama yapılır.
        //yani y yi bir arttırdık ve bunu a ya atadık. 3 e 3.

        System.out.println(y+","+z+","+a);

        diğer bir örnek

        int y=2;
        int z=0;

        int a=z>=0 ? y++ : z++; //burda ise yani post incrementte önce atama yaptık daha sonra y nin degerini arttırdık

        System.out.println(a +","+y);

         */

        //& hepsini kontrol eder, && ise sadece bir tane false gorur ise hiç kontrol etmez.


        /*
        boolean yeni=true;

        switch (yeni) //switch de boolean kullanılmaz dolayısıyla ekran cıktısı hata verir. Ayrıca long, float
        ve double kullanılmaz
        {                     case true:
                System.out.println("bu araba yenidir");break;}
         */

        //ornek diger:
       /*int gun=2;

      switch (gun){
            case 1:
                System.out.println("Pazartesş");break;
            case 2:
                System.out.println("Salı"); //buraya break koymazsak konsol break ı gorene kadar gider.
            case 3:
                System.out.println("Çarşamba");break;
        }
        //yani salı çarşamba ekranda gorunur.
        //println ile print arasındaki fark şu: ln yazarsan bir alt satıra geçer, ln siz ise duz yazar

        */
        /*ornek
        int y=4;
        int x=(y>5) ? (y<=13 ? 2*y : 3*y) : (y<4 ? 23+y : 32+y);
        System.out.println(x);// önce 4 buyuk 5 mi değil geçtik iki nokatanın sagına.
        //ordada sordu y kucuk 4 mu, değil geçtik iki noktanın sagına ve sonuc 36
        */






















    }
}
