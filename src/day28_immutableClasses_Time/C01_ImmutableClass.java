package day28_immutableClasses_Time;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1="Seher";

        String str2=str1;

        String str3="Se"+"her";

        String str4=new String("Seher");

        String str5="Se";
        String str6="her";
        String str7=str5.concat(str6);
        /*
        string deki == hem metne hemde referaansa baktıgından bazen false verir bundan oturu equals methodunu kullnam
        mak daha elverişlidir.
         */
        System.out.println(str1==str2);//true
        System.out.println(str1 == str3);//true
        System.out.println(str1 == str4);//false
        System.out.println(str1.equals(str4));//true

        System.out.println(str1 == str7);//false
        System.out.println(str1.equals(str7));//true

        System.out.println(str1 == "Seher");//true

        System.out.println(str4 == str7);//eşitilin sagında method oldugundan ve degerinş hemen bilmediginden
        //hemen farklı bir obje oluşturduru ve aynı havuuzn içeriisnde barındırmaz.aynı havuz içersinde de olmadıgı
        //ndan false olarak görür.
        /*
        bakın bazen true bazen false veriyor. bu sorunu çözmek için java, striing için özeli bir çözüm üretmiş
        //ve buna string havuızu ismi vermiştir.
        String yaparken önce variable ismi(yani referans) sonra onun point edecegi degeri oluşturur ama obje de
        bildigimiz gibşi eşitlign once sagı yapılırdı. once eşitliğin sagını heap memory e olulştururu saha
        sonra stack memory de olşturdugu varriable ismine point eder.
        java once eşitliğin sagını yapar.
        java referansın işaret ettiği degerin önceden var oldugunu kopntrol eder varsa eski referansın altına
        yani stack teki eskli referansın altına yeni referansı yazar ve heap memory de ki degeri gosteren ok her
        iki referans için çalışmış olur. yani Stgring once havuzu kontrol eder o deger var mı yok mu diye.
        ama eşitilin sagında method varsa bu durumda java methodun sonucunu bilemedigiden once obje yi hemen oluştu
        rur ve ilgili referansı ona atar.
        bu duurmda sag tarafınd a method olanlarda yeni obje oluşturdugundan bunları == ile karşılaştırdıgında
        aynı ok bunları işaret etmediginden iismiler aynı olsa bile == bunları false gösterir.
        yani java String için bir pool oluşturur ve burada degerlenkdiri.
        havuz yani pool dan kasıt aynı ok a sahip ler aynı kare nin aynı bolgenin içindeler anlamında.
        farklı havuz da iseler java == ile false verir.
         */

    }
}
