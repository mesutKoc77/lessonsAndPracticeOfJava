package day31_encapsulation.b;

import day31_encapsulation.a.A;

public class C {
    public static void main(String[] args) {

       /*
       şimdiye kdar biz görme ve erişim kelimelerini kullandık
       yetki ayrımı yapmadık.
       yani ben başka bir variable a eişirken görebilirim vb
       ama onun uzerinden degişim yetkisi vb konularına hiç girmedik
       görme(erişim)
       deiştirme(set)
       bu ikisi tamamen ayrilmiştir Java da yetki bakımından.

       java da bir veriye ulaşmak degimizde iki şey anlaşılır
       1- get (gorme): veriyi görürsün ama degişitriemezsin
       2- set (degiştirme): veriyi degiştirme yetkisi verir sana

       access modifier ile erişim yetkilendirmesi yapıldıgında bu:
       hem görme hem de degiştirme yetkisi verildigi anlamında gelmektedir.
       yani bben access modoifer ile bir variable a eriştigimde onu hem yazdırır hem de değiştirebilirim.
       bu yetkileri ayıramazsın.


       işte bu görme ve degiştirme yetkiisni ayırabilmek için encapsulation oluşturulmuştur.

       ancapsulatıon 2 adımdan oluşur
       1- encapsulate edilcek datalar once private yapılır
       2- bu private yapılan datalardan
       gorulmesini istediklerimiz için get
       degiştrilmesini istediklerimiz için ise set methodu oluştururuz.
       get e getter
       set e de setter methodu diyruz.

        */




        A objA=new A();//farklı package lardan cagırırken obje uzerınden
        //cAgırıyoruz.

        objA.pblc="10";//çünkü ayn class veya package da degiliz dolayısıyla sadece public e ulaşabilrdim.






        B objB=new B();

        objB.dfltB="Java";
        objB.prtctdB="Guzel";
        objB.pblcB="Degil Mi?";
        /*
        C ile B aynı class da degil, prvtB yi göremez
        C ile B aynı package da doalyısıyla dfltB yi görür.
        C ile B aynı package da doalyısıyla prtctcB yi görür.
        pblcB zaten heryerden görülebilir.
         */
        /*
        ornegin A classındaki private data lara buradan ulaşamadık..

        şimdi prvt1 iiçin get
        prvt2 için ise set yetkisi verelim.
        prvt1 için getter prvt2 için setter method u oluşturduk.

         */

        System.out.println(objA.getPrvt1());//private1
        //private1 için methodubu kontrol ettigimde sadece
        //dondurme yanı yazdırma yetkimiin oldugu gorulace
        //yani ben bir deger atayp sonucu getir diyemeyıp
        //sadece ilgili degeri strıng olarak bana göster yani
        //get diyebiliyorum.burada ise deger giremeyıp sadece
        //sonuc gorebilyr



        objA.setPrvt2("Java");
        /*
        set de ise atamayı yapaıyoruz fkat yazdıramıyoruz
        ve bana goster diyemi,yoruz. yani ben deger atayabilyrm
        fakat sonucu goremıyrm
         */

        //şimdi ise hem get hem de set yetkiisi olunan
        //bir variable a yani prvt3 e gidelim
        //bunu hem yazdıracgız hem de deger atayabilecegz


        objA.setPrvt3("Dalyan");
        System.out.println(objA.getPrvt3());//Dalyan
        /*
        bize sadece bilgileri girsinler ama goremezsinler derler
        se setter ı kullanırız.
        sadece gprsunler ama bilgi giremesinler derlerse
        o zman getter ı kullanırız.

         */

        /*

         */


    }
}
