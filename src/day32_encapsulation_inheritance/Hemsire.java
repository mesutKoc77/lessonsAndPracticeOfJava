package day32_encapsulation_inheritance;

public class Hemsire extends Muhasebe{

    public static void main(String[] args) {

        /*
        extend keyword ile parent class daki access modifier ı publkic ve protected olan variable ları inherit
        edebilriz. public tehlikeli cunku bir kere degişince duzeltmek zordur.
        access modifier i defauşt olanalrın ise saddece aynı package da isek inherit edinebiliriz
        access modifier ı private ise inherit edemeyiz.
        ama bu private olan encapsule edilmişsse getter  ve setter ile kullanabiliriz.
        inharitance sayesinde tekrarlardan kurtuluyoruz.
        iknci ise yonetimi kolaylaştırıyor.
        standardizayona yardım eder.

         */

        Hemsire hmsr1 = new Hemsire();
        hmsr1.isim="Ayse";
        hmsr1.soyisim="Yilmaz";

        /*
        childclass lar parent class daki tum ozellikleri alabilirler veya bu ozellikleri kendilerine gore uyarlayabil
        irler.
        1-inheritance leri ilgili projenın başlangıc aşamasında dusunebiliriz. ortak ozellik barındıracagını duusunduguö
       muz class ları parent class olarak tasarlarız. yani ben personel class ını parent olarakoluşturayım daha sonra
        doktor hemşire vb i de onun child class ı olrak dusunebilirim.
        2- projeyi geliştririrken ortaya çıkacak ihtiyaclar cercevsinde de bir baska class ı parent edinebiliriz.

        inheritance nın en onemli ozelligi tekrar tekrar kullanabilme yani reusability dir.

        projeler başlangıcında genel ozellıklerini en ust class a
        daha spesifik özellikleri barındıranları ise childclass da tutarız.
        parent class, psuper class
        child class ise sub class olarak adlandırılır.

        bir child class ın bir tane parent class ı olur. birden fazla olmaz.
        yani bir çocugun sadece bir anne ve babası olur.
        eger child class ta cagırdıgumız bir variable ya da method hem parent hem de grand parent da varsa java ilk
        buldugu yerdekini kullanır.
        yani bir childin parent i grand parent ve grand grand parent i olabilir. bu tur tasarımlara da multilevel in
        heritance olarak adlandırılır.
        bir child class ın briden fazla parent i olamaz.
        fakat birden fazla child class aynı class ı parent class yapbilirler.

        object class ı butun class alrın babasıdır.

         */


    }



}
