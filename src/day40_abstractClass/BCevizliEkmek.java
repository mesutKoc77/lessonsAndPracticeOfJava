package day40_abstractClass;

public class BCevizliEkmek extends AEkmek{

    public static void main(String[] args) {
        /*
        klasik inheritance ile child class ların kendilerine has özel methodlar oluşturmaya zorlayamazsınız.
        zaten child class lar, parent taki methodları override ederek kendilerine uyarlayabilirler.
        istemeseler de zaten parenttakini direkt alırlar.
         */

        BCevizliEkmek ekmek1=new BCevizliEkmek();
        ekmek1.bicim();
        ekmek1.gramaj();
        ekmek1.maya();
        ekmek1.un();
        ekmek1.tuz();




    }









}
