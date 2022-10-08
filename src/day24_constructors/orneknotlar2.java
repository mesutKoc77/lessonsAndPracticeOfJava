package day24_constructors;

public class orneknotlar2 {

    String isim="John Doe";
    int yas=40;

    public orneknotlar2()//adı class adı ile aynı ve return type ı yok o halde bu constructor dır
    {
       isim="Seher";//burda yani bu scope isim variable ı var mı ? yok. o zmaan class levele a bakarız.
        yas=38;
    }

    public orneknotlar2(String isim, int yas)//adı class adı ile aynı ve return type ı yok o halde bu constructor dır.
    {
        this.isim=isim;
        this.yas=30;
    }

    public static void main(String[] args) {
        orneknotlar2 obj1=new orneknotlar2();
        orneknotlar2 obj2=new orneknotlar2("Fatih",35);

        System.out.println(obj1.isim + obj2.yas);
    }
    /*
    ilk olarak main e gittik
    bir obj1 e baktı. sagında constructır ama parametresiz o hLDE HEMEN yukarıdan parametersezi constructor ı aradı ve
    buldu. once class level daki instance variable ları atadı. yani isim john doe yas 40 yaptı ama sonra
    suslu parantezin içindeki degerlerini atadı.john doe yu sıldı Seher yaotı.
    bu scope da yas variable ı var mı*. yok o zmaan class level a gitti ordaki yas ı aldı. 40 idi ama suslunun içinde
    38 atandıgından 38 oldu.
    işi bitti
    şimdi obj2 ye gecti her zaman ki ilk once instance variable ları atadı. isim john doe yaas da 40
    ama adım adım gittginden ismi siler fatih yapar saha sorna 40 siler 35 yapar daha sonra suslunun içine giirp
    ordaki degerleri atar. isim=isim dediginden fatih kalır yas da 30 dedignden 30 olur artık yş

    sonuc olarak ne zaman obje oluşturursan oluşturu. o obje nın class ındaki instance variable lar her zaman öncelikle
    deger olark atanır
    yukarıdan aşağı degil her bir constructor bitttignde main in içerisine gideriz.
    obj1 mesela consructor a gittik sonra o bitti
    yeniden main e gittik, main den aldık constructor a gittik
    o da bitti mainin içine gidip soutu yazdırdık.

    Not: this ile instance variable ına işaret ediyoruz ve onun degerini de parametre olarak yollananına da yani pa-
    rantez içini de deger olarak atıyoruz.

     */






}
