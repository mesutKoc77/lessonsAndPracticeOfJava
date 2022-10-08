package day30_accessModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(10);
        System.out.println(sb.capacity());//10
        System.out.println(sb.length());//0

        sb.append("Ali Can");//10 sınırını geçmedigimiziçin kapasite aynı ama length 7
        System.out.println(sb.length());//7

        /*
        buyuk projelerde fazlaalıklar projemız için problemler oluşturabilir doalyısıylabu fazlalıklardan kurtulmak
        ve strıngbuilder degerinden fazla olanları silmek istiyrosam trimtosize methodunu kullanırız. fazladan
        kapasiteyi ilgili variable ın length ıne kadar getiriiyor
         */

        sb.trimToSize();
        System.out.println(sb.capacity());//7
        System.out.println(sb.length());//7

        StringBuilder sb2=new StringBuilder("Ali Can");

        //string builder == ile karşılaştrıılmaz

        System.out.println(sb2 == sb);//false

        System.out.println(sb.equals(sb2));//false, cunku equals da stringbuilder da duzugun çalışmaz

        System.out.println(sb.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("Ali Kan");
        System.out.println(sb.compareTo(sb3));//-8//compare to şunu yapıyor her bir string deki ilgili indeksteki
        //degerleri birbirleriyle karşılaştırıyor.1. indeks le 1. indeks mesela A yani ikisi de aynı ise ok diyor
        //0 yani hiç fark yok demenın anlamı 0 sıfır dır. burada ise -8 çıkmasının nedeni şu:
        /*
        karşılaştırıp ilk farklı harfler arasında kaç adet harf var sorusunu cevaplıyor. yani c ile k arasında 8 adet
        harf var.
         */
        /*
        ama burada biizm için onemli olan sıfır mı degil mi? sıfrı degilse eşit degil
        sıfır sa iki String builder aynıdır diyecegız
         */








    }
}
