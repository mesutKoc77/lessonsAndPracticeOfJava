package day42_iterator_collections;//buradan itibaren kopyala yapıştır.zzzzsokrative class ını da al yeni çunku.


import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList {
    public static void main(String[] args) {
        /*
        temel ozelligi linked olmasıdır yani elementlerin birbirilerine baglı şekilde sıralanmasıdır.
        LinkedList 3 interface implement etmiştir.
        1- List
        2-deque
        3-queue
        data turunu hangisinden secersek o datanın özellikleini devşiririr.

         */
        /*
        linked list oluşturdugumuzda java şoyle çalışır:
        once stack memory de bir variable ismi olur ve buyuk olan stack memorye head yani baştaki linked i atar. ama bişr
        sonraki node ın yanı bir sonraki elemntin tespiti için bu head in içine ilk elementina adresini yazar
        ve bizi ona yonlendirir, sonra diger node nın yanı ikinci elementin referansı ve adresi de iki bölümlü olan
        node un ikinci kısmınaa yazar ve birinci sırada ilgili element ikinci sırada bir sonraki elementin adresi biçiminde
        sona kadar gider. en sondakinin de ikinci kısmına null yazarak onun son elementoldugunu anlarız.
        her bir list elemnti iki parçadan oluşuru. buna da node denir.
         ilk kısmı ilgili elementin degerini ikinci kısım ise bir sonraki element,n adresini taşır.
         head de ise sadece adres vardır yani bir sonrakini adresi vardır.sadece head tek kısımdan oluşuyor.
         linked list e bir şeyler eeklemek ve çıkarmak  kolaydır; ama o zinciri kırma yani node ların eski adreslerini
         silme.

         */

        LinkedList<Integer> ll1=new LinkedList<>();//list, Queue ve deque ozelliklerinin tamamını taşır.
        List<Integer> ll2=new LinkedList<>();//list ozelliğine sahip linktlist
        Deque<Integer> ll3=new LinkedList<>();//deque ozelligine sahip linktlist
        Queue<Integer> ll4=new LinkedList<>();//queue ozelligine sahip linktlist.

        ll2.add(10);
        ll2.add(20);
        System.out.println(ll2);//[10, 20]
        ll2.add(0,30);
        System.out.println(ll2);//[30, 10, 20]

        System.out.println(ll2.subList(0, 2));//[30, 10]
        //elemet olan 30 u silmek istersek, index olarak algılanmaması için once bir variable atanmalı.
        Integer silinecek=30;
        ll2.remove(silinecek);//cunku burada 30 yazarsan onu index olarak algılıyor.
        System.out.println(ll2);//[10, 20]

        System.out.println(ll2.hashCode());//1291
        ll2.add(40);
        System.out.println(ll2.hashCode());//40061
        ll2.remove(1);
        System.out.println(ll2.hashCode());//1311

        System.out.println(ll2);//[10, 40]

        List<Integer> ll5=new LinkedList<>();
        ll5.add(10);
        ll5.add(20);
        ll5.add(30);
        System.out.println(ll5);//[10, 20, 30]

        ll2.retainAll(ll5);

        System.out.println(ll2);//[10] ikisinde olanları tuttu kalnları ise sildi.

        System.out.println(ll5);//pasif oldugu için kendisine bi şey olmadı, ll2 ye işlenm yapmıştık.

        ll5.retainAll(ll2);
        System.out.println(ll5);//[10]
        System.out.println(ll2);//[10]




    }
}
