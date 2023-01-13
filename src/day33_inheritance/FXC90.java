package day33_inheritance;

public class FXC90 extends DVolvo {
     String model="XC90";

     FXC90(){

     }
     FXC90(String renk){
         System.out.println(renk+" renginde bir"+model);
     }
     FXC90(String renk, String yakit){
         //super(String renk, String yakit);--parent class da yok ondan dolayı CTE.
         this("mavi");//this. dersen class seviyesindeki variable lara, this() dersen de ilgili constructor lara
         //erişebilrisin.
         //biz buraya this yazıp constructor cagırdıgımızdan
         //ve bir sonstructor ın içinde bir tane constructor
         //call olacagından super constructor da öldü.
         //this ile super arasında soyle bir fark var.
         //    this, içinde bulunulan class da ilgili constructor ı
         //    her zaman arar. hemen yukarı yani bu class da
         //bir tane paramteresi olan constructor var mı? evet var
         //ve aldı yazdı.ama tabii ki o constructor ın ilk satırında
         //gprunmez super constructor oldugundan onu yazacak once.
         System.out.println(renk+" renginde bir"+yakit+"li"+marka);
     }

    public static void main(String[] args) {

         FXC90 arb1=new FXC90("kirmizi","benzin");


    }
    /*
    extends keyword kullanılan bir class da kullanılan
    her bir constructor ın ilk satırında parametresiz
    super sonstructor vardır. ve bu bizi parent class
    yonledırıp ordaki parametresiz constructorı işleme
    sokar.
    evet biz child class yani extends keyword un oldugu
    class taki constructorın ilk satırına farklı constructor
    call yazabilirim ama bu tabii ki yani constructor call
    parent taki constructor yapısıyla aynı olmalı. yani iki
    paretemtreli constructor call yazıp parent da bu yoksa
    yani iki paremtreli constructor yoksa o durumda
    java hata veecektır.
    dikkat edecegımız ne yani?
    1- yaptıgımız constructor call, parent da yoksa CTE
    oluşur.
    2- bir constructor ın içinde super() dışında bşr constructor call
    yaparsak bşşr constructor ın içinde 1 tane constructor call
    yapılacgından super () silinir.
    3- her constructor da super olmak zorunda degil
    this () de olabilir.
    this () içinde bulundugumuz class taki constructor ı çalıştırır
    super() ise parent taki constructor ları çalıştırır.
     */


}
