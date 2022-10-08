package day04_operators;

public class C02_BasitIfCumleleri {


    public static void main(String[] args) {

        //java, önce eşitliğin sağını yapar daha sonra bu değeri eşitilin solundaki variable atar.
        //örnek

       /*
        int x=10;


        x=x+5;

        System.out.println(x);

        x=x*5;

        System.out.println(x);

        //örnek burada sona erdi


        //şimdi asıl konumuzdayız

        int a=10;
        int b=15;

        System.out.println(a==b);//burdaki iki eşitin anlamı; a ile b eşit mi sorusu? //false
        System.out.println(a==b-5);//true
        boolean c;
        System.out.println(c=15==b);//önce eşitliğin sagına baktık, 15 ile b eşit mi? evet. o zaman bunu
        //eşitliğin solundaki variable olan c ye değer olarak atayacagız. yani c=true olacak

        c=15*a==10*b;//150 ile 150 eşit ve bunu eşitliğin solundaki c ye atadık ve c nin değeri artık true oldu.
        //burda c ye neden sayısal ifade atamadı cunku boolean olan bir şey ya true dur ya da false dır.

        System.out.println(c); //true

        //java da unlem işareti bir terimin zıddını ifade eder. örnek, false un yanında ! koyarsan onun true
        //olduğu anlamında gelir.
        */

        //yukarıdakileri yıldızdan yani yorumlardan kurtarırsan kod çalışır.

        /*


        int a=10;
        int b=15;

        System.out.println(a!=b);//a eşit değil b ye. evet dogru yani true

        System.out.println(a!=b-5);//a eşit değil b eksi 5 e. hayır eşit. dolayısıyla false.

        boolean c;

        System.out.println(c=15!=b); //15 eşit değildir b ye mi? hayır false dolayısyla c false yazacak

        c=15*a!=10*b;//150 eşit değil 150 demiş c ye atamış, dolayısyla eşit dolguğu için c variable ı false
        //yazacak.

        System.out.println(c);
        */

        //boolean mantıksal ifadeler için kullanılır.
        //end operatoru mukemmelyıtıcıdır ıkı mantıksal variable ı karşılaştırı, bır tanesı false ıse sonuc
        //false dır.yani herseyi true kabul eder, içinde bir tane false varsa sonucu hemen false yapara, o kadar
        //true ya ragmen.

        /* int a=10;

        int b=15;

        System.out.println(a>b && b>0);//& her zaman mukemmliıyetsi yani hersey true ise sonuç true ama
        //burda bır tane false gelirse sonucu false yapar.

        System.out.println(a<=b-5 && a>b-8);//burada a eşittir 15-5 e (true) ve a buyuktur b-8 den (true),
        //her sey true oldugundan sonuç true olur.

        boolean c;

        System.out.println(c=15>=b && a<0); //burda önce eşitiliğin sağındayız, 15 buyuk veya eşit b ye (true)
        // a da sıfırdan kucuk değil (false) sonuc olarak bu false c variable na atandı.

        c= a>=b && 3*a<4*b;//a buyuk veya eşit degil 15 dolayısıyla false VE 30<60 yani false, sonuç false.

        System.out.println(c);

         */

        //butun mantıksal ifadeleri karşılaştırmk için tek and işareti kullanılır ama bir tane yanlış
        //gprdugunde hemen false u yapıştrısın istersen ve karşılaştrımaya hiç ihtiyaç duymaz isen
        //iki and i kullan.

        //programın hızlı çalışmasını istersen &&.
        //tek and & ise tum mantıksal iafadeleri karşılaştırır sona kadar gider ve en son değer atar.
        //çift and && ise mantıksal ifadeleri karşılaştırmaz ve direkt sonuca gider.ve bundan dolayı hızlıdtı

       /*
         int a=10;

        int b=15;

        System.out.println(a<b && b<10 && b>=a && a<0);
        System.out.println(a<b & b<10 & b>=a & a<0);
        sosonuç olarak sen && and and i kullan.
        */

        /*int a=10;
        int b=15;

        System.out.println(a>b || b>0);
        //a, b den kucuk, dol. false, b sıfırdan buyuk dol. true. or işareti
        //iyimder oldugundan ikisinden biri true oldugundan sonuçtrue.

        System.out.println(a<=b-5 || a>b-8); //or un solu true sagı true yani sonu true, cunku or için bir tanesi
        //nin true olmaası yetıyor ama ıkısı false olursa sonuc false. sonuç olarak or, sadece iki ikisi de false
        //ise sonucu false yapar, diğer tum durumlardasonuc durudur.

        //1:26

        boolean c;

        System.out.println(c=15>=b || a<0);//15 buyuk veya eşit 5 dol. true,
        // 30 kucuk değil 60 false, sonuç true
        System.out.println(c);//true

        c=a>=b || 3*a<4*b;// a buyuk veya eşit değil dol. false, 30 kucuk 60 true, iki false olmadıgından sonuç
        //sonuç true.

        System.out.println(c);*/

        //  || (or) operatorunu toplmaya beznetebiliriz. içinden bir tanesi dahi 1 olursa sonuç bir olur.
        //sonucun sıfır olabilmesi icin sayının tamamının sıfır olması gerekıyor, bir tane bir varsa
        //sonuc bir olacaktır.

        //Yeni Konu---If Statements

        /* eğer iyi çalışırsan sınavı geçersin: eğer=şart cumlesi, İyi çalışırsan=şartımız-(Boolean Şart)
        sınavı geçersin=Sonuç
        Çalışmazsan ise Snucu bilmiyoruz.
         */
        /*int a;
        a=10;
        int b;
        b=20;

        if (a>b);
        System.out.println("a b'den buyuktur");//If Statements lerin üç sacayagı vardır başta if, sonra boolean
        // bir şart veya variable, sonra ise boolean
        //şart true ise çalışacak kod, boolean şart false ise sonuç yok  kod alt satıra geçer ve çalışmaya
        //devam eder.

         */
        /*
        int a=10;
        int b=20;
        if (a>b)
        System.out.println("a, b den buyuktur");//false oldugu için hiçbir şey yazmayacak.

        if (a<100)
        System.out.println("a 100 den kucuktur");//true

        if (b>0) System.out.println("b 0 dan buyuktur");//true

         */

       //YUKARIDAKILER BENIM NOTLARIM, AŞAĞIDAKKILER HOCANIN ANLATTIKLARI

        int a=10;
        int b=20;

        if (a*b>100) {
            System.out.println("Çarpımları 100 den buyuktur" );
        }
            //java da bir kodun bitmesi için noktalı vırgul koymamız gerekiyor, yani noktalı vırgul
            //koyuncaya veya suslu parantez koyuncaya kadar kod devam eder.
            //ASIL ONEMLİİSİ;
            //if sartından sonra tek bir satır yazacaksak süslü parantez kullanmasak da olur. kendisi otomatik
        //sonunda noktalı vırgul koyacaktır.ama kendımızı garantıye almak istedgımızden if den sonra genelde
        //suslu parantez kullanırız. sankı kodun devam gelecekmiş, ekleme yapacakmışız gibi.

        if (a<b) System.out.println("a, b den kucuktur");
        System.out.println( "suslu parantezle if e baglanmadım ve her halukarda ekrandayım");
        System.out.println( " ben de suslu parantezle if e baglanmadım ve her halukarda ekrandayım");

        //yukarıda ise süslu parantez kullanmayrak, alttaki iki satır if koşuna bağlı degil, bagımsız
        //dusunulecektır dıyecegız.

        if (b>0) //BURASI TRUE OLDUGUNDAN AŞAGIDAKI UC SATIRDA SUSLU PARANTEZLE BU KOŞULA BAĞLANDIGINDAN HEPSİ
            //YAZDIRILACAK. ONEK: FALSE OLSA İDİ İLK SATIR YAZZDIRILMADIGI GİBİ, SUSLU PARANTEZEL KENDISINE
            //BAĞLANAN ALTTAKİ İKİ SATIR DA YAZDIRILMAYACAKTI.
            {
            System.out.println(" b, 0 dan buyuktur");
            System.out.println("3.sartin ikinci satiri");
            System.out.println("3.sartin 3.satiri");


        }

        /* önemli not: if formulundan sonra süslü parantez açarsak, süslü parantezin içindeki durumların
        her biri if formulu çerçevesinde değerlendirilir ve yazdırılır. aksi taktidrde ise;

        yani if şartından sonra süslü parantez degıl de noktalı vırgul kullanırsak, herbir durum if den
        bağımsız şekilde değerlendirilir ve yazdırılır.
         */

        /*
        basit if cumlleeri yukarıdaki gibi, kodun geri kalanıyla ilgilenmez. Dolayısıyla....EKSİK
         */
         /*

            Boolean : Mantiksal data sonuclarini store etmek icin kullanilir.
            Primitive data turleri sadece deger store edebilirler ve
            hafizada kapladiklari alan her data turu icin sabittir.
            boolean data turundeki bir variable sadece 2 deger
            barindirabilir, true / false
            Bilgisayar true icin 1, false icin 0 degerini tutar,
            dolayisiyla hafizada sadece 1 bit yer kaplar
          */

        boolean c=true; //burda c boolean olduğu için java, if'e c nin atanmasını kabul etti.
        if (c) {
            System.out.println(c);
        }
        //ama aşağıdaki gibi d'ye false degerini atasaydık, spnucunu yazdırmayacaktı

        boolean d=false;
        if (d) {
            System.out.println(d);
        }

        c= a * 5 > b*3; //50 buyuk değil 60 dan dol. false

        if (c){
            System.out.println("çalışmadı");
        }

        //yeni örnekler
        int x=10;
        int y=20;

        boolean sonuc=x>y;//önce eşitliğin sagına gectik ve x buyuk degıl old. sonuc false ve aşaguıya da
        //yazdırmayacak

        if (sonuc){
            System.out.println("yazdıramicak");
        }

        sonuc=x<100;//x, 100 den kucuk old. true ve aşagıya da yazxdıracak
        if (sonuc){
            System.out.println("yazdıracak");
        }

        sonuc=y>0;//evet 20, 0 dan buyuk, true old. aşağıya da yazdıracak
        if (sonuc) {
            System.out.println("yazdıracak");
        }

        //not: variable false ise if den sonraki body çalışmaz ama tabii ki degerlendirme yapmak için
        //if çalışır.
        /*
        Mesut
  1:39 PM
hocam boolean ı tam olarak anlayamadım, sadece if gibi mantıksal ifadelerde veya yapılarda mi kullanılıyor? tam mantıgını kavramak için ne yapmam gerekıyor.
white_check_mark
eyes
raised_hands





New


Ahmet Bulutluoz
  2:08 PM
evet oralarda biilean kullaniriz
2:08
ama sadece orada olmak zorunda degil
2:09
true veya false tutacak bir variable’a ihtiyac oldugunda kullaniriz
2:09
mesela bir okuldaki kayitlari dusun aktifMi diye bir variable olabilir
         */




























































































    }








}
