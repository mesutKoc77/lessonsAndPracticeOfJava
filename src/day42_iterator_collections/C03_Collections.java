package day42_iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class C03_Collections {
    public static void main(String[] args) {

        List<Object> objeler= new ArrayList<>();

        objeler.add("Ali");
        objeler.add(4);
        objeler.add(12.4);
        objeler.add(true);
        objeler.add('3');
        objeler.add(new int[5]);

        /*
        1-Set (Kume)
         bu keliömeyi gorudugumuz zaman aklımaıza kume gelmeli ve ordaki elemanların unique olması yani tek olması özelli
        gi aklımıza gelecektir.
        bir elementten sAdece bir tane oluyor, birden fazla olmuyor.


        2-Linked(bagli)
        collevtıon ın içerisinde linked geciyprdsa onlar birbirlerinie halay şeklinde baglıdırlar. bunlara ekleme çıkarma
        yapmak kolaydır.


        3- queue(sıra)
        sonradan gelen sıranın sonuna gider ilk gelen de hemen ilk o çıkar.

        4-Tree(Dogal Sirali)
        biz nasıl eklersek ekleyelim o dogal sirasını alacaktır, biz nasıl eklersek ekleyelim, tree; onu hemen nasıl
        olması gerekiyorsa o sıraya gore sıralar.

        5-Hash
        yuzlerce kitap arasında ders kitabını aramadktan ziyade ders kitapları, roman vb diye raflar yapılır
        bolumlendiremye gidilir, bu durumda çok daha rahat istedgimize erişebiliriz.
        gelen tum elemntleri kodlayarak ve bu kod cercevesinde de bolumlendirerek yerleştiriyor.
        bu yuzden hızlıdır.
        okul numarası 135308129 olsun, 13--giriş yılı, 530---fakulte,81---bolum 29 ise de kayıt sırasıdır.
        işte bu şekilde bolumlendirme hashcode un karşılıgıdır.

         */

    }
}
