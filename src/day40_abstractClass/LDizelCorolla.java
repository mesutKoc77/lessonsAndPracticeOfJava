package day40_abstractClass;

public class LDizelCorolla extends HToyota{


    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public void model() {

    }

    @Override
    public void uretimYeri() {

    }

    /*burda marka htoyota da override edildigi için ve artık
    concrete oldugu için
    grandparenttaki bu methodu uyarlama zorunlulugu
    da kalmadı.
    yani abstract bir silsileden gelen concrete bir class abstract
    olan tum methodları kendisine uyarlamak zorundadır ama bır tanesi
    dahi concrete edilmişse onu artık uyarlama zorunlulugu kalmaz.
    */


    public static void main(String[] args) {

        //garaba cclassından bir obje oluştrulaım.

        //GAraba objAraba=new GAraba();----grabaa abstract class oldugundan obje uretilemez
        //HToyota objToyota=new HToyota();-----htoyota abstract class oldugundan obje uretilemez




    }


}
