package day28_immutableClasses_Time;

public class C02_Immutable {
    public static void main(String[] args) {
        String a="2";
        a+='c';
        a+=false;

        System.out.println(a == "2cfalse");//false//burada surekli atamalarla geldıgı için 2cfalse a eşittir demez
        //tek seferde atamış olsa idik oz aman aynı yapardı. referans once 2 yi sonra 2c yi sonra da 2cfalse işaret
        //etti. yani farkli işlemlerden geçtiği için eşit yapmaz onu.

        //meselea

        String b="2cfalse";//true. burada b referansı direkt 2cfalse u isaret etti.
        System.out.println(b == "2cfalse");//true

        String c=""+2+'c'+false;//true//burada da c referansı direkt 2cfalse u işaret etti.


        String str="";

        for (int i = 1; i <=100 ; i++) {
            str+=i;
        }
        /*
        burda 101 adet obje oluşturru java. once stack memory de hiçlik objesini daha sonra da i nin aldıgı
        degerler çerçevesind yeni objeleri oluşturur.
         */







    }
}
