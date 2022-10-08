package day27_passByValue_immutableClass;

import java.util.Arrays;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        onemli not: methoda gonderilen obje tek bir deger içeren primitive data turu ise java bunundegişitirilmesine musaade
        etmez.

        list veya array gibi birden fazla deger barindıran bir obje ise methoda gönderilen, eger bunlara yeni bir deger atanıyprsa
        java bunu kabul etmez. yani objemize başka bir objenin veya degerin atnamsına itiraz eder java ve kabul etmez.

        burada temel mesele objenin yekünüdür yoksa java objenin içöindeki element ile ilgilenmez yani objeniin elemnentlerini
        degiştirdin veya yeni bir deger atadın buna java ititraz etmez. cunku elementlere yapılan atamalar obje ile ilgili
        degildir.

        bu bir istisna degil, kapsam disi durumdur.


         */

        //bir onceki soruda yapılan işlemleri array için yapalım

        int [] arr={1,2,3};

        System.out.println(Arrays.toString(arrayiDegistir(arr)));//[10, 11, 12, 13, 14]

        System.out.println("ilk methoda yollayıp geldiktem sorna:"+ Arrays.toString(arr));//[1, 2, 3]
        /*
        arrayi degiştir methoduma arrayımı yolladım ve bana arrayimin methoddaki value sini verdi(1.sout) ve fakat arabanın
        kendisini yani arr nin kendisini degiştirmedi(sout 2) passByValue den oturu.
        aslında methodun içinde arr in içinde kesinlikle degişkik yapmayıp başka bişr arrayi başka bir variable ı
        kendi asıl arrayımıza atadık. methodda bu kabul edilebilir ama main methopdun içine gelip asıl variable ımı
        degiştirdim mi siye sordum da hayır cevabını alacagım. yani main methodun içinde asıl variable ıma başka bir şeyi direkt
        koyamam, yani toyota yı yıne bana geri ver deriz. toyota yı al volvo yu ver diyemeyiz.

        Eger arrayın kendisine yani objenin kendisne yeni bir degeer atamsı yapılmaya kalkılırsa java bunu kabul etmez.

        Ama ilgili objenin elementlerini degişitmek için methoda yollasam bunu java kabul eder ve yeni deger olarak da
        methoddan doneni alıp kabul eder.
        cunku ikinci methodda arr ye hiçbir şekilde başka bir obje veya variable atanmıypr yine kendisie kendisi atanıypr
        doalyısyla java itiraz etmiyor.
        */

        //peki elemntleri degiştirsem


        System.out.println(Arrays.toString(elementleriDegistirelim(arr)));//methodda işlendikten sonra ne oldu?[5, 6, 7]
        System.out.println("elemenleri degiştirdikten sonraki Arrayimin Asli ne oldu :"+ Arrays.toString(arr));//[5, 6, 7]



    }

    private static int[] elementleriDegistirelim(int[] arr) {
    arr[0]=5;
    arr[1]=6;
    arr[2]=7;
    return arr;
    }

    public static int [] arrayiDegistir(int[] arr) {

        int[] yeniArray={10,11,12,13,14};
        arr=yeniArray;
        return arr;
    }
}
