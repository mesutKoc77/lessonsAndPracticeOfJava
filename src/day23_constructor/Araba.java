package day23_constructor;

public class Araba {

    /*
    biz göremesek de her class içinde obje oluşturmak için constructor
    bulunur.

    bu gorunmeyen condtruxtor a default constructor denir.
    default constructor, obje nin hiçbir şeyini degiştirmeden instance
    variable degerleriyle obje oluştururur.

    defaut constructor parametresizdir ve body sinde hiç kod bulunmaz.

     */
String model;
String marka;

/*
yok gibi gorunse de constructor, mutlaka gorunmeyen bir
constructor vardır. Ve bu default constructor dır.
Default constructor şu şekildededir:
 */
    Araba(){
        /*
        kendimiz elimizle constructor eklersek buraya, buna
        parametresiz constructor denir, default constructor
        denmez, çünkü default constructor gorunmeyip, java nın
        arka planda çalıştırsıgıdı constructor dır.
        default olana kod vb eklenenmez ama kendi elimizle
        oluşturdugumuz consrtructor da iise yani parametresiz
        constructor da, sonradan kod eklenebilir.

         */
    }

    Araba(String model){
        /*
        ellerimizle constructor yaparsak default construr silinir.
        eger once default constructor ile bir obje yapmıs isek ve sonra
        dan elimizle parametre eklersek, class da cte vermese bile
        bununla oluşturrulan obje nin bulundugu class da cte verir.
        cunku kullanılan default constructor artık olmayacaktır.

        bir class da herhangi bir parametrelki constructor oluşturrusak
        diger class larda sorun oluşturmaması için default constructor
        yerine manuel parametresiz constructor oluşturmalıyız.


         */
    }





}
