package day32_encapsulation_inheritance;

public class C02_Encapsulation {


    public static void main(String[] args) {

        /*
        başka class daki static variable larar class ismi. ile ualaşabiliriz
        instance varişable lara yani static olmayanlara ulaşmak içinde ancak
        obje vasıtasıyla ulaşabiliriz.

         */

        C01 obj=new C01();
        System.out.println(obj.getYas());//0

        obj.setYas(-20);//buradaki bu degeri eksi olarak yazılması nı oncesinden
        //istemiyorsam setYas method una gidee bunu duzenlerim.

        System.out.println("yas :" + obj.getYas());//-20

        //-20 atamak saçma olur dolayısyla kontrol edeersek daha iyi olur.

        /*
        biz bir objeye deger atamasını kontrol edemeyız. Kullanıcı kaç degerini atarsa
        java o degeri atar.

        encapsulatınon ın işte burda faydası bu tur deger atmaalrında
        degerleri getter ve setter methodları ile kontrol edebilmektir.
        hadi encapsulate edelim
        once private yapacagız
         gormek sitiyorsam get
        ama atama yapmak istiyoprssam da set  yapacagım.
         */
        System.out.println(C01.getHastaneAdi());//Yıldız Hastanesi//static ler class ismi. ile ççağırılırlar.
        /*
        biz hastane adını private yaaparak ona atama yapılmağsını enggelmiş olduk
         */
        /*
        getvariable ismi getter için
        setvariableismi ise setter için kullanılır
        sadece boolean ın getterina başına "is" eklenir.
        yani isVariableIsmi

         */


    }
}
