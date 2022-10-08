package day09_stringManipulations;

public class C01_concetanation {
    public static void main(String[] args) {
        //no 54

        String a="Java";
        String b="Guzeldir";
        String c="";
        String d=" ";

        int s=5;
        int t=4;

        //sadece yukarıdaki variable ları kullanaarak

        //Java Guzeldir 9 yazdıralım

        System.out.println(a+d+b+d+s+t);//burada sondaki s ve t sayı ama string onu da string leştirecegı için
        //54 yazacaktır. Sonuc olara Java Guzeldir 54

        System.out.println(a+d+b+d+(s+t));// ama işlem onceliği yapar ve int leri toplayıp 9 u elde
        //edersek sonra onu yazıya yapıştırır ve hedefimize ulaşırız. Java Guzeldir 9

        //gelelim konumuza.
        //concat: stringleri yan yana getiren bir foknsıyondur.hepsinin string olması gerekiyor
        //eger int ları, string e cevirmek istersek bir hiçlik string ile çarpar ve bunu stringleştirip
        //ifade yi de degiştirmemiş oluruz

        //Java Guzeldir 9 yazdıralım şimdi

        System.out.println(a.concat(d).concat(b).concat(d).concat(s+t+c));//bu en sonda s ile t yi toplayıp
        //atamak istedim ama concat dedi ki ben string istiyorum ve onu hiçlik olan string ile çarparak
        //string leştirdim.
        //sonuş olarak concat iki veya daha fazla String i birbirine bağlar.
        System.out.println(a.concat(d).concat(b).concat(d).concat(c+s+t));//burda en sondaki concat ta önce string
        //olan ve hiçlik c yi getirdim ve string herşeyi stringleştirecegi için s ve t de stringleşti ve 9 yerine
        //54 oldular. ama bir onceki soutta önce toplama yaptı cunku sonradan string geldi. sonradan stringi
        //getirmemmin nedeni ise 9 u stringleştirip yapıştırmak.

        String deneme=s+d;

        System.out.println(deneme+"t");//burda int i string leştirmek için onunla string , toplayıp deneme variable
        //ını stringleştirdim ve "5 boşluk" stringini alde ettim.

        //ama biz hem 5 hem de bunun string olmasını istiyorsak, int string e atanamayacg için hemen hiçlik ile yani
        //5 değiştirmeden stringleştiririm. Aşağıdaki ornek gibi.

        deneme=s+c;
        System.out.println(deneme+"a");//ve burda 5 i stringelştiirdik,











    }
}
