package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_ParentChildExceptions {
    public static void main(String[] args) {
        /*
        eger parent child ilişkisi olan exceptionları handele etmek istersen önce child in catch i
        sonra ise parent in catchi yazılır.

        diger şekilde yanı once parent i yazarsak java oarent ta buldugunu hemen yazacak ki bu child di de içerdigi için
        bu durumda child a erişim imkanımız olmayacak. ve child in raporlamasına erişemeyecegız.

        zaten yerlerini değiştirdigimizde java CTE verecektir.
        cunku sen zaten parent ı yazınca onun içerigğinde child da var. dolayısıla ben sana genel exceptionı getirebilirim
        ama child in exceptionın da geitremem diyecek ve child i ilk kısma yazmanı ısteyecektır.

         */

        String path="src/day37_Exceptions/TextFile";

        try {
            FileInputStream fis=new FileInputStream(path);
            int k=0;
            while ((k= fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();


        }
/*
burda IOException parent tır cunku ondaki exceptionlar FileNotfound exceptionı da içeriyor.yani raporlamada ayrıntı istersek
önce childi koyarız daha sonra burda bir şey bulursa hem onu yazdırıd ve daha geniş perspektiften bakmasını ve daha fazla
exception var mı diye bakmak istersek bu sefer parent takini yazarak exceptionı bulmaya calışırız. yukarıda oldugu gibi
catch bolumune once child olan FileNotfound exceptionı yazdık eger bunda exception bulamazsa bir aşağıdakine incek ve
IOException ile yani parent takini bulacak.
 */




    }
}
