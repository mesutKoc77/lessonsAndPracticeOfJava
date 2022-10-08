package day15_whileLoop_doWhileLoop;

public class C06_DowhileLoop {
    public static void main(String[] args) {

        int sayi=10;

        while (sayi<14) //sayi 14 den kucuk oldugu muddetçe aşağıyı sureklı dondur.ornegin 10 u aldı. sordu 10<14 mu eve yanş
            //true o zaman loop çalıştrı daha sonra sayi yi yazdırdı ve aşagıya indi bir ekledi 11 oldu. aldı 11 i yukarı çıktı
            //ve ayni şekilde devam etti, true oldugu muddetçe yazdırdı. yani burda 14 e kadar 5 kere kontrol etti.
        {
            System.out.println(sayi);
            sayi++;
        }
        /*
        while lopp, loop sayısından bir fazla kontrol yapar. yani bu fazladan kontrol un onun gecebilmek için do while loop
        yapılabilir. yani önce yap sonra kontrol et, en aşağıya ben şartımı yapacagım. yani sen once yaz, aşağıda while da
        gordugun şart yerine gelene kadar yap demiş oluyorum.
        önce işlemi yapıyor sonra kopntrol ediyor. örnegin aşapıda 10 ile başladı direkt yazdıdrı bir attırdı 11 oldu
        kontrol etti 11 kucuk 14 dedi, yukarıda 11 yazdırdı ve bir attırrark 12 yaptı, 12 kucuk 14 true dedi ve yukarı
        çıkarak 12 yi yazdırdı, 12 yi bir attırrark 13 yaptı, 13 kucuk 14 true dedi ve 13 u yazdırdı,
        1 arttırdı ve 14 oldu şimdi geldi 14 kıucuk 14 olmadıgından hiç başa dönmedi. ve loop broken oldu.
        demek ki do da loop adedince kontrol var. fazladan kontrol yok.

         */
        sayi=10;

        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi<14);

        /*en azından bir kere yazsın diyorssn, do while loop tercih edilebeilir. ama şartı saglamıyrsa hiç
        bu konularar girmesin istiyorsan while loop kullanılabilir.

         */








    }
}
