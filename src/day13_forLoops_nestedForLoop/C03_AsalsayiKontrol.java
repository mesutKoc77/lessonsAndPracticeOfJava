package day13_forLoops_nestedForLoop;

import java.util.Scanner;

public class C03_AsalsayiKontrol {
    public static void main(String[] args) {

        /*
        Kullanıcıdan sayı alın, asal sayı olup olmadıgını kontrol ediniz. kendısı ve 1 dışında poztif tam sayıya bolunemeyen.
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz");
        int sayi=scanedilen.nextInt();
        boolean asal=true;//asal variable ı bir flag dir. yani yanlışı gordugu an bayragı kaldıracak. ve durdurcak. yani bir kere
        //asal variable ın false oldugunu gorur gormez hemen bayragı kaldırıp bunu true degıl false yapıp asal degıl sonıucunu
        //çıkartacagm.

        /*
        aldık sayıyı 2 ye bolecek asal mı degıl mı? 3 e bolecek asal mı degıl mı?
        bu işlemi kendisinden bir öncsine kadar surdureecek.
        her bır işlem de bana asal mı olup olmadıgını belirtecek
         */
        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0) //sayiyi aldık kalan 0 sa aşağıya indik ve asal mi false oldu. yani 8 i aldık. hemen 2 ile başladık
                //kalan o oldugundan hemen aşağıya indi ve asalmi sorusuna false yani hayır dedi. Ve durdu. 7 yi aldık
                //2 ye bolduk kala 0 değil, 3 bolduk kalan 0 değil,......hepsinde kalan 0 değil. o zaman
                //asal mi ya true degerini atadıgımzdan şimdi aalmi=true degernin sout unu ekrana yazdıracak.
            {
              asal=false;//ben asal a true degerinşi atamıştım. ama burda şunu soyledım EGER sayi bolu i kalan 0 ise
                //asal degerin artık false olacak. //onemli. atıyrm 18 is aldım 2 ye boldum kalan 0 ve hemen aşağıya indim.
                //asal variable ına flag atadım ve dedim ki hemen true dan false cevir ve durdurarak ASAL DEĞİL de.

                break;//şimdi biz 18 sayıısnı ele alalım. 2 ye boldu kalan o ve asal degıl ama dur atık demedıguımuz için
                //3 den sonra 4 e gdecek yine kalan sıfır bu sefer yine asal değil diyecek ve srekli devaö edecek ama bana
                //bir kere kalan 0 sa yeterli idi sonuca ulaşmam için. ondan dolayı diyorum ki i yi aldın 4 e kadar geldin ve
                //kalan 0 ı orda buldun o zmaan hemen dur dedin ve bititp sonuca ulaştın.

            }
        }
        if (asal)//asal degılken ki yazılaagı for loop un içeriisnde yazdırmıştım şimdi ise asal iken yazılacagı belirlemem
            //gerekiyor
        {
            System.out.println("Girdiginiz Sayi asal sayi");
        } else {
            System.out.println("asal sayı degil");}

        // 25457 2==> 25456'ya kadar her hangi bir sayiya bolunurse
        // asal olmadigini anliyoruz
        // bunu Javanin da anlamasini saglayalim
        // bunu javanin anlamasi icin bir bayrak kullanabiliriz
        // bayrak degisti ise istenmeyen durum gerceklesti demektir

        /*

        yani ortaya bir kural koyuyorsun ama bunu sen biliyorsun kuralı. Bu kuralı java nın da bilmesi gerekiyor.
        o'na şunu demen gerekiyor. kalan 0 sa hemen ona asal flag ım degıştı ve true dan false a döndü dmeen gerekiyor.

         */









    }
}
