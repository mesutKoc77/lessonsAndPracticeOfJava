package day16_scope;

import java.util.Scanner;

public class C03_Scope {
    /*
    static variable lar tüm class ve tüm objeler için tektir.
     */

    String str="Java";
    int a=10;
    int b=20;

    public static void main(String[] args) {
        /*
   biz buradan a ve b ye ve string ulaşamayacgz, instance (object variables) olduklarından veya ststic olmakdıklarından
   STATİC main method içerisnden  direkt ulaşamayız.
   ama static method dan instance object variable lara ancak obje oluşturup daha sonra bu objeler uzerinden ulşılabiilir.

       */
        /*
bir okul dudunelim ismş yılduz kolejş olsun. 100 ogretmen olsun 1000 de ogrenci. şimdi okulun isimini degiştirp
java okulu yapmsam tum ogretmen ve ogrenciler için okulu degişmiş olcak. ama bora ogretmenşn branşını degiştirsem sadece
onu ilgilendirdiginden diğer tum ogretmenlerin deegildree SADECE bora ogretmenşn bransı degişir. veya bir ahmet
ogrencinin not unu degiştrirsem sadece ahmetin notu degişir ama digerlerininn ki degişmez.

işte static variable lar bu okul adı gibidri. Yani static olan variable in degeri degiştigi zaman herşey için degişmiş
oalcakatır. statci olmayan yani instance object variable lar ise sadece ilgili obje ye baglıdır. yani bunları degiştridiginde
sadece bu obje degişir. başka hiçbirine etki etmez. mesela ahmed in notunu degiştridginde sadece ahemti etkiler, başka
bir şeyi kesinlikle etkilemez.

static variable lar gokteki ay giibdirler. aydınlatırsa herkesi aydınlatır herkesi etkiler. yoksa yoktur. ben benim evimdeki
lambayı yakarsam sadece benim evimi etkiler.

static variable lar class uyelerinin tamami için gecerlşidir ve bri tanedir degişrse tum class uyeleri için degişmiş olur.
instance object variable lar ise sadece bir obje yilgilendiri. okulun ismi veya adresi degişti mi tum ogretemen ve ogrenciler
için degişir. x ogretmenin bransi degişrise sadece o ogretmeni etkiler.

 */

        //şimdi bir obje oluşturulaım mesela

        C03_Scope obj1=new C03_Scope();//işte bir yeni objemiz//class lar biizim bir kalıbımızdır ve biz bunu kullanarak
        //istesigimiz kadar obje oluştururabilşiriz.//burada obj1 isimli bir obje oluşturduk. mesela class ımız olan
        //C03_Scope'dan istedigimiz kadar obje oluşturduk. mesela toplamda 4 adet obje oluştrduk.
        C03_Scope obj2=new C03_Scope();
        C03_Scope obj3=new C03_Scope();


        /*
        br obje oluşturuldugunda Java, heap memory de o objeyi oluşturur ve o obje ye ozel instance variable lari o obje
        ye ekler.
        mesela yukarıda obj1 dedigimizde hemen java bir obje oluşturur ve bu class ın instane variable ları var mı diye
        sorar ve ona da yukarıdaki instance variable ları  atayarak yoluna devam eder. mesela str i java, a sı 10,
        b si ise 20 olur. sonradan yine bir obje oluştrusan dahi ki o da obj2 olsun. Yine gider ve class in içine bakar
        bu class da instance variable bvar mı var der yine str=java, a=10, ve b=20 variable larına alrak atama yapar
        yine obj3 diye bir obje oluştursam yine class içinde instance variable lar var mı diye sorar ve
        str i, a=10, b=20 olarak atamasını yaparak yoluna devam eder.
        obje derken bir dikdörtgen dğşünerek haeket edin.
        bundan sonra yani atamalşardan sonra da program objeler uzeırnden devam eder. sadece objeler baglamında hareket eder.

         */

        /*mesela a'nın degerini degiştrimek istiyorum, java gidip instance variable i direkt degiştrirmez. cunku bir çok
        obje oluşturulmus doılayısla hangi obje de a yı degiştirmek istiyorsan objeyi belirtmek gerekiyor.
        mesela
        obj1.a=17; //gibi, a birçok obje ye atandıhgından gidip hangi obje deki a yı degiştriegmi belirttim...


         */

        obj1.a=11;//11
        obj2.a++;//11// obj2 nin a sını buldu 10 idi ve bir arttırdı 11 yaptı.
        obj3.b=22;//burda  gitti obj3 u buldu onun b'sini 22 yaptı.

        //şimdi mesela obj4 u oluştursak bu obje nin degerleri ne olacak? hemen instance variable lara gidecek en ustte.
        //str ı java a sı 10 b si 20 idi. yani yine en baştaki class ın hemen altındaki ilk intance variable lara gitti.

        C03_Scope obj4=new C03_Scope();//neydi str i java a sı 10 b si 20 idi. diger objelerdeki degişiklikler yeni objeleri
        //kesinlikle etkilemiyor.
        System.out.println(obj1.a);//11//şoyle belirledik. önce class ın hemen altındaki instance variable'lara gittik
        //oradaki instance variable lari obj1 e atamış ve aşağıya dogru gelmiştim atama yapa yapa. daha sonra obj1 deki a
        //a degerinin ne oldugunu merak ettiim
        // obj1 un oluşturuldugu noktayı bulduk, ondan sonra aşağıya
        //dogru geldik ve obj1 in atamalarını bu noktaya kadar takip ettim.

        /*
        diger bir deyişe, herhangi bir objen,n intance degerleri soruluyorsa, objenin oluştutuldugu satıra gidip, objeyi
        o satırdan itibaren bize sorulan satıra kadar takip edecegiz
         */

        /*
        şöyle dusunelim obj3 ogrencisiinin matematik notunun degişmesi obj4 ogrenciisinde notunun degiştigi anlamında glemz
        yalnızca ilgili objenin belirli variable ı degişmiştir.

         */

        obj1.a+=3;//ama burda ne oldu, obj3 e gidip a degerine bakacak obj1 nin a degeri 11 idi onu 3 arrtırdı ve obj1
        //artık 14 oldu. ve obj1 in a yeni degerini 14 olarak atadı.

        System.out.println(obj1.a);//14
        System.out.println(obj2.a);//11
        obj2.a+=5;
        System.out.println(obj2.a);//16

        //2.25





    }
















}
