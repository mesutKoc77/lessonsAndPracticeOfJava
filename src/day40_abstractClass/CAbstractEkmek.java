package day40_abstractClass;

public abstract class CAbstractEkmek {

    /*
    bir abstract class ın amacı object oluşturmak degil, child class ları için kalıplar oluşturmaktır.
    mesela sadece adı ekmek olan ekmek yoktur. Çeşitleri vardır.
    işte abstract class ı da bu çeşitli ekmkelerin taşıması gerektigi ozellikleri standartlaştırmak ve taşımaları
    zorunlu özellikleri ihtiva ettirmek için kullanırlar.
    bunu şu şekilde yapıypr
    1- önce class, abstract yapılır.class keyword unden önce abstract yazılır.
       şimdiye kadarr oluşturdugumuz abstracty olmanayan class lara concrete class denir.
    2- bir classs ı abstract yapınca, onda bir abstract method oluşturabiliriz.
    abstract methodlar, body si olmayan ama child class lar için zorunlu standart olacak methodlardır.
    methodun return type ınan once abstract yazılırsa abstract method oluşur unutma bunların body si olmaz.

    3-abstract class ın içinde hem abstract method hem de concrete method bulunabilr.abstract olan methodlar
    child class lar trafından uyarlanmak yani implement edilmek zorundadır ama concrete methodların uyarlanma yani
    implement edilme zorunlulugu yoktur.

    4- concrete class (biizm klasik class lar) ların içerisinde abstract methodlar oluşturamazsın.
    5- abstract bir class, başka bir abstract class a extend edilirse abstract methodları implement yani uyarlama zorunlulugu
    yoktur.
    cunku abstract clas lar kural koyucudurlar, kuralları uygulayack olanlarsa concrete class lardır.
    bir abstract class yeni kurallar koyabilir fakat kendisinden obje oluştruulamaycgı için kurallara uymak zorunda degildir.
    ama isterse parent class daki methodlardan istedigini kendisine uyarlayabilir.
    6- birden fazla abstract parent i olan ilk concrete class, parent abstract class ların tamamında, concrete edilmeyen tum
    methodları implement yani uyarlamak zorundadrır.
    7-abstract class ların constructor ları vardır ama;
    abstract class lardan obje oluşturulamzz.
    8- abstract methodlar, final veya private olamaz.
    abstract methodlar override edilmek için oluşturulmuştur zaten
    static, final ve private methodlar override edilemezler.
    9- abstract silsilerisndeki abstract lar parent taki abstract methodları uyarlamak zorunda değillerdir.ama isterlrse
    kendisine uyarlayabilirler ve bunları concrete hale getirebilirler.

     */

    public abstract void un( );

    public abstract void maya( );

    public void tuz( ){
        System.out.println("Ekmekte tuz kullanilabilir");
    }
    public abstract void bicim( );

    public abstract void gramaj( );

}
