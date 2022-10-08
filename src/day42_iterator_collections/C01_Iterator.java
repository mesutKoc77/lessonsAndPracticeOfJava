package day42_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        for (Integer each:sayilar
             ) {
            each=each+5;
            System.out.print(each+" ");
        }
        System.out.println(" ");
        System.out.println(sayilar);//ama burda dikkat edersek sayılarımı degişmesi yine aynı degerdeler.
     /*
        iterator, interface oldugundan constructor ı yoktur ve bu yuzden obje oluşturulamaz.
        concrete classs da iteratorı kullanmak istersek, iterator interface indeki methodları kenidilerine uyarlamış
        olmalılar biz de zaten o uuyarlanmış olana ulaşabiliriz.
        biz direkt iterator kullanamıyoruz cunku o bir interface ve obje oluşturanmıyoruz. ama mesela bu ornekte,
        sayilar Listi'ni, sayılar listinin kendisine uyarladıgı interface deki methodalrı ancak biz kullanabiliryoruz.
       bir işlemi tekrar tekrar kullnmak istersek bunu itirate edebilriiz.

     */
        Iterator itr=sayilar.iterator();//sayılar listinin başına geçti durdu ve tek tek getirecek..[başta I, 10, 20, 30]
        System.out.println(itr.next());//biz her bir iterator oluşturdugumuzda bir yana kayacak ve istersek en sona kadar
        // gider.
        System.out.println(itr.next());
        System.out.println(itr.next());

        //iterator en son bıraktıgımız yerde durur,baştan başlamasını istiyrsak yeni bir iterator oluştrumalıyız

        Iterator itr2= sayilar.iterator();
        //ben şimdi itr ye şunu soylememe gerekiyor, yanında elemnt oldugu mudddetce sayiyi bana yazdır, bunu soylemem
        //gerekiyor.

        while (itr2.hasNext())//yanında element var mı?
        {
            System.out.print(itr2.next()+" ");//next demek aslında bir yana kay ve o sayıyı al.
        }

        //iterator kullarak listenin tum elemntlerini silin

        //şimdi yeni bir iterator oluşturmalıı zira eski iterator lar sona kadar giderler ama geri gelmezler.

        System.out.println(" ");
        Iterator itr3=sayilar.iterator();
        while (itr3.hasNext())//yanında element var mı?
        {
            itr3.next();//o zaman onun üzerinden zıpla ve onu tut. bir yandasın şuan.
            itr3.remove();//sil
        }
        System.out.println(sayilar);//[]

        //Listede 20 den buyuk olan elemnetleri silin
        //bu soruyu çözebilmek için yukarıda silmiş oldugumuz sayiları yeniden eklemeliyiz.

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        Iterator itr4= sayilar.iterator();

        while (itr4.hasNext()){
            //itr4.next();bunu burada yazarsan itr yi hem burda hem de if için kaydıracagı için hata verecektir.
            //iterator nerde gorurse gorsun next i gordugu an bir yana kayar. dolayısıyla dikkatli davranmak gerekiyor.
            //iterator, next i gordugu an herz aman saga gecer, dikkatli olmak lazım.

            if ((Integer)itr4.next()>20){
                itr4.remove();
            }
        }
        System.out.println(sayilar);//[10, 20]



    }
}
