package day26_staticKeyword;

public class C01_StaticKeyword {

    static int sayi = 10;
    int no = 20;

    public static void main(String[] args) {
        C01_StaticKeyword obj1 = new C01_StaticKeyword();//eşitligin sagında default constructor var ve obje oluşturduk hemen
        //bunun için class level daki ınstance variable ları once obje 1 e atadık. obj1 in no su 20;
        //ama static olanlar objelere baglı olmadıgından onlar için ayrı bır class sekli çizip ona static olanları atayacagz
        //sadece sayi variable ı var ve onun degeri de 10;
        obj1.no = 21;
        obj1.sayi++;//diyor ki static lere obje oluşturmadan da ulaşabilirdin; ustunu çizmesinin nedeni bundan dolayı.

        System.out.println(obj1.no + "," + obj1.sayi);//21,11

        C01_StaticKeyword obj2 = new C01_StaticKeyword();
        obj2.no++;
        obj2.sayi++;
        System.out.println(obj2.no + "," + obj2.sayi);//21,12//static variable lar class için bir tane olurve onlar için bir
        //şekil çizilmişsse bir daha tekrar tekrar çizilmesine gerek yoktur. ama obj için tabi ki intance variable lar
        //çizilir.

        C01_StaticKeyword obj3 = new C01_StaticKeyword();
        obj3.no++;
        obj3.sayi++;
        System.out.println(obj3.no + "," + sayi);//21,13//intance lar degişmedi hemen class level daki sabit instance
        //variable degerlwerini aldı ama static variablelar yukarıda degişmişsse tabiii ki degişki deger uzeırnden
        //işlem goreceketir. mantıken hastanenin ismi degişmişsse bir hemşire içini tabbi ki çalışan her hemşire için
        //de degişmiş olacaktır.
        C01_StaticKeyword obj4 = new C01_StaticKeyword();//instancelara gittim obj4 un no su20, sayi static ve degişmişti
        //sayi=13 idi.
        obj4.no = 25;//ama yeni degerlerini atadık
        sayi = 35;// System.out.println(obj4.no+","+sayi);static e de deger atadık.sayi=13 idi.
        //25,35//dikkat edersen sayi staticoldugu için sout bolumunda obje uzerınden
        //çağırmamızıaa da gerek olmadan direkt çagırabliyoruz. yani sayi diyerek diretk çağırdım
        System.out.println(obj1.no + "," + obj1.sayi);//21,35
        System.out.println(obj2.no + "," + obj2.sayi);//21,35

    }


}
