package day09_stringManipulations;

public class C05_indexOf {

    public static void main(String[] args) {
        //no 58

        String str="Java cok guzel,cok.";
        //index of aranan karakterin ilgili degerdeki index ini diğer bir deyişle hangi yer veya sırada oldugunu verir.
        //aranan karakter, degerin içinde bir kaç tane ise ilk buldugunun index ini yazdırır bize.

        System.out.println(str.indexOf('a'));//burda a nın index ini sorduk. buldugu ilk a nın index ini verdi//1
        //yani a nin karşılık geldigi karakter sırası 1.

        //eger 1. indeks ve sonrasındakinden sonraki a nın index ini ver deseydi.
        System.out.println(str.indexOf('a', 1));//e zaten birinci index a, a ve sonrasındaki ilk a da baş
        //taki a oldugundan bir yazdıracaktır.
        //burda onemli nokta, bir ve sonrası dediğinde biri dahil ettireceksin.

        System.out.println(str.indexOf('a', 2));//3


        System.out.println(str.indexOf("cok"));//5//j sıfır dedi ve saymaya başladı, cok taki 'c' nin denk geldigi
        //index cok un da indexi oldu. yani 5

        //peki başka cok var mı diye sorsak, ama string bu. hemen fromindex bolumune ilk buldugu cok un tekabul
        //ettigi değerden bir sonrası için bir attırıp yazacagız.

        System.out.println(str.indexOf("cok", 6));// cevap: 15 ...altı ve sonrasından  yani "ok guzel,cok."
        // itibaren ara ve karşına gelen ilk "cok" un index ini soyle. birinci cok un index i 5 idi, burda fromindex 5 deseydik ki
        // fromindex kendisini dahil ederek başalttıgından yşne kendisini yazacak ikinciye gecemeyecektik. Dolayıysla bir
        // fazlasını aldık ve ara bul dedik



        /*önemli not
        bir ifadein ilgili stirng de olup olmadıgını anlamak için indexof un içine hedef string yazıdırılır
        -1 donerse, string in  içinde bu hedef string in olmadıgı anlamaına gelir.
        yani genel olarak  -1 in anlamı hedef string, ilgili string in içinde mevcut degıl anlamı katar.
         */
        //ornek

        System.out.println(str.indexOf("Soner"));//str nin içinde soner var mı? -1// yani yok

        System.out.println(str.indexOf('t'));//-1

        /*yukarıdakı str cumlesiinin f harfi içerip içermediğini
        index of kullanarak yazdıırın.
         */

        int index=str.indexOf("f");
        if (index==-1){
            System.out.println("f yok");}
        else {
            System.out.println("f var ");}


        ////Önemli Not: metotları atarken, ornegın indexof yazar yazmaz hemen altta secenekler geliyor
        //en soldaki bize, bana int, char vb atayabilirsin derken, en sagdaki ise ben bunun degerini int, string
        //olarak sana dondururum der. dikkat çok onemliiiiiii

        ///////////////////////////////////

        String str2="Sev seni seveni ";

        System.out.println(str2.indexOf('e')); //burda şunu sorduk ilk e nin kaçıncı sırasda oldugunu soyle ve 1 dedi
        //peki 5. index ve sonrasındaki e nin indeksini soyle desek

        System.out.println(str2.indexOf('e', 5));//5//önce beşinci indeksi buldu ve= 'e', zaten sorumuz da
        //bana 5. indeks ve sonrasındaki 'e' yi getir idi, 5. indeksimizden başladı hemen karşısına  'e' çıktı ve
        //toplam içindeki index karşılıgının 5 oldugunu yazdı.

        System.out.println(str2.indexOf('s', 5));//9//bunun anlamı şu: String in içinde çok fazla "s" var,
        //sen bana beşinci indeks ve sonrasında bulunan 's' nin toplam içindeki index karşılıgını ver.








    }
}
