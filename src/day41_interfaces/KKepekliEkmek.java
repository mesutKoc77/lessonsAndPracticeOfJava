package day41_interfaces;

public class KKepekliEkmek implements I01_InterfaceEkmek, I02_unluMamuller {
    //bir claass ı bşr interface e child yapabilmek için implements keyword u kullanılır.


    @Override
    public void un() {
        System.out.println("kepekli ekmekte %30 kepek iceren un kullanilir");
    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmekte binde 1 oraninda maya kullanilir");
    }

    @Override
    public void bicim() {
        System.out.println("Kepekli ekmek farkli bicimlerde olabilir");
    }

    @Override
    public void gramaj() {
        System.out.println("Kepekli ekmek farkli gramajlarda olabilir");
    }


    @Override
    public void yabanciMadde() {

    }

    @Override
    public void standartNo() {

    }

    /*
    mesela biz Dizel, Sedan, Otomatik vites bir araba uretmek istiyoruz. burada biz üretmek istedigimiz araba class ımızı
    bu durumda " Dizel, Sedan, Otomatik vites " interfacelerine implement edersek o zmaan direkt ilgili özellikleri
    yani şablon özellikleri bize getirecektir. mesela Dizel interface indeki özellikleri hemen kendisine implement eder.
    yani biz her dizel bir araba uretmek istedigimizde ozellikleri neydi diye dusunmemeize gerek yok, dizel interface ine
    gideriz ordaki özellikleri class ımıza implement edebiliriz.

     */





}
