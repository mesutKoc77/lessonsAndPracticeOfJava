package day40_abstractClass;

import day14_methodCreation.C03_MethodOlusturma;
import day31_encapsulation.a.A;

public class EKepekliEkmek extends CAbstractEkmek {


    @Override
    public void un() {
        System.out.println("kepekli ekmekte %30 kepek iceren un kullanilir");
    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmekte binde 1 oraninda maya kullanilir");
    }

    @Override
    public void bicim() {
        System.out.println("Kepekli ekmek farkli bicimlerde olabilir");
    }

    @Override
    public void gramaj() {
        System.out.println("Kepekli ekmek farkli gramajlarda olabilir");
    }


    public static void main(String[] args) {









    }



   /* DİGER NOTLAR
//class lar kendi objelerini uretmek için oluştrurulmuş kalıplardır.
    C03_MethodOlusturma obj=new C03_MethodOlusturma();
    AEkmek obj2=new AEkmek();

        /*
        başka class lardan oluşturdugumuz objeler kendi class ımızın objeleri degildir.
        Sadece ordaki methodlardan faydalnamk için kullanabilecegımız objelerdir.
        runner ile kendi objemizi, oluşturmak için kullandıgımız class ları birbrinden ayırmak gerekiyor.
         */

}
