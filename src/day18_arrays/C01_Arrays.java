package day18_arrays;

public class C01_Arrays {

    public static void main(String[] args) //main methpdumuzun çalışması için gerekli olan string lerden oluşan bir
            //array mış bu methodumuz.
    {
        /*
        array aynı cinsten, aynı data turlerınden degerleri barindırır. ve bu arryaların kac tane eleman
        barindrirdigina da ayrıca  mutlaka soylememeiz gerekiyor.
        bu array ın içerisidne hangi data turunde elemeanlar var?
        1-
        köşeli parantez basti bir variable degil, içinde birden falza x primitve data turunu barıncıran bir
        array oldugunu
        gösterir java ya.. köşeli parantez sadece array a hastır. yani array ın hangi data turunu barıdnrıdıgını
        deklare edecegız.
        2-
        ikinci olarak da kaç tane yani bu arrayın length ını deklere etmemeiz gerekiyor.
        bu ıkısı mutlaka deklere edilmeli yoksa olmaz.
        not: array ın ıceriisinde farklı data turleri bulunamaz.
        arrayler primitive data turlerinin degerlerini tutarken, non primitive lerin ise referanslarını barındırır.
        oluşrutlan bir arayın uzunlugu sabittir degişmez.
        obje oluşturulurken new kelimesini kullanırız yani yeni bir obje oluştrudugumuzu gösterri.

        primitve ler stack memorty de non primitve le rise heap memory de hafıza edilir. ayrıca steak memory de
        non primmitive lerin referansı olur. degerleri ise heap memory de bulunur.
        bir objenin tam anlamıyla oluştu diyebilmemiz için sadece referans degil ayrıca ona deger de atmaak gerkiyor
        ancak deger atandıgı zaman stack memory de ki referasn, heap memory deki degerle eşleşir ve obje oluşur.

        bir array e iki şekilde deger atanır
        ya idrekt deger atarssın int [] arr={1,2,3,8,99} gibi [1,2,3,8,99] işte degerleri bunlar. burada elemanlar belli.
        veya array ın uzunlugunu belirtirsin ama degeri sonradan atarsın
        int [] arr=new int [5]; yani ben 5 elemanlı int bir deger oluşturdum ama sonradan bunların degerlerini atayacagm.
        deger atamadıgın mudddetçe Java onalra has, default degerleri atar. scope da oldugu gibi.

        string array lerde, java ilgil index gidip direkt o indeksin karşılıgını getirmez, önce o indekse gider
        indeksteki referansı bulur ve onun karşısındaki degeri alır getirir.

        int [] arr={2,3,4}; de sıfırıncı indeksin karşılıgını irekt alır geitir ve 2 der.
        String [] str={"A", "B", "C"} de ise sıfırıncı indeks dediginde önce sıfırıncı indeksin referansını bulur daha
        sonra bu referansın karşılıgında ne varsa onu alır getirir.




         */
        System.out.println("Hello World");

        String str="Java Candir";

        System.out.println(str.length());//11//burada length bir method idi ama array da ise degil. şoyle ki:

        int [] arr1={3,5,7,8};
        System.out.println(arr1.length);//bir method degil bir degerdir.//4

        //array de ilgili indeks e daha farklı sekilde ulaşırız. direk köşeli parantez ile bunu çözeriz.

        System.out.println(arr1[1]);//5

        //8 i silip 10 yazalım

        arr1[3]=10;
        System.out.println(arr1[3]);//10 oldu artık.

        //System.out.println(arr1[5]);//ArrayIndexOutOfBoundsException, sınırların dışından deger isteyemezsin

    }








}
