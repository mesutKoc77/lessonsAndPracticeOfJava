package day41_interfaces;

public interface zdeneme {
       void aliiii();//body siz demek diger child larda bunu override ederek duzenle demek.

       static void sensin(){
           System.out.println("ahme");

       };//body sinin olması demek diger child lar dan kullanılmasının zorunlugu yok demektir ve static i
    // kelimesini burda kullabilriz ben zaten duzenledim ve override
    //edilmesine gerek yoktur. yani, static kelimesi oldugu zaman body sının olma zorunlıulugu vardır ve child lar
    //tarafından override edilme zorunlulıgu ortasdan kalmkmış ve zaten concrete edilmişlerdi.r

}
